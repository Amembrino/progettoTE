package tirocinio.domanda.gestore;

import java.sql.SQLException;

import bean.DomandaTirocinio;
import bean.ListDomandeTiro;

public interface DomaTirociDaoInterface {

	 public int getMaxOrd() throws SQLException;
	 
	 public boolean compilaDoma(DomandaTirocinio data) throws SQLException ;
	 
	 public boolean fillDomandeTutorAz(ListDomandeTiro listaDomande, String taz)   throws SQLException, ClassNotFoundException ;
	 
	 public boolean fillDomandeDirAz(ListDomandeTiro listaDomande, String daz)   throws SQLException, ClassNotFoundException;
	 
	 public boolean fillDomandeTutorUni(ListDomandeTiro listaDomande, String tutorUni)  throws SQLException, ClassNotFoundException;
	 
	 public boolean  fillListaDomandeDirDip(ListDomandeTiro listaDomande, String dirdip);
	 
	 public boolean firmaTAz(int id) ;
	 
	 public boolean firmaTuni(int id) ;
	 
	 public boolean firmaDirAz(int id) ;

	public boolean attivaTirocinio(int id) ;
	 
	 public boolean firmaDirDip(int id);
	 
	 public boolean domandaPresente (String tirEm);
	
}
