package bean;

import java.util.ArrayList;
import java.util.List;
 
/**
 * Classe ListDomandetiro, serve a gestire l'elenco delle domande di tirocinio.
 */
public class ListDomandeTiro {

  private List<DomandaTirocinio> domande;

  /**
* Costruttore nullo.
* Crea un oggetto ListDomandetiro, come Arraylist di elementi di tipo DomandaTirocinio
*/

  public ListDomandeTiro() {
    this.domande = new ArrayList<DomandaTirocinio>();
  }

  /**
* Metodo di accesso.
* Restituisce l'elenco delle domande di tirocinio
* @return domande
*/

  public List<DomandaTirocinio> getDomande() {
    return domande;
  }
    
    
  //  public void aggiungi(int idDOcu , String azienda, Date data, Boolean 
  // firma_tutor_universitario, Boolean firma_tutor_aziendale, String 
  // SyttutoUnirEmanil, String tirocinanteEmail, String tutoAzrEmanil)
  //  {
  //  DomandaTirocinio dom = new  DomandaTirocinio(idDOcu,azienda,data,firma_tutor_universitario,
  //  firma_tutor_aziendale,SyttutoUnirEmanil,tirocinanteEmail, tutoAzrEmanil);
  //    domande.add(dom);
  //    }
    
  /**
* Metodo di inserimento
* Aggiunge una domanda di tirocinio alla lista esistente.
* @param domanda Oggetto di tipo DomandaTirocinio
*/
  
  public void aggiungi(DomandaTirocinio domanda) {
    domande.add(domanda);
  }

}
