package tirocinio.registro.gestore;

//import bean.Azienda;
//import bean.ListaAziende;
//import bean.Tirocinante;
import db.Connector;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.Date;

import bean.Registro;


/**
 * Classe CreateRegistroDao, si configura col database per inserire un nuovo registro di tirocinio.
 */

public class CreateRegistroDao {
 
	boolean flag=false;

  Statement st;
  ResultSet rs;
  String Tirocinante;
  String Tutor_Aziendale_Email;
  String data;
  /**
 * Costruttore nullo.
 */

  public CreateRegistroDao() {
  }

  /**
 * Metodo che preleva i dati inseriti nella domanda di tirocinio.
 * @param id Identificativo della domanda di tirocinio
 */
  
  public boolean getDatiDomanda(int id) { 
  
	  Connection con = Connector.getConnection();

    String query = "SELECT * FROM domanda_di_tirocinio WHERE Id_Documento=" + id;
    try {
      java.sql.Statement stmt = con.createStatement(); 
      rs = stmt.executeQuery(query);
      
      while (rs.next()) {
        Tirocinante = rs.getString("TirocinanteEmail");
        Tutor_Aziendale_Email = rs.getString("Tutor_Aziendale_Email");
      }
      if (!rs.isBeforeFirst()) {    
          flag = true;
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
	return flag;
  }

  /**
 * Metodo che istanzia un registro di tirocinio all'interno del database.
 * @param ID_Tirocinio Identificativo del registro di tirocinio.
 * @param Convalida_Tutor_Az Campo convalida del registro da parte del tutor aziendale.
 */

  public boolean CreaRegistro(int ID_Tirocinio, int Convalida_Tutor_Az) {
   
   try{ 
	Connection conn = Connector.getConnection();
    Statement stmt = null;
    System.out.println(Tirocinante.toString());
    String t = Tirocinante;
    String tu = Tutor_Aziendale_Email;
    
    String sql = " INSERT INTO  registro_tirocinio (ID_Tirocinio, Data_Attivazione, Convalida, "
        + "Tirocinante_Email, Tutor_Aziendale_Email)" + " VALUES ('" + ID_Tirocinio + "', '"
        + data + "', '" + Convalida_Tutor_Az + "', '" + t + "','" + tu + "');";

     stmt = conn.createStatement();
    int x =  stmt.executeUpdate(sql); 
    flag = (x > 0); 
      stmt.close();
      conn.close();
      System.out.println(sql);
  }
     catch (Exception e) {
		e.printStackTrace();
	}
   return flag;
  
}
  
  
}