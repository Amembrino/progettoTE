package tirocinio.registro.gestore;

import java.util.ArrayList;
import java.util.List;

import bean.Attivity;
 
 

public class ListaAttività {

	private List<Attivity> attivity;
	
	
	public ListaAttività() {
		this.attivity = new ArrayList<Attivity>();
	}
	
	 public List<Attivity> getAttività() {
		    return attivity;
		  }
	
	 public void aggiungi(Attivity reg) {
		 attivity.add(reg);
		  }
}
