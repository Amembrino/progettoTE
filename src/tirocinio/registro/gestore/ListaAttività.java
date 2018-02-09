package tirocinio.registro.gestore;

import bean.Attivit�;
import java.util.ArrayList;
import java.util.List;
 
/**
 * Classe che permette la gestione di una lista di attivt�-
 * @author Madu
 *
 */
public class ListaAttivit� {

  private List<Attivit�> attivity;
	
  /**
   * Costruttore nullo.
   * Istanzia un arraylist di attivit�.
   */
  public ListaAttivit�() {
    this.attivity = new ArrayList<Attivit�>();
  }
	
  /**
   * Restituisce la lista delle attivit�.
   * @return
   */
  public List<Attivit�> getAttivit�() {
    return attivity;
  }
	
  /**
   * Aggiunge un'attivit� alla lista.
   * @param reg
   */
  public void aggiungi(Attivit� reg) {
    attivity.add(reg);
  }
}