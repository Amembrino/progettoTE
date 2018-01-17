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
/** Creazione di un nuovo registro tirocinante nel db. Da aggiungere metodo per data odierna per l'inserimento*/
public class createRegistroDAO {
	String ip = "localhost";
	String port = "3306";
	String db = "tiro";
	String username = "root";
	String password = "root";
    
	public createRegistroDAO() {
	}
				
				public void CreaRegistro(int ID_Tirocinio, Date Data_Attivazione, int Convalida_Tutor_Az, String Tirocinante_Email, String Tutor_Aziendale_Email)  {
					try {
						Class.forName("com.mysql.jdbc.Driver");
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Connection conn = null;
					 Statement stmt = null;
					
					String sql=" INSERT INTO  Registro_Tirocinio  (ID_Tirocinio, Data_Attivazione, Convalida_Tutor_Az, Tirocinante_Email, Tutor_Aziendale_Email) "
							+ "VALUES ('"+ID_Tirocinio+"' '"+Data_Attivazione+"', '"+Convalida_Tutor_Az+"', '"+Tirocinante_Email+"','"+Tutor_Aziendale_Email+"')";
					
					 
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
	