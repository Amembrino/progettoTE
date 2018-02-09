package tirocinio.domanda.gestore.test;

import static org.junit.Assert.assertNotNull;

import bean.ListaAziende;
import java.sql.SQLException;
import org.junit.Test;
import tirocinio.domanda.gestore.ListaAziendeDao;



public class ListaAziendeDaoTest {

  @Test
  public void testFillListaAziende() throws ClassNotFoundException, SQLException {
    ListaAziende azienda = new ListaAziende(); 
    azienda.getAzienda();
    ListaAziendeDao lista = new ListaAziendeDao();
    lista.fillListaAziende(azienda);
    assertNotNull(lista);
  }

}
