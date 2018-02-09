package tirocinio.registro.gestore;

import bean.Attività;
import java.util.ArrayList;
import java.util.List;
 
/**
 * Classe che permette la gestione di una lista di attivtà-
 * @author Madu
 *
 */
public class ListaAttività {

  private List<Attività> attivity;
	
  /**
   * Costruttore nullo.
   * Istanzia un arraylist di attività.
   */
  public ListaAttività() {
    this.attivity = new ArrayList<Attività>();
  }
	
  /**
   * Restituisce la lista delle attività.
   * @return
   */
  public List<Attività> getAttività() {
    return attivity;
  }
	
  /**
   * Aggiunge un'attività alla lista.
   * @param reg
   */
  public void aggiungi(Attività reg) {
    attivity.add(reg);
  }
}