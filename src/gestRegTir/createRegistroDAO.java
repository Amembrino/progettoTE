package gestRegTir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import Db.Connector;

import bean.Azienda;
import bean.ListaAziende;
import bean.Tirocinante;
/**
 * Classe createRegistroDAO, si configura col database per inserire un nuovo registro di tirocinio.
 */

public class createRegistroDAO {
  String ip = "localhost";
  String port = "3306";
  String db = "tirocinioeasy";
  String username = "root";
  String password = "root";

  Statement st;
  ResultSet rs;
  String Tirocinante;
  String Tutor_Aziendale_Email;
  String data;
  /**
 * Costruttore nullo.
 */

  public createRegistroDAO() {
  }

  /**
 * Metodo che preleva i dati inseriti nella domanda di tirocinio.
 * @param id Identificativo della domanda di tirocinio
 */
  
  public void getDatiDomanda(int id) { 
    Connection con = Connector.getConnection();

    String query = "SELECT * FROM domanda_di_tirocinio WHERE Id_Documento=" + id;
    try {
      java.sql.Statement stmt = con.createStatement();
      rs = stmt.executeQuery(query);

      while (rs.next()) {
        Tirocinante = rs.getString("TirocinanteEmail");
        Tutor_Aziendale_Email = rs.getString("Tutor_Aziendale_Email");
      }
      stmt.close();
      con.close();
    } catch (Exception ex) { 
      System.out.println(ex);
    }
    /**Istanzia un oggetto Registro con i dati prelevati.*/
    Registro rg = new Registro(id,0,Tirocinante, Tutor_Aziendale_Email);
    /**Preleva la data odierna dal Registro creato.*/
    data = rg.getData();
  }

  /**
 * Metodo che istanzia un registro di tirocinio all'interno del database.
 * @param ID_Tirocinio Identificativo del registro di tirocinio.
 * @param Convalida_Tutor_Az Campo convalida del registro da parte del tutor aziendale.
 */

  public void CreaRegistro(int ID_Tirocinio, int Convalida_Tutor_Az) {
    try {
      Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    Connection conn = null;
    Statement stmt = null;
    System.out.println(Tirocinante.toString());
    String t = Tirocinante;
    String tu = Tutor_Aziendale_Email;
    
    String sql = " INSERT INTO  registro_tirocinio (ID_Tirocinio, Data_Attivazione, Convalida, "
        + "Tirocinante_Email, Tutor_Aziendale_Email)" + " VALUES ('" + ID_Tirocinio + "', '"
        + data + "', '" + Convalida_Tutor_Az + "', '" + t + "','" + tu + "');";

    try {
      conn = DriverManager.getConnection("jdbc:mysql://" + ip + ":" + port + "/"
          + db, username, password);

      stmt = conn.createStatement();
      stmt.executeUpdate(sql);

      stmt.close();
      conn.close();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println(sql);
  }
}