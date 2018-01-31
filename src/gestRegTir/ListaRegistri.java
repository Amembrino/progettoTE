package gestRegTir;

import java.util.ArrayList;
import java.util.List;

import bean.DomandaTirocinio;
import gestRegTir.Registro;


public class ListaRegistri {
	private List<Registro> registri;	

	 
	 public ListaRegistri() {
	        this.registri = new ArrayList<Registro>();
	    }

	    public List<Registro> getRegistri() {
	        return registri;
	    }
	    
	    public void aggiungi(Registro reg){
	    	registri.add(reg);
	    }

	    
}
