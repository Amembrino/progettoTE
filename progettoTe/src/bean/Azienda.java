package bean;

public class Azienda {
	
	public Azienda(){
		
	}
	
	public Azienda( String nome, String sede_Operativa, String sede_Amministrativa, String dir_AziendaEmail,
			String tutor_AziendaEmail, int id_Azienda, Boolean convenzionata )
	{
		    this.sede_Operativa=sede_Operativa;
		   this.convenzionata=convenzionata;
		    this.id_Azienda=id_Azienda;
			this.nome=nome;
			this.sede_Amministrativa = sede_Amministrativa;
			this.dir_AziendaEmail = dir_AziendaEmail;
			this.tutor_AziendaEmail= tutor_AziendaEmail; 
	}
	
	private String  nome, sede_Operativa, sede_Amministrativa, dir_AziendaEmail, tutor_AziendaEmail;

	private int id_Azienda;
	
	private boolean  convenzionata;

	public String getSede_Operativa() {
		return sede_Operativa;
	}

	public void setSede_Operativa(String sede_Operativa) {
		sede_Operativa = sede_Operativa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		nome = nome;
	}

	public String getSede_Amministrativa() {
		return sede_Amministrativa;
	}

	public void setSede_Amministrativa(String sede_Amministrativa) {
		sede_Amministrativa = sede_Amministrativa;
	}

	public String getDir_AziendaEmail() {
		return dir_AziendaEmail;
	}

	public void setDir_AziendaEmail(String dir_AziendaEmail) {
		dir_AziendaEmail = dir_AziendaEmail;
	}

	public String getTutor_AziendaEmail() {
		return tutor_AziendaEmail;
	}

	public void setTutor_AziendaEmail(String tutor_AziendaEmail) {
		tutor_AziendaEmail = tutor_AziendaEmail;
	}

	public int getId_Azienda() {
		return id_Azienda;
	}

	public void setId_Azienda(int id_Azienda) {
		id_Azienda = id_Azienda;
	}

	public boolean isConvenzionata() {
		return convenzionata;
	}

	public void setConvenzionata(boolean convenzionata) {
		convenzionata = convenzionata;
	}
	
	
}
