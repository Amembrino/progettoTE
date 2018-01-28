package gestRegTir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import Db.Connector;

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

	  Statement st;
	  ResultSet rs;
	  String Tirocinante, Tutor_Aziendale_Email,data;
	
	public createRegistroDAO() {
	}
	
	/**Metodo che preleva i dati dalla domanda di tirocinio*/
	public void getDatiDomanda(int id){ //Restituisce in output i dati riguardanti il contratto dalla tabella "parco"
		Connection con= Connector.getConnection();
		 
			
		
	
		String query="SELECT * FROM domanda_di_tirocinio WHERE Id_Documento="+id;
		try{
			java.sql.Statement  stmt = con.createStatement();
			 rs=stmt.executeQuery(query);
			 
	while(rs.next())
			 {
		Tirocinante=rs.getString("TirocinanteEmail");
		Tutor_Aziendale_Email=rs.getString("Tutor_Aziendale_Email");

			 }
	stmt.close();
	con.close();
		 }
		catch(Exception ex){System.out.println(ex);
		 }
		/**Istanzia un oggetto Registro con i dati prelevati*/
		Registro rg=new Registro(id,0,Tirocinante, Tutor_Aziendale_Email);
		/**Preleva la data odierna dal Registro creato*/
		data=rg.getData();
		
	}

/**metodo che crea il registro all'interno del db*/
	public void CreaRegistro(int ID_Tirocinio, int Convalida_Tutor_Az)  {
	try {		
		
  Class.forName("com.mysql.jdbc.Driver");
  } catch (ClassNotFoundException e) {
		
				e.printStackTrace();
					}
			Connection conn = null;
		 Statement stmt = null;
		 System.out.println(Tirocinante.toString());
			 String t=Tirocinante;
		 String tu=Tutor_Aziendale_Email;
		 
		 
		String sql=" INSERT INTO  registro_tirocinio  (ID_Tirocinio, Data_Attivazione, Convalida, "
				+ "Tirocinante_Email, Tutor_Aziendale_Email)"
				+ " VALUES ('"+ID_Tirocinio+"', '"+data+"', '"+Convalida_Tutor_Az+"', '"+t+"','"+tu+"');";
				 
		try {
			conn = DriverManager.getConnection("jdbc:mysql://"+ ip+":"+ port+"/"+db, username, password);
					 
					 
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
					  
						stmt.close();
						conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					 
					System.out.println(sql);	
			}
				
				
		
		}
	
