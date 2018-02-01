package bean;

/**
* Classe DirettoreDip, reppresenta la tipologia di utente: Direttore di dipartimento, 
* figura che potrà attivare i tirocini.
*/
public class DirettoreDip extends User {

  private String nome;
  private String cognome;
  private String email;
  private String password;

  /**
 * Costruttore nullo, istanzia un oggetto Direttore di dipartimento senza attributi impostati.
 */
  
  public DirettoreDip() { }
  /**
* Metodo di Accesso.
* @return nome del direttore di dipartimento in formato string.
*/
  
  public String getNome() {
    return nome;
  }
  /**
* Metodo di accesso.
* @return cognome del direttore di dipartimento in formato string.
*/

  public String getCognome() {
    return cognome;
  }
  /**
* Metodo di accesso.
* @return Email del direttore di dipartimento in formato string.
*/

  public String getEmail() {
    return email;
  }
  /**
* Metodo di accesso.
* @return password del direttore di dipartimento in formato string.
*/

  public String getPassword() {
    return password;
  }
  /**
* Metodo di modifica.
* Imposta il nome deldirettore di dipartimento.
* @param nome nome del direttore di dipartimento in formato string.
*/

  public void setNome(String nome) {
    this.nome = nome;
  }
  /**
* Metodo di modifica.
* Imposta il cognome del direttore di dipartimento.
* @param cognome del direttore di dipartimento in formato string.
*/

  public void setCognome(String cognome) {
    this.cognome = cognome;
  }
  /**
* Metodo di modifica.
* Imposta l'email del direttore di dipartimento.
* @param email del direttore di dipartimento in formato string.
*/

  public void setEmail(String email) {
    this.email = email;
  }
  /**
* Metodo di modifica.
* Imposta la password del direttore di dipartimento.
* @param password del direttore di dipartimento in formato string.
*/

  public void setPassword(String password) {
    this.password = password;
  }

}