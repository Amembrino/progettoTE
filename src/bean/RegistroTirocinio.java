package bean;

import java.sql.Date;

/**
 * Classe RegistroTirocinio, rappresenta gli oggetti Registro Di Tirocinio, 
 * che verranno compilati dai tirocinanti con le attività svolte durante 
 * l'attività di tirocinio e convalidati dai tutor aziendali.
 */
public class RegistroTirocinio {

  private int ID_Tirocinio;
  private int Convalida_Tutor_Az;
  private Date data_att;
  private String Tirocinante_Email;
  private String Tutor_Aziendale_Email;

  /**
* Costruttore parametrico.
* Istanzia un nuovo oggetto di tipo RegistroTirocinio con attributi:
* @param ID_Tirocinio identificativo univoco dell'attività di tirocinio
* @param data_att Data inizio tirocinio
* @param Convalida_Tutor_Az Convalida del registro di tirocinio da parte del tutor aziendale
* @param Tirocinante_Email Email del tirocinante
* @param Tutor_Aziendale_Email Email del tutor aziendale
*/
  
  public RegistroTirocinio(int ID_Tirocinio, Date data_att, int Convalida_Tutor_Az, 
      String Tirocinante_Email, String Tutor_Aziendale_Email) {
    this.ID_Tirocinio=ID_Tirocinio;
    this.data_att=data_att;
    this.Convalida_Tutor_Az=Convalida_Tutor_Az;
    this.Tirocinante_Email=Tirocinante_Email;
    this.Tutor_Aziendale_Email=Tutor_Aziendale_Email;
  }

  /**
* Metodo di accesso.
* Restituisce l'identificativo univoco del tirocinio.
* @return ID_Tirocinio
*/

  public int getID_Tirocinio() {
    return ID_Tirocinio;
  }

  /**
* Metodo di modifica.
* Imposta l'attributo identificativo univoco del tirocinio
* @param iD_Tirocinio Identificativo univoco dell'attività di tirocinio
*/

  public void setID_Tirocinio(int iD_Tirocinio) {
    ID_Tirocinio = iD_Tirocinio;
  }

  /**
* Metodo di accesso.
* Restituisce il valore del campo "convalida" del registro
* @return Convalida_Tutor_Az
*/

  public int getConvalida_Tutor_Az() {
    return Convalida_Tutor_Az;
  }
  /**
* Metodo di modifica
* Prende il parametro in input e aggiorna il corrispondente attributo dell'oggetto.
* @param convalida_Tutor_Az Indica se il registro di tirocinio è convalidato o meno.
*/

  public void setConvalida_Tutor_Az(int convalida_Tutor_Az) {
    Convalida_Tutor_Az = convalida_Tutor_Az;
  }
  /**
* Metodo di accesso.
* Restituisce la data di attivazione del tirocinio
* @return data_att
*/

  public Date getData_att() {
    return data_att;
  }
  /**
* Metodo di modifica
* Prende il parametro in input e aggiorna il corrispondente attributo dell'oggetto.
* @param data_att Indica la data di inizio tirocinio
*/

  public void setData_att(Date data_att) {
    this.data_att = data_att;
  }
  /**
* Metodo di accesso
* Restituisce l'indirizzo email del tirocinante.
* @return Tirocinante_Email
*/

  public String getTirocinante_Email() {
    return Tirocinante_Email;
  }
  /**
* Metodo di modifica
* Prende il parametro in input e aggiorna il corrispondente attributo dell'oggetto.
* @param tirocinante_Email Email del tirocinante da aggiornare.
*/

  public void setTirocinante_Email(String tirocinante_Email) {
    Tirocinante_Email = tirocinante_Email;
  }
  /**
* Metodo di accesso
* Restituisce l'indirizzo email del tutor aziendale.
* @return Tutor_Aziendale_Email
*/
  
  public String getTutor_Aziendale_Email() {
    return Tutor_Aziendale_Email;
  }
  /**
* Metodo di modifica
* Prende il parametro in input e aggiorna il corrispondente attributo dell'oggetto.
* @param tutor_Aziendale_Email Email del tutor aziendale.
*/
  
  public void setTutor_Aziendale_Email(String tutor_Aziendale_Email) {
    Tutor_Aziendale_Email = tutor_Aziendale_Email;
  }

}