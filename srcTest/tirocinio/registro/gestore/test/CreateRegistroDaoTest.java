package tirocinio.registro.gestore.test;

import static org.junit.Assert.*;

import org.junit.Test;

import bean.DomandaTirocinio;
import tirocinio.registro.gestore.CreateRegistroDao;

import java.sql.SQLException;
import org.junit.Assert;
import org.junit.Test;

public class CreateRegistroDaoTest {
	private CreateRegistroDao crd = new CreateRegistroDao();
	private DomandaTirocinio doma = new DomandaTirocinio(5, 1, 1,1,1, "CDelizia@unisa.it", "alfredoangrisani@studenti.unisa.it",  "AntonioPenna@azienda.it");
	
	
	@Test
	public void CreaRegistroTest() throws SQLException, ClassNotFoundException {
		boolean flag = crd.CreaRegistro(5, 0);
	    assertNotNull(crd);
 
        assertTrue(crd.CreaRegistro(5, 0));
	}

}
