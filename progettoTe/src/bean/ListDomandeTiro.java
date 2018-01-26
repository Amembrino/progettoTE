package bean;

import java.util.ArrayList;
import java.util.List;
 
public class ListDomandeTiro {

	 
    private List<DomandaTirocinio> domande;

    
    public ListDomandeTiro() {
        this.domande = new ArrayList<DomandaTirocinio>();
    }

    public List<DomandaTirocinio> getDomande() {
        return domande;
    }
    
    
//    public void aggiungi(int idDOcu , String azienda, Date data, Boolean firma_tutor_universitario, Boolean firma_tutor_aziendale, String SyttutoUnirEmanil, String tirocinanteEmail, String tutoAzrEmanil)
//    		{
//    	DomandaTirocinio dom = new  DomandaTirocinio(idDOcu,azienda,data,firma_tutor_universitario,firma_tutor_aziendale,SyttutoUnirEmanil,tirocinanteEmail, tutoAzrEmanil);
//    	domande.add(dom);
//    }
    
    public void aggiungi(DomandaTirocinio domanda){
    	domande.add(domanda);
    }

}
