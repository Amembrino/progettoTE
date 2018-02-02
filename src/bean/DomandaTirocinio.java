package bean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe DomandaTirocinio, rappresenta l'oggetto: Domanda di tirocinio, 
 * oggetto creato nel momento in cui l'utente Tirocinante compila la 
 * propria richiesta di tirocinio esterno.
 */
public class DomandaTirocinio {
 
  private int Id_Documento;
  private String Azienda;
  private String autore;
  private String TirocinanteEmail;
  private String tutoAzrEmanil;
  private String tutoUnirEmanil;
 
  private int Firma_tutor_universitario;
  private int Firma_tutor_aziendale;
  private int firma_dir_az;
  private int firma_dir_dip;


  private java.util.Date DataO = new java.util.Date();
  java.sql.Date oggi = new java.sql.Date(DataO.getTime());
  SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");

  private String da = dt1.format(DataO);


  /**
* Costruttore parametrico, istanzia un oggetto domanda di tirocinio 
* caratterizzato dai seguenti parametri.
* @param id_Documento identificativo univoco del documento di tipo int.
* @param tirocinanteEmail email del tirocinante (tipo string).
* @param tutoAzrEmanil email del tutor aziendale (tipo string).
* @param tutoUnirEmanil email del tutor universitario (tipo string).
* @param firma_dir_az campo firma del dirigente di azienda
* @param firma_dir_dip campo firma del direttore di dipartimento
* @param firma_tutor_universitario campo firma del tutor universitario
* @param firma_tutor_aziendale campo firma del tutor aziendale
*/
 
  public DomandaTirocinio(int id_Documento,/* String az ,*/int firma_tutor_universitario,  
      int firma_tutor_aziendale, int firma_dir_az, int firma_dir_dip, 
      String tutoUnirEmanil,  String tirocinanteEmail, String tutoAzrEmanil) {
 
    this.Id_Documento = id_Documento;
    //this.Azienda=az;
    this.TirocinanteEmail = tirocinanteEmail;
    this.tutoAzrEmanil = tutoAzrEmanil;
    this.tutoUnirEmanil = tutoUnirEmanil;
    this.firma_dir_az = firma_dir_az;
    this.firma_dir_dip = firma_dir_dip;
    this.Firma_tutor_universitario = firma_tutor_universitario;
    this.Firma_tutor_aziendale = firma_tutor_aziendale;
  }

  /**
* Metodo di Accesso.
* @return Id_Documento identificativo univoco del documento.
*/
  
  public int getId_Documento() {
    return Id_Documento;
  }
  /**
* Metodo di modifica.
* Imposta l'identificativo univoco del documento.
* @param id_Documento identificativo univoco del documento (tipo int)
*/
  
  public void setId_Documento(int id_Documento) {
    this.Id_Documento = id_Documento;
  }
  /**
* Metodo di accesso.
* Restituisce il nome dell'azienda presso cui viene svolto il tirocinio.
* @return Azienda 
*/

  public String getAzienda() {
    return Azienda;
  }
  /**
* Metodo di modifica.
* Imposta il nome dell'azienda presso cui verrà svolto il tirocinio-
* @param azienda Nome dell'azienda (tipo string).
*/
  
  public void setAzienda(String azienda) {
    this.Azienda = azienda;
  }
  /**
* Metodo di accesso.
* restiruisce l'autore della domanda.
* @return autore
*/
  
  public String getAutore() {
    return autore;
  }
  /**
* Metodo di modifica.
* Imposta l'autore della domanda
* @param autore Autore della domanda (tipo string).
*/
  
  public void setAutore(String autore) {
    this.autore = autore;
  }
  /**
* Metodo di accesso.
* Restituisce l'email del tirocinante
* @return TirocinanteEmail
*/
  
  public String getTirocinanteEmail() {
    return TirocinanteEmail;
  }
  /**
* Metodo di modifica.
* Imposta l'email del tirocinante
* @param tirocinanteEmail Email del tirocinante (tipo String).
*/

  public void setTirocinanteEmail(String tirocinanteEmail) {
    this.TirocinanteEmail = tirocinanteEmail;
  }
  /**
* Metodo di accesso.
* Restituisce l'email del tutor aziendale (tipo string).
* @return tutoAzrEmanil
*/
  
  public String getTutoAzrEmanil() {
    return tutoAzrEmanil;
  }
  /**
* Metodo di modifica.
* Imposta l'email del tutor aziendale
* @param tutoAzrEmanil Email del tutor aziendale (tipo string).
*/
  
  public void setTutoAzrEmanil(String tutoAzrEmanil) {
    this.tutoAzrEmanil = tutoAzrEmanil;
  }
  /**
* Metodo di accesso.
* Restituisce l'email del tutor universitario (tipo string).
* @return tutoUnirEmanil;
*/
  
  public String getTutoUnirEmanil() {
    return tutoUnirEmanil;
  }
  /**
* Metodo di accesso.
* Indica se il documento risulta firmato dal dirigente di azienda
* @return firma_dir_az
*/
  
  public int getFirma_dir_az() {
    return firma_dir_az;
  }
  /**
* Metodo di modifica.
* Imposta il campo firma della domanda da parte del dirigente di azienda
* @param firma_dir_az firma del dirigente di azienda.
*/
  
  public void setFirma_dir_az(int firma_dir_az) {
    this.firma_dir_az = firma_dir_az;
  }
  /**
* Metodo di accesso.
* Indica se il documento risulta firmato dal direttore di dipartimento.
* @return firma_dir_dip
*/
  
  public int getFirma_dir_dip() {
    return firma_dir_dip;
  }
  /**
* Metodo di modifica.
* Imposta il campo firma della domanda da parte del direttore di dipartimento
* @param firma_dir_dip firma del direttore di dipartimento.
*/
  
  public void setFirma_dir_dip(int firma_dir_dip) {
    this.firma_dir_dip = firma_dir_dip;
  }
  /**
* Metodo di modifica.
* Imposta l'email del tutor universitario.
* @param tutoUnirEmanil Email del tutor universitario (tipo string).
*/

  public void setTutoUnirEmanil(String tutoUnirEmanil) {
    this.tutoUnirEmanil = tutoUnirEmanil;
  }
  /**
* Metodo di accesso.
* Restituisce la data in cui è stata sottoposta la domanda di tirocinio.
* @return da
*/
  
  public String getData() {
    return  da; 
  }
  /**
* Metodo di modifica.
* Imposta la data in cui viene sottoposta la domanda di tirocinio.
* @param data data della creazione della domanda di trocinio
*/

  public void setData(Date data) {
    this.DataO = data;
  }
  /**
* Metodo di accesso.
* Indica se il documento risulta firmato dal tutor universitario.
* @return Firma_tutor_universitario
*/
  
  public int getFirma_tutor_universitario() {
    return Firma_tutor_universitario;
  }
  /**
* Metodo di modifica.
* Imposta il campo firma della domanda da parte del tutor universitario
* @param firma_tutor_universitario firma del tutor universitario.
*/

  public void setFirma_tutor_universitario(int firma_tutor_universitario) {
    this.Firma_tutor_universitario = firma_tutor_universitario;
  }
  /**
* Metodo di accesso.
* Indica se il documento risulta firmato dal tutor aziendale.
* @return Firma_tutor_aziendale
*/
  
  public int getFirma_tutor_aziendale() {
    return Firma_tutor_aziendale;
  }
  /**
* Metodo di modifica
* Imposta il campo firma della domanda da parte del tutor aziendale.
* @param firma_tutor_aziendale firma del tutor aziendale.
*/

  public void setFirma_tutor_aziendale(int firma_tutor_aziendale) {
    this.Firma_tutor_aziendale = firma_tutor_aziendale;
  }

}
