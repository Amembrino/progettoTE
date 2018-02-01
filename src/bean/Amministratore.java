package bean;

/**
 *  Rappresenta la tipologia di utente: Amministratore, figura che potrà registrare utenti al sito.
 */
public class Amministratore extends User {
  private String nome;
  private String cognome;
  private String email;
  private String password;

  /**
 * Costruttore nullo, istanzia un oggetto Amministratore senza attributi impostati.
 */
  public Amministratore() { }

  /**
  * Metodo di Accesso.
  * @return nome dell'Amministratore in formato string.
  */
  public String getNome() {
    return nome;
  }
  /**
* Metodo di accesso.
* @return cognome dell'Amministratore in formato string.
*/
  
  public String getCognome() {
    return cognome;
  }
  /**
* Metodo di accesso.
* @return Email dell'Amministratore in formato string.
*/
  
  public String getEmail() {
    return email;
  }
  /**
* Metodo di accesso.
* @return password dell'Amministratore in formato string.
*/
  
  public String getPassword() {
    return password;
  }
  /**
* Metodo di modifica.
* Imposta il nome dell'istanza Amministratore.
* @param nome Nome dell'Amministratore in formato string.
*/
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  /**
* Metodo di modifica.
* Imposta il cognome dell'istanza Amministratore.
* @param cognome dell'Amministratore in formato string.
*/
  
  public void setCognome(String cognome) {
    this.cognome = cognome;
  }
  /**
* Metodo di modifica.
* Imposta l'email dell'istanza Amministratore.
* @param email dell'Amministratore in formato string.
*/
  
  public void setEmail(String email) {
    this.email = email;
  }
  /**
* Metodo di modifica.
* Imposta la password dell'istanza Amministratore.
* @param password dell'Amministratore in formato string.
*/
  
  public void setPassword(String password) {
    this.password = password;
  }

}
