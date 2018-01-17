package gestRegTir;

import java.util.Date;

public class Registro {
public Registro(int id, Date data, Boolean attivato, Boolean conv, String tir_em, String tut_az_em){
	id=this.id;
	data=this.data;
	attivato=this.attivato;
	conv=this.conv;
	tir_em=this.tir_em;
	tut_az_em=this.tut_az_em;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Date getData() {
	return data;
}
public void setData(Date data) {
	this.data = data;
}
public Boolean getAttivato() {
	return attivato;
}
public void setAttivato(Boolean attivato) {
	this.attivato = attivato;
}
public Boolean getConv() {
	return conv;
}
public void setConv(Boolean conv) {
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
private Date data;
private Boolean attivato, conv;
private String tir_em, tut_az_em;
}
