package tirocinio.registro.gestore;

import java.util.ArrayList;
import java.util.List;
 
 
import bean.Attività;
 
 

public class ListaAttività {

	private List<Attività> attivity;
	
	
	public ListaAttività() {
		this.attivity = new ArrayList<Attività>();
	}
	
	 public List<Attività> getAttività() {
		    return attivity;
		  }
	
	 public void aggiungi(Attività reg) {
		 attivity.add(reg);
		  }
}
