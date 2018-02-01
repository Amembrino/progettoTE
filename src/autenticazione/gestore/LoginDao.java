package autenticazione.gestore;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.Connector;

 
 
/**
 * Classe LoginDao, Permette l'autentificazione dell'untenza e l'accesso alla propria area utente.
 *
 */
public class LoginDao {

  /**
    * Costruttore nullo.
    */
  public LoginDao() {
    // TODO Auto-generated constructor stub
  }
  /**
   * Confronta le credenziali inserite dall'utente all'atto del login 
   * con quelle presenti nel database memorizzate nell'atto della registrazione utente.
   * @param email Indirizzo email dell'utente che effettua il login.
   * @param password Password dell'utente che effettua il login.
   * @param tipoAcc Tipo dell'account dell'utente che effettua il login.
   * @return true se l'autentificazione avviene con successo, false altrimenti
   * @throws SQLException Gestisce errori nell'accesso e controllo al database.
   */
  
  public boolean ricercaAccout(String email, String password, String tipoAcc) throws SQLException { 
    String mail;
    String pw;
    Connection conn = Connector.getConnection();

    String sql = "SELECT * FROM " + tipoAcc + " WHERE Email='" + email + ""
        + "' AND Password='" + password + "'";
        
    java.sql.Statement st  = conn.createStatement();
    ResultSet rs = st.executeQuery(sql);
           
    while (rs.next()) { 
      mail = rs.getString("Email");
      pw = rs.getString("Password");
      System.out.println(mail + "....  " + pw); 
      if ((mail.equals(email) && (pw.equals(password)))) {
        return true;
      }
    }           
          
    rs.close();
    conn.close();
         
    return false;     
  }
}