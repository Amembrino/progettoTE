package bean;

/**
 * Superclasse user, viene estesa dalle classi relative alle singole categorie di utenze. *
 */
public class User {
  String tipoacc;
  
  private String nome;
  private String cognome;
  private String email;
  private String password;
  
  /**
   * Metodo di accesso.
   * Serve per recuperare il valore del campo Nome di un utente.
   * @return nome
   */
  public String getNome() {
    return nome;
  }
 
  /**
   * Metodo di modifica.
   * Serve per impostare il valore del campo Nome di un utente.
   * @param nome Stringa contenente il nome dell'utente.
   */
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  /**
   * Metodo di accesso.
   * Serve per recuperare il valore del campo Cognome di un utente.
   * @return cognome
   */
  public String getCognome() {
    return cognome;
  }

  /**
   * Metodo di modifica.
   * Serve per impostare il valore del campo Cognome di un utente.
   * @param cognome Stringa contenente il cognome dell'utente.
   */
  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  /**
   * Metodo di accesso.
   * Serve per recuperare il valore del campo Email di un utente.
   * @return email
   */
  public String getEmail() {
    return email;
  }
  
  /**
   * Metodo di modifica.
   * Serve per impostare il valore del campo Email di un utente.
   * @param email Stringa contenente l'email dell'utente.
   */
  public void setEmail(String email) {
    this.email = email;
  }
  
  /**
   * Metodo di accesso.
   * Serve per recuperare il valore del campo Password di un utente.
   * @return password
   */
  public String getPassword() {
    return password;
  }

  /**
   * Metodo di modifica.
   * Serve per impostare il valore del campo Password di un utente.
   * @param password Stringa contenente la password dell'utente.
   */
  public void setPassword(String password) {
    this.password = password;
  }

  /**
 * Costruttore nullo.
 * Istanzia un oggetto di tipo user;
 */

  public User() {
  }
  /**
 * Metodo di accesso.
 * Restituisce una stringa indicante la tipologia dell'account;
 * @return tipoacc
 */

  public String getTipoacc() {
    return tipoacc;
  }

  /**
 * Metodo di modifica
 * Prende il parametro in input e aggiorna il corrispondente attributo della classe.
 * @param tipoacc Stringa indicante la tipologia dell'account (Studente/Tutor universitario/...)
 */

  public void setTipoacc(String tipoacc) {
    this.tipoacc = tipoacc;
  }
 
  
}