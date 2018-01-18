package gestioneUtenza;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Db.Connector;


public class RegistraUt {
	
	public  RegistraUt(){
		
	}
	
	public RegistraUt(String Email, String Nome, String Cognome, String Password, String AdminEmail){
		
		this.setEmail(Email);
		this.setNome(Nome);
		this.setCognome(Cognome);
		this.setPassword(Password);
		this.setAdminEmail(AdminEmail);
	}
	
	private String Email, Nome, Cognome, Password, AdminEmail;
	
	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCognome() {
		return Cognome;
	}

	public void setCognome(String cognome) {
		Cognome = cognome;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getAdminEmail() {
		return AdminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		AdminEmail = adminEmail;
	}
	
	public void insertAccount(int tipoUtente) throws SQLException {
		 
		
		Connection conn = Connector.getConnection();

		Statement st = null;
		
		String sql ="INSERT INTO ";
		if(tipoUtente == 1)
			sql=sql+"dir_azienda";
		if(tipoUtente == 2)
			sql=sql+"dir_dipartimento";
		if(tipoUtente == 3)
			sql=sql+"tirocinante";
		if(tipoUtente == 4)
			sql=sql+"tutor_aziendale";
		if(tipoUtente == 5)
			sql=sql+"tutor_universitario";
		
		sql=sql+" VALUES ('"+Email+"','"+Nome+"', '"+Cognome+"','"+Password+"','"+AdminEmail+"')";
		// "SELECT * FROM "+tipoAcc+" WHERE Email='"+email+"' AND Password='"+password+"'";
		/*
		 * INSERT INTO table_name 
			VALUES (value1, value2, value3, ...); email nome cognome password adminemail*/
  System.out.println(sql);
		try
		{
			  st = conn.createStatement();


			  st.executeUpdate(sql);

			 

		}
		catch (SQLException e)
		{
			throw new RuntimeException( "Database error in UserDataDao.RicercaAccount", e);
		}

		st.close();
		conn.close();
	
	}
}
