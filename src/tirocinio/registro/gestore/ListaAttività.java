package tirocinio.registro.gestore;

import java.util.ArrayList;
import java.util.List;
 
 
import bean.Attivit�;
 
 

public class ListaAttivit� {

	private List<Attivit�> attivity;
	
	
	public ListaAttivit�() {
		this.attivity = new ArrayList<Attivit�>();
	}
	
	 public List<Attivit�> getAttivit�() {
		    return attivity;
		  }
	
	 public void aggiungi(Attivit� reg) {
		 attivity.add(reg);
		  }
}
