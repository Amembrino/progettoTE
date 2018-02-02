package bean;

/**
 * Classe Azienda, rappresenta un'azienda che ha stipulato o intende stipulare una convenzione 
 * con l'università per poter ospitare attività di tirocinio esterno.
 */
public class Azienda {
  private String  nome; 
  private String sede_Operativa;
  private String sede_Amministrativa;
  private String dir_AziendaEmail;
  private String tutor_AziendaEmail;
  private int id_Azienda;
  private boolean  convenzionata;

  /**
* Costruttore nullo, serve per istanziare un oggetto Azienda senza attributi impostati.
*/
  public Azienda() { }
/**
* Costruttore parametrico.
* @param nome Stringa corrispondente al nome dell'azienda
* @param sede_Operativa Stringa indicante la sede operativa dell'azienda
* @param sede_Amministrativa Stringa indicante la sede amministrativa dell'azienda
* @param dir_AziendaEmail Stringa corrispondente all'email del dirigente dell'azienda
* @param tutor_AziendaEmail Stringa corrispondente all'email  del tutor aziendale
* @param id_Azienda Identificatore univoco dell'azienda di tipi int.
* @param convenzionata Valore booleano, indica se l'azienda risulta già convenzionata o no.
*/
  
  public Azienda(String nome, String sede_Operativa, String sede_Amministrativa, 
    String dir_AziendaEmail, String tutor_AziendaEmail, int id_Azienda, 
    Boolean convenzionata) { 
    this.sede_Operativa = sede_Operativa;
    this.convenzionata = convenzionata;
    this.id_Azienda = id_Azienda;
    this.nome = nome;
    this.sede_Amministrativa = sede_Amministrativa;
    this.dir_AziendaEmail = dir_AziendaEmail;
    this.tutor_AziendaEmail = tutor_AziendaEmail; 
  }
  /**
* Metodo di accesso.
* @return Sede operativa dell'azienda in formato string.
*/

  public String getSede_Operativa() {
    return sede_Operativa;
  }
  /**
* Metodo di accesso.
* @return Nome dell'azienda in formato string.
*/

  public String getNome() {
    return nome;
  }
  /**
* Metodo di accesso.
* @return Sede amministrativa dell'azienda in formato string.
*/

  public String getSede_Amministrativa() {
    return sede_Amministrativa;
  }
  /**
* Metodo di accesso.
* @return Email del dirigente d'azienda in formato string.
*/

  public String getDir_AziendaEmail() {
    return dir_AziendaEmail;
  }
  /**
* Metodo di accesso.
* @return Email del tutor aziendale in formato string.
*/

  public String getTutor_AziendaEmail() {
    return tutor_AziendaEmail;
  }
  /**
* Metodo di accesso.
* @return ID Azienda, Identificativo univoco dell'azienda in formato int.
*/

  public int getId_Azienda() {
    return id_Azienda;
  }
  /**
* Metodo di controllo.
* @return true se l'azienda risulta convenzionata con l'università false altrimenti.
*/

  public boolean isConvenzionata() {
    return convenzionata;
  }
  /**
* Metodo di modifica
* Prende il parametro in input e aggiorna il corrispondente attributo della classe.
* @param sede_Operativa Sede operativa dell'azienda in formato string.
*/

  public void setSede_Operativa(String sede_Operativa) {
    this.sede_Operativa = sede_Operativa;
  }
  /**
* Metodo di modifica
* Prende il parametro in input e aggiorna il corrispondente attributo della classe.
* @param nome Nome dell'azienda in formato string.
*/

  public void setNome(String nome) {
    this.nome = nome;
  }
  /**
* Metodo di modifica
* Prende il parametro in input e aggiorna il corrispondente attributo della classe.
* @param sede_Amministrativa Sede amministrativa dell'azienda in formato string.
*/

  public void setSede_Amministrativa(String sede_Amministrativa) {
    this.sede_Amministrativa = sede_Amministrativa;
  }
  /**
* Metodo di modifica
* Prende il parametro in input e aggiorna il corrispondente attributo della classe.
* @param dir_AziendaEmail Email del dirigente di azienda in formato string.
*/

  public void setDir_AziendaEmail(String dir_AziendaEmail) {
    this.dir_AziendaEmail = dir_AziendaEmail;
  }
  /**
* Metodo di modifica
* Prende il parametro in input e aggiorna il corrispondente attributo della classe.
* @param tutor_AziendaEmail Email del tutor aziendale in formato string.
*/

  public void setTutor_AziendaEmail(String tutor_AziendaEmail) {
    this.tutor_AziendaEmail = tutor_AziendaEmail;
  }
  /**
* Metodo di modifica
* Prende il parametro in input e aggiorna il corrispondente attributo della classe.
* @param id_Azienda Identificativo univoco dell'azienda in formato int..
*/

  public void setId_Azienda(int id_Azienda) {
    this.id_Azienda = id_Azienda;
  }
  /**
* Metodo di modifica
* Prende il parametro in input e aggiorna il corrispondente attributo della classe.
* @param convenzionata Definisce se l'azienda è convenzionata o non con l'università.
*/

  public void setConvenzionata(boolean convenzionata) {
    this.convenzionata = convenzionata;
  }
}
