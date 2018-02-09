package tirocinio.domanda.gestore;

import bean.ListaAziende;
import java.sql.SQLException;

public interface ListaAziendeDaoInterface {

  public void fillListaAziende(ListaAziende Azienda)
      throws SQLException, ClassNotFoundException;
}
