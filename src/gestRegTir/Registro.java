package gestRegTir;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe Registro, rappresenta oggetti di tipo registro di tirocinio, vengono compilati dai tirocinanti inserendoci nuove attività e vengono convalidati dai tutor aziendali.
 */
public class Registro {

  private int id;
  private String data;
  private int  conv;
  private String tir_em, tut_az_em;
  
  /**
 * Costruttore parametrico
 * Istanzia un nuovo oggetto di tipo registro caratterizzato da:
 * @param id Identificativo registro di tirocinio
 * @param conv Convalida registro
 * @param tir_em Email del tirocinante
 * @param tut_az_em Email del tutor aziendale
 */

public Registro(int id, int conv, String tir_em, String tut_az_em){
  this.id=id;

  /**data odierna (?) */
  java.util.Date Dat  = new java.util.Date();
  new java.sql.Date(Dat.getTime());
  SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
  String da = dt1.format(Dat );
  this.data = da;
  this.conv = conv;
  this.tir_em = tir_em;
  this.tut_az_em = tut_az_em;
}
  /**
 * Metodo di accesso
 * Restituisce l'identificato univoco del registro
 * @return id
 */

  public int getId() {
    return id;
  }
  /**
 * Metodo di modifica
 * Prende il parametro in input e aggiorna il corrispondente attributo della classe.
 * @param id Identificativo del registro di tirocinio.
 */

  public void setId(int id) {
    this.id = id;
  }
  /**
 * Metodo di accesso
 * Restituisce la data di creazione del registro di tirocinio
 * @return data
 */

  public String getData() {
    return data;
  }
  /**
 * Metodo di modifica
 * Prende il parametro in input e aggiorna il corrispondente attributo della classe.
 * @param data Data di creazione del registro di tirocinio
 */

  public void setData(String data) {
    this.data = data;
  }
  /**
 * Metodo di accesso
 * Restituisce il valore del campo convalida, che serve per verificare se il registro è convalidato o no.
 * @return conv
 */

  public int getConv() {
    return conv;
  }
  /**
 * Metodo di modifica
 * Prende il parametro in input e aggiorna il corrispondente attributo della classe.
 * @param conv Convalida del registro 
 */

  public void setConv(int conv) {
    this.conv = conv;
  }
  /**
 * Metodo di accesso
 * Restituisce l'indirizzo email del tirocinante
 * @return tir_em
 */

  public String getTir_em() {
    return tir_em;
  }
  /**
 * Metodo di modifica
 * Prende il parametro in input e aggiorna il corrispondente attributo della classe.
 * @param tir_em Indirizzo email del tirocinante.
 */

  public void setTir_em(String tir_em) {
    this.tir_em = tir_em;
  }
  /**
 * Metodo di accesso
 * Restituisce l'indirizzo email del tutor aziendale
 * @return tut_az_em
 */

  public String getTut_az_em() {
    return tut_az_em;
  }
  /**
 * Metodo di modifica
 * Prende il parametro in input e aggiorna il corrispondente attributo della classe.
 * @param tut_az_em Indirizzo email del tutor aziendale.
 */

  public void setTut_az_em(String tut_az_em) {
    this.tut_az_em = tut_az_em;
  }
}