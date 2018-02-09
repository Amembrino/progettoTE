package autenticazione.gestore.test;




import static org.junit.Assert.*;

import autenticazione.gestore.LoginDao;

import org.junit.Test;




/**
 * Classe per testare le funzionalità di login.
 * @author Alfredo
 *
*/
public class LoginDaoTest {

  /**
* Test method for {@link autenticazione.gestore.LoginDao#LoginDao()}.
*/
  @Test
  public void testLoginDao() {
    LoginDao dao = new LoginDao();
    assertNotNull(dao);
  }

}
