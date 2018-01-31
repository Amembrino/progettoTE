package gestRegTir;

import java.sql.Connection;
import java.sql.DriverManager;
 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import Db.Connector;
 
import gestRegTir.ListaRegistri;
import gestRegTir.Registro;
 
/**
 * Classe RegistroDAO, si configura col database per gestire il registro di tirocinio.
 */
public class RegistroDAO {
  String ip = "localhost";
  String port = "3306";
  String db = "tirocinioeasy";
  String username = "root";
  String password = "root";
   
  /**
* Costruttore nullo.
*/

  public RegistroDAO(){
  }

  /**
 * Prende in input un riferimento al tirocinante e restituisce l'identificativo 
 * del suo registro di tirocinio.
 * @param tirocinan Indirizzo email del tirocinante.
 * @return id Identificativo del registro di tirocinio.
 * @throws SQLException Gestisce errori nelle interrogazioni al database.
 */

  public int  selectId(String tirocinan) throws SQLException {
    int id = 0;
    Connection newConnection = Connector.getConnection();
    java.sql.Statement st  = newConnection.createStatement();
    String sql = "  SELECT ID_Tirocinio FROM registro_tirocinio where Tirocinante_Email='"
        + tirocinan + "';";
    ResultSet rs = st.executeQuery(sql);
    while (rs.next()) {
      id = rs.getInt("ID_Tirocinio");
    }
    rs.close();
    newConnection.close();

    System.out.println(id);
    return id;
  }

  /**
 * Metodo che restituisce l'identificativo dell'attività inserita nel registro.
 * @return idA
 * @throws SQLException Gestisce errori nelle interrogazioni al database.
 */

  public int ID_att() throws SQLException {
    int idA = 0;
    Connection newConnection2 = Connector.getConnection();
    java.sql.Statement st2  = newConnection2.createStatement();
    String sql2 = "SELECT MAX(ID_Attività)AS ID FROM `attività`";
    ResultSet rs2 = st2.executeQuery(sql2);
    while (rs2.next()) {
      idA = rs2.getInt("ID");
    }
    rs2.close();
    newConnection2.close();
    return idA;
  }

  /**
 * Inserisce una nuova attività nel registro.
 * @param ore Durata della nuova attività (espressa in ore).
 * @param data Data dell'attività svolta.
 * @param comm Descrizione dell'attività.
 * @param id Identificativo del registro di tirocinio.
 * @param Att Identificativo dell'attività.
 */

  public boolean compilaRegistro(int ore, String data, String comm, int id, int Att) {
  
	boolean  att= false;
    Connection conn = null;
    Statement stmt = null;
    String sql = " INSERT INTO  attività  (ID_Attività, Data, Ora,"
        + " Descrizione, Registro_TirocinioID) " + "VALUES ('" + Att + "','"
        + data + "','" + ore + "','" + comm + "','" + id + "')";
    try {
      conn = Connector.getConnection();
      stmt = conn.createStatement();
    if (!(comm.isEmpty()) || ore>0   ){
    
    	int x = stmt.executeUpdate(sql);
    
        att = (x > 0); 
    }
    stmt.close();
    conn.close();
    
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println(sql);
    return att;
    
  }

 
  /**
 * Seleziona i registri di tirocinio che interessano un determinato tutor aziendale.
 * @param listaReg Lista dei registri di tirocinio del tutor aziendale.
 * @param mail Indirizzo email del tutor aziendale.
 */
  
  public void  fillListaRegistri(ListaRegistri listaReg, String mail) {
    Connection newConnection = Connector.getConnection();
    try {
      java.sql.Statement st  = newConnection.createStatement();
      String sql = "select * from registro_tirocinio where Convalida= 0"
          + " and Tutor_Aziendale_Email='" + mail + "' ";
      ResultSet rs = st.executeQuery(sql); 
      while (rs.next()) {
        int ID_Tirocinio = rs.getInt("ID_Tirocinio");
        Date Data_Attivazione = rs.getDate("Data_Attivazione");
        int Convalida = rs.getInt("Convalida");
        String Tirocinante_Email = rs.getString("Tirocinante_Email");
        String Tutor_Aziendale_Email = rs.getString("Tutor_Aziendale_Email");     
        Registro reg = new Registro(ID_Tirocinio,Convalida, Tirocinante_Email,
            Tutor_Aziendale_Email);
        listaReg.aggiungi(reg);
      }
      st.close();
      newConnection.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
 * Metodo che serve al tutor aziendale per convalidare un registro di tirocinio.
 * @param id Identificativo del tirocinio.
 */   

  public boolean convalidaTaz(int id) { 
    Connection newConnection = Connector.getConnection();
    boolean action = false;
    try {
      String sql = "UPDATE registro_tirocinio SET Convalida="
          + 1 + " WHERE ID_Tirocinio=" + id + " ";
      Statement st = newConnection.createStatement();
      int count = st.executeUpdate(sql);
      action = (count > 0);  
   
      System.out.println(sql);
      st.close();
      newConnection.close();
    }catch (Exception e) {
      // TODO: handle exception
    }
    System.out.println(action);
	return action;
  }
}