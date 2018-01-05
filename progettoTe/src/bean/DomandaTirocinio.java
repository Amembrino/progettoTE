package bean;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DomandaTirocinio {
  public DomandaTirocinio(){
	  
  }
	
	private	int Id_Documento  ;
	private String Azienda , autore , TirocinanteEmail, tutoAzrEmanil, tutoUnirEmanil;
 
	private Boolean Firma_tutor_universitario,  Firma_tutor_aziendale ,	Firma_dirigente_az, attivato;

	
	public DomandaTirocinio(int id_Documento, String azienda,Date data, Boolean firma_tutor_universitario,  
			Boolean firma_tutor_aziendale, String tutoUnirEmanil , String tirocinanteEmail, String tutoAzrEmanil ) {
		 
		Id_Documento = id_Documento;
		Azienda = azienda;
		TirocinanteEmail = tirocinanteEmail;
		this.tutoAzrEmanil = tutoAzrEmanil;
		this.tutoUnirEmanil = tutoUnirEmanil;
		Firma_tutor_universitario = firma_tutor_universitario;
		Firma_tutor_aziendale = firma_tutor_aziendale;
		Data = data;
	}
	

	private java.util.Date Data = new java.util.Date();
	java.sql.Date oggi = new java.sql.Date(Data.getTime());
	SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
	
	private String da=dt1.format(Data);
	

	public int getId_Documento() {
		return Id_Documento;
	}
	public void setId_Documento(int id_Documento) {
		this.Id_Documento = id_Documento;
	}
	public String getAzienda() {
		return Azienda;
	}
	public void setAzienda(String azienda) {
		this.Azienda = azienda;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public String getTirocinanteEmail() {
		return TirocinanteEmail;
	}
	public void setTirocinanteEmail(String tirocinanteEmail) {
		this.TirocinanteEmail = tirocinanteEmail;
	}
	public String getTutoAzrEmanil() {
		return tutoAzrEmanil;
	}
	public void setTutoAzrEmanil(String tutoAzrEmanil) {
		this.tutoAzrEmanil = tutoAzrEmanil;
	}
	public String getTutoUnirEmanil() {
		return tutoUnirEmanil;
	}
	public void setTutoUnirEmanil(String tutoUnirEmanil) {
		this.tutoUnirEmanil = tutoUnirEmanil;
	}
	public String getData() {
		return  da;
	}
	public void setData(Date data) {
		 this.Data=data;
	}
	public Boolean getFirma_tutor_universitario() {
		return Firma_tutor_universitario;
	}
	public void setFirma_tutor_universitario(Boolean firma_tutor_universitario) {
		this.Firma_tutor_universitario = firma_tutor_universitario;
	}
	public Boolean getFirma_tutor_aziendale() {
		return Firma_tutor_aziendale;
	}
	public void setFirma_tutor_aziendale(Boolean firma_tutor_aziendale) {
		this.Firma_tutor_aziendale = firma_tutor_aziendale;
	}
	public Boolean getFirma_dirigente_az() {
		return Firma_dirigente_az;
	}
	public void setFirma_dirigente_az(Boolean firma_dirigente_az) {
		this.Firma_dirigente_az = firma_dirigente_az;
	}
	public Boolean getAttivato() {
		return attivato;
	}
	public void setAttivato(Boolean attivato) {
		this.attivato = attivato;
	}
		
	
    


}
