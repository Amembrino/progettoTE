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
	String db = "tirocinioeasy";
	String username = "root";
	String password = "root";
    
	public createRegistroDAO() {
	}
				/**metodo che crea il registro all'interno del db*/
				public void CreaRegistro(int ID_Tirocinio, int Convalida_Tutor_Az)  {
					try {
						Class.forName("com.mysql.jdbc.Driver");
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Connection conn = null;
					 Statement stmt = null;
					
					String sql=" INSERT INTO  Registro_Tirocinio  (ID_Tirocinio, Data_Attivazione, Convalida_Tutor_Az, Tirocinante_Email, Tutor_Aziendale_Email) "
							+ "VALUES ('"+ID_Tirocinio+"' '"+data+"', '"+Convalida_Tutor_Az+"', '"+Tirocinante+"','"+Tutor_Aziendale_Email+"')";
					
					 
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
				/**Metodo che preleva i dati dalla domanda di tirocinio*/
				public void getDatiDomanda(int id){ //Restituisce in output i dati riguardanti il contratto dalla tabella "parco"
					
					String query="SELECT * FROM domanda_di_tirocinio WHERE Id_Documento="+id;
					try{
					
						 rs=st.executeQuery(query);
						 
				while(rs.next())
						 {
					Tirocinante=rs.getString("Tirocinante_Email");
					Tutor_Aziendale_Email=rs.getString("Tutor_Aziendale_Email");

						 }
					 }catch(Exception ex){System.out.println(ex);
					 }
					/**Istanzia un oggetto Registro con i dati prelevati*/
					Registro rg=new Registro(id,0,Tirocinante, Tutor_Aziendale_Email);
					/**Preleva la data odierna dal Registro creato*/
					data=rg.getData();
					
				}
				private Statement st;
				private ResultSet rs;
				private String Tirocinante, Tutor_Aziendale_Email,data;
		}
	