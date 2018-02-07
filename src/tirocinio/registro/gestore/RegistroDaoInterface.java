package tirocinio.registro.gestore;

import java.sql.SQLException;

public interface RegistroDaoInterface {
 
	public int  selectId(String tirocinan) throws SQLException ;
	
	public int ID_att() throws SQLException ;
	
	public boolean compilaRegistro(int ore, String data, String comm, int id, int idatt);
	
	public void  fillListaRegistri(ListaRegistri listaReg, String mail) ;
	
	public boolean convalidaTaz(int id);
	
	public boolean setRegistroFalse(int id) ;
	
	public void  fillListaattività(ListaAttività lista , String mail);
	 
}
