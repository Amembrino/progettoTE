package utenza.gestore;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import db.Connector;

/**
 * Classe RegistraUt, viene usata dall'utenza "Amministratore" per registrare nuovi utenti.
 */
public class RegistraUt {

  private String Email;
  private String Nome;
  private String Cognome;
  private String Password;
  private String AdminEmail;
  /**
* Costruttore nullo.
*/

  public  RegistraUt(){
  }

  /**
 * Costruttore parametrico.
 * @param Email indirizzo email dell'utente da registrare
 * @param Nome nome dell'utente da registrare
 * @param Cognome cognome dell'utente da registrare
 * @param Password password assegnata all'utente da registrare
 * @param AdminEmail indirizzo email dell'utente da registrare
 */

  public RegistraUt(String Email, String Nome, String Cognome, String Password, String AdminEmail) {
    this.setEmail(Email);
    this.setNome(Nome);
    this.setCognome(Cognome);
    this.setPassword(Password);
    this.setAdminEmail(AdminEmail);
  }

  /**
* Metodo di accesso.
* Restituisce l'email del nuovo utente
* @return Email
*/
  public String getEmail() {
    return Email;
  }
  /**
* Metodo di modifica
* Prende il parametro in input e aggiorna il corrispondente attributo della classe.
* @param email Indirizzo email dell'utente da registrare.
*/
  
  public void setEmail(String email) {
    Email = email;
  }
  /**
* Metodo di accesso.
* Restituisce il nome del nuovo utente
* @return Nome
*/

  public String getNome() {
    return Nome;
  }
  /**
* Metodo di modifica
* Prende il parametro in input e aggiorna il corrispondente attributo della classe.
* @param nome Nome dell'utente da registrare.
*/

  public void setNome(String nome) {
    Nome = nome;
  }
  /**
* Metodo di accesso.
* Restituisce il cognome del nuovo utente
* @return Cognome
*/
  
  public String getCognome() {
    return Cognome;
  }
  /**
* Metodo di modifica
* Prende il parametro in input e aggiorna il corrispondente attributo della classe.
* @param cognome Cognome dell'utente da registrare
*/
  
  public void setCognome(String cognome) {
    Cognome = cognome;
  }
  /**
* Metodo di accesso.
* Restituisce la password assegnata al nuovo utente
* @return Password
*/

  public String getPassword() {
    return Password;
  }
  /**
* Metodo di modifica
* Prende il parametro in input e aggiorna il corrispondente attributo della classe.
* @param password Password dell'utente da registrare
*/

  public boolean setPassword(String password) {
    boolean y= false;
	  if ((password.length() >= 6) && (password.length() <= 20)) {
      Password = password;
        y=true;
    }
   return y;
  }

  /**
* Metodo di accesso.
 * Restituisce l'indirizzo email dell'Amministratore
 * @return AdminEmail
 */

  public String getAdminEmail() {
    return AdminEmail;
  }
  /**
* Metodo di modifica
 * Prende il parametro in input e aggiorna il corrispondente attributo della classe.
 * @param adminEmail Indirizzo email dell'Amministratore
 */

  public void setAdminEmail(String adminEmail) {
    AdminEmail = adminEmail;
  }
  /**
 * Metodo di inserimento.
 * Inserisce un nuovo account all'interno del database
 * @param tipoUtente Indica la categoria di appartenenza dell'utente
 * @throws SQLException Gestisce errori legati al database
 */
  
  public boolean insertAccount(int tipoUtente) throws SQLException {
   boolean flag=false;
	  
	  Connection conn = Connector.getConnection();
    Statement st = null;

    String sql = "INSERT INTO ";
    if (tipoUtente == 1) {
      sql = sql + "dir_azienda";
    }
    if (tipoUtente == 2) {
      sql = sql + "dir_dipartimento";
    }
    if (tipoUtente == 3) {
      sql = sql + "tirocinante";
    }
    if (tipoUtente == 4) {
      sql = sql + "tutor_aziendale";
    }
    if (tipoUtente == 5) {
      sql = sql + "tutor_universitario";
    }

    sql = sql + " VALUES ('" + Email + "','" + Nome + "', '" + Cognome + "','"
        + Password + "','" + AdminEmail + "')";
    // "SELECT * FROM "+tipoAcc+" WHERE Email='"+email+"' AND Password='"+password+"'";
    /*
    * INSERT INTO table_name 
    VALUES (value1, value2, value3, ...); email nome cognome password adminemail*/
    System.out.println(sql);
    try {
      st = conn.createStatement();
      int x =st.executeUpdate(sql);
      flag=true;
      
      st.close();
      conn.close();
   
    } catch (SQLException e) {
      throw new RuntimeException("Database error in registra utenet", e);
    }
   
	return flag;
  }
  
}