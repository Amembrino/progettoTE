
package GestDomTirocino;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import Db.Connector;
import bean.DomandaTirocinio;
import bean.ListDomandeTiro;
import gestRegTir.createRegistroDAO;

 

public class DomaTirociDAO {
	
	String ip = "localhost";
	String port = "3306";
	String db = "tirocinioeasy";
	String username = "root";
	String password = "root";
	
	
	public DomaTirociDAO()   {
	 }

    public int getMaxOrd() throws SQLException {
        Connection conn = Connector.getConnection();
        Statement st = conn.createStatement();

            String sql = "SELECT Id_Documento FROM domanda_di_tirocinio"
            		+ " WHERE Id_Documento=( SELECT max(Id_Documento) FROM domanda_di_tirocinio )";

            ResultSet res = st.executeQuery(sql);
            int ord ;
            if (res.next()) {
                ord = res.getInt(1);
                if (res.wasNull()) {    // in case of empty table
                    ord = -1;
                    // no elements => return (-1), so that first element will be #0
                }
            } else {
                ord = -1;
            }

            st.close();
            conn.close();

            return ord;
            }        
     
	public void compilaDoma(DomandaTirocinio Data) throws SQLException    {
		
  
//		Random ran=new Random();
//	    int x=	ran.nextInt(200);
		
		  java.util.Date Dat  = new java.util.Date();
		new java.sql.Date(Dat.getTime());
		SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
		   String da=dt1.format(Dat );
		
		   Connection connection = null;
			PreparedStatement st = null;
		 
	    String sql2=" INSERT INTO domanda_di_tirocinio  (Id_Documento, Data, Firma_tutor_universitario, Firma_tutor_aziendale, "
       		+ "Firma_dirigente_az, Firma_dir_dip, Tutor_UniversitarioEmail, TirocinanteEmail, dir_dipartimentoEmail, Tutor_Aziendale_Email) "
    		+ "VALUES (?,?,?,?,?,?,?,?,?,?) ";
   	try { 
       connection = Connector.getConnection();
		st = connection.prepareStatement(sql2);
		
		int c= getMaxOrd();
		c++;
		System.out.println(c);
	st.setInt(1, c);
//	st.setString(2,Data.getAzienda() );
	st.setString(2,da);
    st.setInt(3,0 );
	st.setInt(4, 0);
	st.setInt(5, 0);
	st.setInt(6, 0);
	st.setString(7, Data.getTutoUnirEmanil());
	st.setString(8, Data.getTirocinanteEmail() );
	st.setString(9, "Fulgenzio@unisa.it");
	st.setString(10,Data.getTutoAzrEmanil());
	 
	System.out.println(sql2);
 
    st.executeUpdate();

 
  }catch (Exception e) {
	  throw new RuntimeException( "Database error   ", e);
	  }
}
	
	
	
	public void fillDomadeTiroTA_DB(ListDomandeTiro listaDomande, String taz) throws SQLException, ClassNotFoundException{
    	Connection newConnection = null;
//		PreparedStatement preparedStatement = null;
		
		
	    
		String nome=taz;
		String sql="select * from domanda_di_tirocinio where Tutor_Aziendale_Email= '"+nome+"' and Firma_Tutor_Aziendale='0'";
      String dirAzEm, TutorUniversitarioEmail, TirocinanteEmail, TutorAziendaleEmail;
      int id, FirmatutorUniversitario, firma_tutor_aziendale, firma_dir_az, firma_dir_dip;
      Date data;
      
		    //STEP 2: Register JDBC driver
		   
   
		   newConnection = Connector.getConnection();
		
		 	try{
		 		 java.sql.Statement st  = newConnection.createStatement();
		 		  ResultSet rs = st.executeQuery(sql);
     	
		 		  while(rs.next()){
			
		    //Retrieve by column name
		     id  = rs.getInt("Id_Documento");
		     data = rs.getDate("Data") ;
		     FirmatutorUniversitario = rs.getInt("Firma_tutor_universitario");
		     firma_tutor_aziendale = rs.getInt("Firma_tutor_aziendale");
		     firma_dir_az=rs.getInt("Firma_dirigente_az");
		     firma_dir_dip=rs.getInt("Firma_dir_dip");
		     TutorUniversitarioEmail=rs.getString("Tutor_UniversitarioEmail");
		     TirocinanteEmail=rs.getString("TirocinanteEmail");
		     TutorAziendaleEmail=rs.getString("Tutor_Aziendale_Email");
         
		     
		     DomandaTirocinio doma =new DomandaTirocinio(id, FirmatutorUniversitario, firma_tutor_aziendale, firma_dir_az, firma_dir_dip, TutorUniversitarioEmail, TirocinanteEmail, TutorAziendaleEmail);
			  listaDomande.aggiungi(doma);
	}

			 		 st.close();
			 		newConnection.close();
			 		
			 		
		
  }catch (SQLException  e) {
	e.printStackTrace();
 }
	
	}
	
	
	
	public void fillDomadeTiroDAz_DB(ListDomandeTiro listaDomande, String daz) throws SQLException, ClassNotFoundException{
    	Connection newConnection = null;
//		PreparedStatement preparedStatement = null;
		
		
	    
		String nome=daz;
		
		String sql="SELECT domanda_di_tirocinio.* FROM domanda_di_tirocinio, Azienda "
				+ "where domanda_di_tirocinio.Tutor_Aziendale_Email=azienda.Tutor_AziendaleEmail "
				+ "AND azienda.Dir_AziendaEmail='"+nome+"' "
				+ "AND domanda_di_tirocinio.Firma_dirigente_az="+0+" ";
      String dirAzEm, TutorUniversitarioEmail, TirocinanteEmail, TutorAziendaleEmail;
      int id, FirmatutorUniversitario, firma_tutor_aziendale, firma_dir_az, firma_dir_dip;
      Date data;
      
		    //STEP 2: Register JDBC driver
		    Class.forName("com.mysql.jdbc.Driver");
   
		   newConnection = DriverManager.getConnection("jdbc:mysql://"+ ip+":"+ port+"/"+db, username, password);
		
		 	try{
		 		 java.sql.Statement st  = newConnection.createStatement();
		 		  ResultSet rs = st.executeQuery(sql);
     	
		 		  while(rs.next()){
			
		    //Retrieve by column name
		     id  = rs.getInt("Id_Documento");
		     data = rs.getDate("Data") ;
		     FirmatutorUniversitario = rs.getInt("Firma_tutor_universitario");
		     firma_tutor_aziendale = rs.getInt("Firma_tutor_aziendale");
		     firma_dir_az=rs.getInt("Firma_dirigente_az");
		     firma_dir_dip=rs.getInt("Firma_dir_dip");
		     TutorUniversitarioEmail=rs.getString("Tutor_UniversitarioEmail");
		     TirocinanteEmail=rs.getString("TirocinanteEmail");
		     TutorAziendaleEmail=rs.getString("Tutor_Aziendale_Email");
         
		     
		     DomandaTirocinio doma =new DomandaTirocinio(id, FirmatutorUniversitario, firma_tutor_aziendale, firma_dir_az, firma_dir_dip, TutorUniversitarioEmail, TirocinanteEmail, TutorAziendaleEmail);
			  listaDomande.aggiungi(doma);
	}

			 		 st.close();
			 		newConnection.close();
			 		
			 		
		
  }catch (SQLException  e) {
	e.printStackTrace();
 }
	
	}
	
	  public void fillListaDomandeTAZ (ListDomandeTiro domande,  String taz) {
	      
		  try {
			fillDomadeTiroTA_DB(domande, taz);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    }	
	  
	  
	  
		public void fillDomadeTiroTu_DB(ListDomandeTiro listaDomande, String TUNI) throws SQLException, ClassNotFoundException{
	    	Connection newConnection = null;
//			PreparedStatement preparedStatement = null;
			
			
		    
			String nome=TUNI;
			String sql="select * from domanda_di_tirocinio where Tutor_UniversitarioEmail='"+nome+"' and Firma_tutor_Universitario='0'";
	     
	    
			    //STEP 2: Register JDBC driver
			    Class.forName("com.mysql.jdbc.Driver");

			
	        
			newConnection = DriverManager.getConnection("jdbc:mysql://"+ ip+":"+ port+"/"+db, username, password);
			
			 	try{
			 		 java.sql.Statement st  = newConnection.createStatement();
			 		  ResultSet rs = st.executeQuery(sql);
	     	
			 		  while(rs.next()){
				
			    //Retrieve by column name
			    int id  = rs.getInt("Id_Documento");
			    Date data = rs.getDate("Data") ;
			    int FirmatutorUniversitario = rs.getInt("Firma_tutor_universitario");
			    int firma_tutor_aziendale = rs.getInt("Firma_tutor_aziendale");
			    int firma_dir_az=rs.getInt("Firma_dirigente_az"); 
			    int firma_dir_dip=rs.getInt("Firma_dir_dip");
			    String TutorUniversitarioEmail=rs.getString("Tutor_UniversitarioEmail");
			    String TirocinanteEmail=rs.getString("TirocinanteEmail");
			    String TutorAziendaleEmail=rs.getString("Tutor_Aziendale_Email");
	         
			    DomandaTirocinio doma =new DomandaTirocinio(id,FirmatutorUniversitario, firma_tutor_aziendale, firma_dir_az, firma_dir_dip, TutorUniversitarioEmail, TirocinanteEmail, TutorAziendaleEmail);
				  listaDomande.aggiungi(doma);
		}
		
			 		 st.close();
			 		newConnection.close();
	  }catch (SQLException  e) {
		e.printStackTrace();
	 }
		
		}
		
		  public void fillListaDomandeTUNI (ListDomandeTiro domande,  String TUNI) {
		      
			  try {
				  fillDomadeTiroTu_DB(domande, TUNI);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    }
	
		  
		  public void  fillListaDomandeDirDip(ListDomandeTiro listaDomande, String dirdip){
			String mail=dirdip;
			  Connection newConnection=Connector.getConnection();
			try{
		 		 java.sql.Statement st  = newConnection.createStatement();
		 		  String sql ="select * from domanda_di_tirocinio where dir_dipartimentoEmail= '"+mail+"' "
		 		  		+ "and Firma_tutor_universitario="+1+" "
		 		  		+ "and Firma_tutor_aziendale= "+1+" "
		 		  		+ "and Firma_dirigente_az= "+1+" "
		 		  				+ "and Firma_dir_dip="+0+" ";
				ResultSet rs = st.executeQuery(sql );
    	
		 		  while(rs.next()){
			
		    //Retrieve by column name
		    int id  = rs.getInt("Id_Documento");
		    Date data = rs.getDate("Data") ;
		    int FirmatutorUniversitario = rs.getInt("Firma_tutor_universitario");
		    int firma_tutor_aziendale = rs.getInt("Firma_tutor_aziendale");
		    int firma_dir_az=rs.getInt("Firma_dirigente_az");
		    int firma_dir_dip=rs.getInt("Firma_dir_dip");
		    String TutorUniversitarioEmail=rs.getString("Tutor_UniversitarioEmail");
		    String TirocinanteEmail=rs.getString("TirocinanteEmail");
		    String TutorAziendaleEmail=rs.getString("Tutor_Aziendale_Email");
        
		    DomandaTirocinio doma =new DomandaTirocinio(id, FirmatutorUniversitario, firma_tutor_aziendale, firma_dir_az, firma_dir_dip, TutorUniversitarioEmail, TirocinanteEmail, TutorAziendaleEmail);
			  listaDomande.aggiungi(doma);
	}
		 		  

		
 }catch (SQLException  e) {
	e.printStackTrace();
}
			
		}
	  
	  
		  
		  
		  
		 
	
		  	  
		  
	  
public void firmaTAz(int id) {
   Connection conn=null;
 
	 try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 try {
		conn = DriverManager.getConnection("jdbc:mysql://"+ ip+":"+ port+"/"+db, username, password);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  
 try {
	int  firma=1;
	 java.sql.Statement  stmt = conn.createStatement();
	 String sql="UPDATE domanda_di_tirocinio  SET Firma_Tutor_Aziendale = "+firma+" WHERE Id_Documento= '"+id+"' ";
    System.out.println(sql);
	 stmt.executeUpdate(sql);
       

	 stmt.close();
     conn.close();

 } catch (SQLException ex) {
    ex.printStackTrace();
 }
 

}


public void firmaTuni(int id) {
	   Connection conn=null;
	 
		 try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
			conn = DriverManager.getConnection("jdbc:mysql://"+ ip+":"+ port+"/"+db, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	 try {
		int  firma=1;
		 java.sql.Statement  stmt = conn.createStatement();
		 String sql="UPDATE domanda_di_tirocinio  SET Firma_tutor_Universitario= "+firma+" WHERE Id_Documento= '"+id+"' ";
	    System.out.println(sql);
		 stmt.executeUpdate(sql);
	       

		 stmt.close();
	     conn.close();

	 } catch (SQLException ex) {
	    ex.printStackTrace();
	 }
	 

	}
/** Metodo per la firma del dirigente aziendale*/
public void firmaDirAz(int id) {
	   Connection conn=null;
	 
		 try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
			conn = DriverManager.getConnection("jdbc:mysql://"+ ip+":"+ port+"/"+db, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	 try {
		int  firma=1;
		 java.sql.Statement  stmt = conn.createStatement();
		 String sql="UPDATE domanda_di_tirocinio  SET Firma_dirigente_az= "+firma+" WHERE Id_Documento= '"+id+"' ";
	    System.out.println(sql);
		 stmt.executeUpdate(sql);
	       

		 stmt.close();
	     conn.close();

	 } catch (SQLException ex) {
	    ex.printStackTrace();
	 }
	 

	}

/** Metodo per la firma del direttore di dipartimento*/
public void firmaDirDip(int id) {
	   Connection conn=null;
	 
		 try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
			conn = DriverManager.getConnection("jdbc:mysql://"+ ip+":"+ port+"/"+db, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	 try {
		int  firma=1;
		 java.sql.Statement  stmt = conn.createStatement();
		 String sql="UPDATE domanda_di_tirocinio  SET Firma_dir_dip= "+firma+" WHERE Id_Documento= '"+id+"' ";
	    System.out.println(sql);
	    
	    /** Creazione registro in seguito all'accettazione della domanda*/
	    createRegistroDAO cr=new createRegistroDAO();
	    /**vengono prelevati i dati del nuovo registro direttamente dalla domanda*/
	    cr.getDatiDomanda(id);
	    /**viene creato il registro nel db*/
	    cr.CreaRegistro(id, 0);
	    
	
		 stmt.executeUpdate(sql);
	       

		 stmt.close();
	     conn.close();

	 } catch (SQLException ex) {
	    ex.printStackTrace();
	 }
	 

	}

}
