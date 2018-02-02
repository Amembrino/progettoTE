package autenticazione.gestore.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import autenticazione.gestore.LoginDao;

import java.sql.SQLException;
import org.junit.Test;

/**
 * @author Alfredo
 *
 */
public class RicercaAccountTest {

    /**
     * Test method for {@link autenticazione.gestore.LoginDao#RicercaAccout(java.lang.String,
     * java.lang.String, java.lang.String)}.
     * @throws SQLException 
     */
  @Test
  public void testRicercaAccout() throws SQLException {
    LoginDao dao = new LoginDao();
    assertTrue(dao.ricercaAccout("V.Marciano63@studenti.unisa.it", "bts", "tirocinante"));
    assertFalse(dao.ricercaAccout("V.Mdaiano63@studenti.unisa.it", "bts", "tirocinante"));
    assertFalse(dao.ricercaAccout("V.Mdaiano63@studenti.unisa.it", "ads", "tirocinante"));
    assertFalse(dao.ricercaAccout("V.Mdaiano63@studenti.unisa.it", "bts", "amministratore"));
    assertFalse(dao.ricercaAccout("V.Marciano63@studenti.unisa.it", "bts", "amministratore"));
    assertFalse(dao.ricercaAccout("V.Marciano63@studenti.unisa.it", "sts", "tirocinante"));
    assertFalse(dao.ricercaAccout(null, "sts", "tirocinante"));
    assertFalse(dao.ricercaAccout("V.Marciano63@studenti.unisa.it", null, "tirocinante"));
    assertFalse(dao.ricercaAccout(null, null, "tirocinante"));
  }
}
