package bean;

import java.sql.Date;

public class RegistroTirocinio {

	public RegistroTirocinio(int ID_Tirocinio, Date data_att, int Convalida_Tutor_Az, String Tirocinante_Email, String Tutor_Aziendale_Email) {
		this.ID_Tirocinio=ID_Tirocinio;
		this.data_att=data_att;
		this.Convalida_Tutor_Az=Convalida_Tutor_Az;
		this.Tirocinante_Email=Tirocinante_Email;
		this.Tutor_Aziendale_Email=Tutor_Aziendale_Email;
	}
	
	
public int getID_Tirocinio() {
		return ID_Tirocinio;
	}
	public void setID_Tirocinio(int iD_Tirocinio) {
		ID_Tirocinio = iD_Tirocinio;
	}
	public int getConvalida_Tutor_Az() {
		return Convalida_Tutor_Az;
	}
	public void setConvalida_Tutor_Az(int convalida_Tutor_Az) {
		Convalida_Tutor_Az = convalida_Tutor_Az;
	}
	public Date getData_att() {
		return data_att;
	}
	public void setData_att(Date data_att) {
		this.data_att = data_att;
	}
	public String getTirocinante_Email() {
		return Tirocinante_Email;
	}
	public void setTirocinante_Email(String tirocinante_Email) {
		Tirocinante_Email = tirocinante_Email;
	}
	public String getTutor_Aziendale_Email() {
		return Tutor_Aziendale_Email;
	}
	public void setTutor_Aziendale_Email(String tutor_Aziendale_Email) {
		Tutor_Aziendale_Email = tutor_Aziendale_Email;
	}


private int ID_Tirocinio,Convalida_Tutor_Az;
private Date data_att;
private String Tirocinante_Email, Tutor_Aziendale_Email;
}
