package GestAutenticazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import GestDomTirocino.DriverManagerConnectionPool;
 

public class LoginDao {

	public LoginDao() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean RicercaAccout(String email, String password, String tipoAcc) throws SQLException
	{
		Connection conn = DriverManagerConnectionPool.getConnection();

		String sql = "SELECT * FROM "+tipoAcc+" WHERE Email='"+email+"' AND Password='"+password+"'";

		try
		{
			PreparedStatement st = conn.prepareStatement(sql);


			ResultSet rs = st.executeQuery();

			boolean userExists = rs.next();

			st.close();
			conn.close();

			if (userExists)
				return true;
			else return false;

		}
		catch (SQLException e)
		{
			throw new RuntimeException(
					"Database error in UserDataDao.RicercaAccount", e);
		}
	}

}
