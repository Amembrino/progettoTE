package bean;

import java.util.ArrayList;
import java.util.List;


/**
* Classe ListaAziende, gestisce una lista di oggetti Azienda.
* @author felice
*/
public class ListaAziende {

  private List<Azienda> Aziende;

  /**
* Costruttore nullo, crea un oggetto ListaAziende, arraylist di elementi di tipo Azienda.
*/
  
  public ListaAziende() {
    this.Aziende = new ArrayList<Azienda>();
  }

  /**
* Metodo di accesso.
* Restituisce l'elenco delle aziende
* @return Aziende
*/

  public List<Azienda> getAzienda() {
    return Aziende;
  }

  // public void aggiungi( String nome, String sede_Operativa, String sede_Amministrativa, 
  // String dir_AziendaEmail,
  // String tutor_AziendaEmail, int id_Azienda, Boolean convenzionata ) {
  //
  // Azienda az = new Azienda( nome, sede_Operativa,  sede_Amministrativa, dir_AziendaEmail,
  // tutor_AziendaEmail, id_Azienda, convenzionata );
  // }
  
  /**
* Metodo di inserimento
* Aggiunge un'azienda all'elenco.
* @param a Azienda da aggiungere all'elenco.
*/

  public void aggiungi(Azienda a) {
    Aziende.add(a);
  }
}
