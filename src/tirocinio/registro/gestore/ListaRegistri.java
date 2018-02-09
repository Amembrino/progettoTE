package tirocinio.registro.gestore;

//import bean.DomandaTirocinio;
import bean.Registro;
import java.util.ArrayList;
import java.util.List;


/**
 * Classe ListaRegistri, serve a gestire l'elenco dei registri di tirocinio.
 */
public class ListaRegistri {
  private List<Registro> registri;
  /**
 * Costruttore nullo.
 * Crea un oggetto ListaRegistri, come Arraylist di elementi di tipo Registro
 */
  
  public ListaRegistri() {
    this.registri = new ArrayList<Registro>();
  }
  /**
 * Metodo di accesso.
 * Restituisce l'elenco dei registri
 * @return registri
 */

  public List<Registro> getRegistri() {
    return registri;
  }
  /**
 * Metodo di inserimento
 * Aggiunge un registro di tirocinio alla lista esistente.
 * @param reg Oggetto di tipo Registro
 */

  public void aggiungi(Registro reg) {
    registri.add(reg);
  }
   
}