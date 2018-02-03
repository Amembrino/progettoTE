package bean;

/**
 * Superclasse user, viene estesa dalle classi relative alle singole categorie di utenze. *
 */
public class User {
  String tipoacc;
  
  private String nome;
 private String cognome;
  private String email;
  private String password;
  
  public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCognome() {
	return cognome;
}
public void setCognome(String cognome) {
	this.cognome = cognome;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}



  /**
 * Costruttore nullo.
 * Istanzia un oggetto di tipo user;
 */

  public User() {
  }
  /**
 * Metodo di accesso.
 * Restituisce una stringa indicante la tipologia dell'account;
 * @return tipoacc
 */

  public String getTipoacc() {
    return tipoacc;
  }

  /**
 * Metodo di modifica
 * Prende il parametro in input e aggiorna il corrispondente attributo della classe.
 * @param tipoacc Stringa indicante la tipologia dell'account (Studente/Tutor universitario/...)
 */

  public void setTipoacc(String tipoacc) {
    this.tipoacc = tipoacc;
  }
 
  
}