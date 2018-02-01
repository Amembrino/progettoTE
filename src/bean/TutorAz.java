package bean;
/**
 * Classe TutorAz, rappresenta la tipologia di utente: Tutor Aziendale, figura che 
 * potrà firmare le richieste di tirocinio e convalidare i registri di tirocinio.
 */

public class TutorAz extends User {

  private String nome;
  private String cognome;
  private String email;
  private String password;

  public TutorAz() {
    super();
  }

  /**
* Metodo di Accesso.
* @return nome del tutor aziendario in formato string.
*/

  public String getNome() {
    return nome;
  }

  /**
 * Metodo di accesso.
 * @return cognome del tutor aziendario in formato string.
 */

  public String getCognome() {
    return cognome;
  }
  /**
* Metodo di accesso.
* @return Email del tutor aziendario in formato string.
*/
  
  public String getEmail() {
    return email;
  }
  /**
* Metodo di accesso.
* @return password del tutor aziendario in formato string.
*/

  public String getPassword() {
    return password;
  }
  /**
 * Metodo di modifica
 * Imposta il nome del tutor aziendario.
 * @param nome Nome del tutor aziendario in formato string.
 */

  public void setNome(String nome) {
    this.nome = nome;
  }
  /**
 * Metodo di modifica
 * Imposta il cognome del tutor aziendario.
 * @param cognome del tutor aziendario in formato string.
 */

  public void setCognome(String cognome) {
    this.cognome = cognome;
  }
  /**
 * Metodo di modifica
 * Imposta l'email del tutor aziendario.
 * @param email del tutor aziendario in formato string.
 */

  public void setEmail(String email) {
    this.email = email;
  }
  /**
 * Metodo di modifica
 * Imposta la password del tutor aziendario.
 * @param password del tutor aziendario in formato string.
 */

  public void setPassword(String password) {
    this.password = password;
  }
}