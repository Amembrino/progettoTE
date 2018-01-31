package bean;

/**
 * Superclasse user, viene estesa dalle classi relative alle singole categorie di utenze. *
 */
public class user {
  String tipoacc;


  /**
 * Costruttore nullo.
 * Istanzia un oggetto di tipo user;
 */

  public user() {
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