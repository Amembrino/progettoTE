package gestRegTir;

public class Attività {
	public Attività(int id, String data, int ora, String luogo, String Descrizione, int RegistroID){
		this.id=id;
		this.data=data;
		this.ora=ora;
		this.luogo=luogo;
		this.Descrizione=Descrizione;
		this.RegistroID=RegistroID;
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

	public int getOra() {
		return ora;
	}

	public void setOra(int ora) {
		this.ora = ora;
	}

	public String getLuogo() {
		return luogo;
	}

	public void setLuogo(String luogo) {
		this.luogo = luogo;
	}

	public String getDescrizione() {
		return Descrizione;
	}

	public void setDescrizione(String descrizione) {
		Descrizione = descrizione;
	}

	public int getRegistroID() {
		return RegistroID;
	}

	public void setRegistroID(int registroID) {
		RegistroID = registroID;
	}

private String data, luogo, Descrizione;
private int ora, id, RegistroID;
}
