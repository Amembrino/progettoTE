package tirocinio.domanda.gestore;

import java.sql.SQLException;

import bean.ListaAziende;

public interface ListaAziendeDaoInterface {

	 public void fillListaAziende(ListaAziende Azienda) throws SQLException, ClassNotFoundException ;
}
