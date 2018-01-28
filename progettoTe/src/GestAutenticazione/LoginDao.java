package GestAutenticazione;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Db.Connector;
import bean.Azienda;
 
 

public class LoginDao {

	public LoginDao() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean RicercaAccout(String email, String password, String tipoAcc) throws SQLException
	{
		String mail , pw;
		Connection conn = Connector.getConnection();

		String sql = "SELECT * FROM "+tipoAcc+" WHERE Email='"+email+"' AND Password='"+password+"'";
//

			

		 	 
		 		 java.sql.Statement st  = conn.createStatement();
		 		  ResultSet rs = st.executeQuery(sql);
		 		  
		 		 while(rs.next()){

		 		    
		 		      mail = rs.getString("Email");
		 		      pw= rs.getString("Password");
		 		     System.out.println(mail+"....  "+pw); 
		 		    if ((mail.equals(email) && (pw.equals(password))  )){
			 			return true;
			 		}
                 }	
		 	 
		 		  
		 		 
		 		rs.close();
		 		conn.close();
		 		
				return false;
		 	 
 			
		 	}
		 }

 
