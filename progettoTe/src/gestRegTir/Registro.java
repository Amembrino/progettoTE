package gestRegTir;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Registro {
public Registro(int id, int conv, String tir_em, String tut_az_em){
	this.id=id;
	
	/**data odierna (?) */
	  java.util.Date Dat  = new java.util.Date();
			new java.sql.Date(Dat.getTime());
			SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
			   String da=dt1.format(Dat );
	this.data=da;

	this.conv=conv;
	this.tir_em=tir_em;
	this.tut_az_em=tut_az_em;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getData() {
	return data;
}
public void setData(String data) {
	this.data = data;
}

public int getConv() {
	return conv;
}
public void setConv(int conv) {
	this.conv = conv;
}
public String getTir_em() {
	return tir_em;
}
public void setTir_em(String tir_em) {
	this.tir_em = tir_em;
}
public String getTut_az_em() {
	return tut_az_em;
}
public void setTut_az_em(String tut_az_em) {
	this.tut_az_em = tut_az_em;
}

private int id;
private String data;
private int  conv;
private String tir_em, tut_az_em;
}
