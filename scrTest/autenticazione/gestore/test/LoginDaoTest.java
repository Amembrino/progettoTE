/**
 * 
 */
package autenticazione.gestore.test;

import static org.junit.Assert.*;

import org.junit.Test;

import autenticazione.gestore.LoginDao;

/**
 * @author Alfredo
 *
 */
public class LoginDaoTest {

	/**
	 * Test method for {@link autenticazione.gestore.LoginDao#LoginDao()}.
	 */
	@Test
	public void testLoginDao() {
		LoginDao dao=new LoginDao();
		assertNotNull(dao);
	}

}
