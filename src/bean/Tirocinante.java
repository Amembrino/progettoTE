package bean;

/**
 * Classe Tirocinante, rappresenta la tipologia di utente: Tirocinante, 
 * figura che potrà compilare e inviare la domanda di tirocinio e compilare 
 * il proprio registro di tirocinio.
 */
public class Tirocinante {

  private String nome;
  private String cognome;
  private String email;
  private String password;

  /**
 * Costruttore nullo, serve per istanziare un oggetto Tirocinante senza attributi impostati.
 */
  
  public Tirocinante() {
  }

  /**
 * Metodo di Accesso.
 * @return nome del tirocinante in formato string.
 */
  
  public String getNome() {
    return nome;
  }
  /**
 * Metodo di accesso.
 * @return cognome del tirocinante in formato string.
 */

  public String getCognome() {
    return cognome;
  }
  /**
 * Metodo di accesso.
 * @return Email del tirocinante in formato string.
 */
  
  public String getEmail() {
    return email;
  }
  /**
 * Metodo di accesso.
 * @return password del tirocinante in formato string.
 */

  public String getPassword() {
    return password;
  }
  /**
 * Metodo di modifica
 * Imposta il nome del tirocinante.
 * @param nome Nome del tirocinante in formato string.
 */
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  /**
 * Metodo di modifica
 * Imposta il cognome del tirocinante.
 * @param cognome del tirocinante in formato string.
 */
  
  public void setCognome(String cognome) {
    this.cognome = cognome;
  }
  /**
 * Metodo di modifica
 * Imposta l'email del tirocinante.
 * @param email del tirocinante in formato string.
 */
  
  public void setEmail(String email) {
    this.email = email;
  }
  /**
 * Metodo di modifica
 * Imposta la password del tirocinante.
 * @param password del tirocinante in formato string.
 */
  
  public void setPassword(String password) {
    this.password = password;
  }
}