package bean;

import java.util.ArrayList;
import java.util.List;

public class ListaAziende {
	
	private List<Azienda> Aziende;
	
	public ListaAziende(){
		this.Aziende= new ArrayList<Azienda>();
	}
	
	public List<Azienda> getAzienda(){
		return Aziende;
	}
	
	public void aggiungi( String nome, String sede_Operativa, String sede_Amministrativa, String dir_AziendaEmail,
			String tutor_AziendaEmail, int id_Azienda, Boolean convenzionata ) {
		
		Azienda az = new Azienda( nome, sede_Operativa,  sede_Amministrativa, dir_AziendaEmail,
				tutor_AziendaEmail, id_Azienda, convenzionata );
	}
	
	public void aggiungi (Azienda a){
		Aziende.add(a);
	}

}
