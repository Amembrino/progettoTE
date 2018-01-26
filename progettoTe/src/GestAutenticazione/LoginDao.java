package GestAutenticazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Db.Connector;
import GestDomTirocino.DriverManagerConnectionPool;
 

public class LoginDao {

	public LoginDao() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean RicercaAccout(String email, String password, String tipoAcc) throws SQLException
	{
		 
		Connection conn = Connector.getConnection();

		String sql = "SELECT * FROM "+tipoAcc+" WHERE Email='"+email+"' AND Password='"+password+"'";

		
			PreparedStatement st = conn.prepareStatement(sql);


			ResultSet rs = st.executeQuery();
			  //boolean x=((rs.getString("password").equalsIgnoreCase(password.toString())));
			boolean x=false;
			boolean userExists = rs.next();
    // System.out.println(x);
			
        

			if (userExists)
			{
				if(rs.getString("password").equals(password.toString()))
					x=true;
			}
			
			st.close();
			conn.close();
			if(x) return true;
			else return false;
			
			
	}

}
