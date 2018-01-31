/**
 * @author felice
 *
 */
package bean;

import java.util.ArrayList;
import java.util.List;


/**
 * classe lista aziende contiene una lista di ogetti bean.Azienda
 *
 */
public class ListaAziende {
	
	private List<Azienda> Aziende;
	
	/**
	 * costruttore
	 */
	public ListaAziende(){
		this.Aziende= new ArrayList<Azienda>();
	}
	
	/**
	 *@return= lista di aziende
	 */
	public List<Azienda> getAzienda(){
		return Aziende;
	}
	
//	public void aggiungi( String nome, String sede_Operativa, String sede_Amministrativa, String dir_AziendaEmail,
//			String tutor_AziendaEmail, int id_Azienda, Boolean convenzionata ) {
//		
//		Azienda az = new Azienda( nome, sede_Operativa,  sede_Amministrativa, dir_AziendaEmail,
//				tutor_AziendaEmail, id_Azienda, convenzionata );
//	}
	/**
	 * @post = aggiunge un azienda nella lista
	 */
	public void aggiungi (Azienda a){
		Aziende.add(a);
	}

}
