package gestRegTir;

/**
 * Classe Attività, rappresenta una singola attività svolta da un tirocinante che verrà annotata nel suo registro di tirocinio. 
 */
public class Attività
{
  private String data;
  private String luogo;
  private String Descrizione;
  private int ora;
  private int id;
  private int RegistroID;
	
  /**
 * Costruttore parametrico
 * Istanzia un oggetto "Attività" che rappresenta un attività svolta nel registro di tirocinio di un tirocinante.
 * @param id Numero identificativo dell'attività svolta.
 * @param data Data in cui si è svolta l'attività.
 * @param ora Durata dell'attività
 * @param luogo Luogo in cui si è svolta l'attività
 * @param Descrizione Descrizione dell'attività
 * @param RegistroID ID del Registro di tirocinio cui appartiene l'attività
 */

  public Attività(int id, String data, int ora, String luogo, String Descrizione, int RegistroID) {
    this.id=id;
    this.data=data;
    this.ora=ora;
    this.luogo=luogo;
    this.Descrizione=Descrizione;
    this.RegistroID=RegistroID;
  }
  /**
 * Metodo di accesso
 * Restituisce l'identificativo dell'attività svoltà.
 * @return id
 */

  public int getId() {
    return id;
  }
  /**
 * Metodo di modifica
 * Prende il parametro in input e aggiorna il corrispondente attributo della classe.
 * @param id Codice identificativo dell'attività svolta
 */
  
  public void setId(int id) {
    this.id = id;
  }
  /**
 * Metodo di accesso
 * Restituisce la data dell'attività svolta.
 * @return data
 */
  
  public String getData() {
    return data;
  }
  /**
 * Metodo di modifica
 * Prende il parametro in input e aggiorna il corrispondente attributo della classe.
 * @param data Data dell'attività svolta.
 */

  public void setData(String data) {
    this.data = data;
  }
  /**
 * Metodo di accesso
 * Restituisce la durata espressa in h dell'attività svolta.
 * @return ora
 */

  public int getOra() {
    return ora;
  }
  /**
 * Metodo di modifica
 * Prende il parametro in input e aggiorna il corrispondente attributo della classe.
 * @param ora Durata dell'attività svolta espressa come ore.
 */
  
  public void setOra(int ora) {
    this.ora = ora;
  }
  /**
 * Metodo di accesso
 * Restituisce il luogo dove si è svolta l'attività.
 * @return luogo
 */

  public String getLuogo() {
    return luogo;
  }
  /**
 * Metodo di modifica
 * Prende il parametro in input e aggiorna il corrispondente attributo della classe.
 * @param luogo Stringa identificante il luogo dove si è svolta l'attività
 */
  
  public void setLuogo(String luogo) {
    this.luogo = luogo;
  }
  /**
 * Metodo di accesso
 * Restituisce la descrizione dell'attività svolta.
 * @return Descrizione
 */
  
  public String getDescrizione() {
    return Descrizione;
  }
  /**
 * Metodo di modifica
 * Prende il parametro in input e aggiorna il corrispondente attributo della classe.
 * @param descrizione Stringa descrittiva dell'attività svolta.
 */
  
  public void setDescrizione(String descrizione) {
    Descrizione = descrizione;
  }
  /**
 * Metodo di accesso
 * Restituisce l'identificativo univoco del registro di tirocinio in cui va inserita l'attività.
 * @return RegistroID
 */

  public int getRegistroID() {
    return RegistroID;
  }
  /**
 * Metodo di modifica
 * Prende il parametro in input e aggiorna il corrispondente attributo della classe.
 * @param registroID Identificativo del registro di tirocinio del tirocinante.
 */

  public void setRegistroID(int registroID) {
    RegistroID = registroID;
  }

}