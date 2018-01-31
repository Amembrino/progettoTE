package bean;

/**
 * Classe DirigenteAzienda, rappresenta la tipologia di utente: Dirigente di azienda, 
 * figura che potrà firmare richieste di tirocinio e in futuro compilare e sottomettere 
 * domande di convenzione.
 */
public class DirigenteAzienda extends user {

  private String nome;
  private String cognome;
  private String email;
  private String password;

  /**
* Costruttore nullo, serve per istanziare un oggetto DirigenteAzienda senza attributi impostati.
*/

  public DirigenteAzienda() {
    super();
  }

  /**
* Metodo di Accesso.
* @return nome del dirigente di azienda in formato string.
*/
  
  public String getNome() {
    return nome;
  }
  /**
* Metodo di accesso.
* @return cognome del dirigente di azienda in formato string.
*/

  public String getCognome() {
    return cognome;
  }
  /**
* Metodo di accesso.
* @return Email del dirigente di azienda in formato string.
*/

  public String getEmail() {
    return email;
  }
  /**
* Metodo di accesso.
* @return password del dirigente di azienda in formato string.
*/

  public String getPassword() {
    return password;
  }
  /**
* Metodo di modifica.
* Imposta il nome del dirigente di azienda.
* @param nome Nome del dirigente di azienda in formato string.
*/

  public void setNome(String nome) {
    this.nome = nome;
  }
  /**
* Metodo di modifica.
* Imposta il cognome del dirigente di azienda.
* @param cognome del dirigente di azienda in formato string.
*/

  public void setCognome(String cognome) {
    this.cognome = cognome;
  }
  /**
* Metodo di modifica.
* Imposta l'email del dirigente di azienda.
* @param email del dirigente di azienda in formato string.
*/

  public void setEmail(String email) {
    this.email = email;
  }
  /**
* Metodo di modifica.
* Imposta la password del dirigente di azienda.
* @param password del dirigente di azienda in formato string.
*/

  public void setPassword(String password) {
    this.password = password;
  }
}
