package gestRegTir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import GestDomTirocino.DriverManagerConnectionPool;
import bean.Azienda;
import bean.ListaAziende;
import bean.Tirocinante;

public class RegistroDAO {
	String ip = "localhost";
	String port = "3306";
	String db = "tiro";
	String username = "root";
	String password = "root";
    
	public RegistroDAO(){
		
	}
		
		public void RegistroTirocinante( int ore, String data, String comm )  {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Connection conn = null;
			 Statement stmt = null;
			
			String sql=" INSERT INTO  attività  (ID_Attività, Data, Ora, Luogo, Descrizione, Registro_TirocinioID) "
					+ "VALUES (NULL, '"+data+"', '"+ore+"', '"+comm+"', 'bo', '1')";
			
			 
			 try {
				conn = DriverManager.getConnection("jdbc:mysql://"+ ip+":"+ port+"/"+db, username, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			 try {
				stmt = conn.createStatement();
				stmt.executeUpdate(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	 
			 
			 try {
				 stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			System.out.println(sql);	
	}
		
}