package bean;
/**
 * Classe TutorUni, rappresenta la tipologia di utente: Tutor Universitario, 
 * figura che potrà firmare le richieste di tirocinio.
 */

public class TutorUni extends User {

  private String nome;
  private String cognome;
  private String email;
  private String password;

  /**
 * Costruttore nullo, serve per istanziare un oggetto Tutor universitario senza attributi impostati.
 */

  public TutorUni() {
  }

  /**
 * Metodo di Accesso.
 * @return nome del tutor universitario in formato string.
 */

  public String getNome() {
    return nome;
  }
  /**
 * Metodo di accesso.
 * @return cognome del tutor universitario in formato string.
 */

  public String getCognome() {
    return cognome;
  }
  /**
 * Metodo di accesso.
 * @return Email del tutor universitario in formato string.
 */

  public String getEmail() {
    return email;
  }
  /**
 * Metodo di accesso.
 * @return password del tutor universitario in formato string.
 */

  public String getPassword() {
    return password;
  }
  /**
 * Metodo di modifica
 * Imposta il nome del tutor universitario.
 * @param nome Nome del tutor universitario in formato string.
 */

  public void setNome(String nome) {
    this.nome = nome;
  }
  /**
 * Metodo di modifica
 * Imposta il cognome del tutor universitario.
 * @param cognome del tutor universitario in formato string.
 */
  
  public void setCognome(String cognome) {
    this.cognome = cognome;
  }
  /**
 * Metodo di modifica
 * Imposta l'email del tutor universitario.
 * @param email del tutor universitario in formato string.
 */
  
  public void setEmail(String email) {
    this.email = email;
  }
  /**
 * Metodo di modifica
 * Imposta la password del tutor universitario.
 * @param password del tutor universitario in formato string.
 */
  
  public void setPassword(String password) {
    this.password = password;
  }
}