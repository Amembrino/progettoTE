/**
 * 
 * @author antonio
 * 
 */
package GestDomTirocino;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Random;

import com.mysql.jdbc.Statement;

import bean.DomandaTirocinio;
import bean.ListDomandeTiro;
import bean.tutorAz;
 
import GestDomTirocino.DriverManagerConnectionPool;
 

public class DoDomaTirociDAO {

	public DoDomaTirociDAO()   {
	 }
	
	public void compilaDoma(DomandaTirocinio Data) throws SQLException    {
		 System.out.println("tutor aziendaleemail  "+ Data.getTutoAzrEmanil().toString()+" email tirocinante   "+ Data.getTirocinanteEmail().toString()+" email tutr uni   "+Data.getTutoUnirEmanil());
		 
		Random ran=new Random();
	int x=	ran.nextInt(200);
		
		  java.util.Date Dat  = new java.util.Date();
		new java.sql.Date(Dat.getTime());
		SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
		   String da=dt1.format(Dat );
		
		  
         
		  int flse=0;
		 
		  Connection connection = null;
			PreparedStatement st = null;
     
		
       String sql2=" INSERT INTO  domandaTirocinio (IdDoccumento, Azienda, data,"
    		+ " FirmatutorUniversitario, FirmaTutorAziendale, TutorUniversitarioEmail,"
    		+ " TirocinanteEmail, TutorAziendaleEmail, attivato) "
    		+ "VALUES (?,?,?,?,?,?,?,?,?) ";
   	try { 
       connection = DriverManagerConnectionPool.getConnection();
		st = connection.prepareStatement(sql2);
		
	st.setInt(1, x );
	st.setString(2,Data.getAzienda());
	st.setString(3,da );
	st.setInt(4, 0);
	st.setInt(5, 0);	
	st.setString(6, Data.getTutoUnirEmanil());
	st.setString(7, Data.getTirocinanteEmail() );
	st.setString(8, Data.getTutoAzrEmanil() );
    st.setInt(9, 0);	
   
    st.executeUpdate();

	connection.commit();
} finally {
	try {
		if (st != null)
			st.close();
	} finally {
		DriverManagerConnectionPool.releaseConnection(connection);
	}
   }
  }
	
	
	
	public void fillDomadeTiroTA(ListDomandeTiro listaDomande, String taz) throws SQLException{
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
	    
	    
		String nome=taz;
		String selectSQL="select * from domandatirocinio where TutorAziendaleEmail= '"+taz+"' ";
	
		try {
			connection = DriverManagerConnectionPool.getConnection();
			preparedStatement = connection.prepareStatement(selectSQL);
			preparedStatement.setInt(1, 1111);
  
			
		
			ResultSet res = preparedStatement.executeQuery();

			while (res.next()) {
				DomandaTirocinio domanda=new DomandaTirocinio();
				
				domanda.setId_Documento(res.getInt("IdDoccumento"));
				domanda.setAttivato(false);
				domanda.setAzienda(res.getString("azienda"));
				domanda.setData(res.getDate("data"));
				domanda.setFirma_tutor_universitario(res.getBoolean("FirmatutorUniversitario"));
				domanda.setFirma_tutor_aziendale( res.getBoolean("FirmaTutorAziendale") );
				domanda.setTutoUnirEmanil(	res.getString("TutorUniversitarioEmail"));
				domanda.setTirocinanteEmail( res.getString("TirocinanteEmail"));
				domanda.setTutoAzrEmanil(res.getString("TutorAziendaleEmail"));
			
				listaDomande.aggiungi(  domanda );
				
			}
			 
		}  finally {
			try {
				if (preparedStatement != null)
					preparedStatement.close();
			} finally {
				DriverManagerConnectionPool.releaseConnection(connection);
			}
		
	}
  }
	
}