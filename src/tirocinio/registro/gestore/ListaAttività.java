package tirocinio.registro.gestore;

import java.util.ArrayList;
import java.util.List;

import bean.Attivity;
 
 

public class ListaAttivitą {

	private List<Attivity> attivity;
	
	
	public ListaAttivitą() {
		this.attivity = new ArrayList<Attivity>();
	}
	
	 public List<Attivity> getAttivitą() {
		    return attivity;
		  }
	
	 public void aggiungi(Attivity reg) {
		 attivity.add(reg);
		  }
}
