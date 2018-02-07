package tirocinio.domanda.gestore.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import bean.DomandaTirocinio;
import bean.ListDomandeTiro;
import tirocinio.domanda.gestore.DomandaTirociDao;
 

import java.sql.SQLException;
import org.junit.Assert;
import org.junit.Test;

public class DomandaTirociDaoTest {
  private DomandaTirociDao dom = new DomandaTirociDao();
  private DomandaTirocinio doma = new DomandaTirocinio(5, 0, 0, 0, 0, "CDelizia@unisa.it", 
      "alfredoangrisani@studenti.unisa.it",  "AntonioPenna@azienda.it");
  
  @Test
  public void testDomaTirociDao() {
    assertNotNull(dom);
  }
  
  @Test
  public void testgetMaxOrd() throws SQLException {
    assertNotNull(dom.getMaxOrd());
    assertTrue(dom.getMaxOrd()==2);
  }
  
  @Test
  public void testcompilaDoma() throws SQLException, ClassNotFoundException {
    boolean flag = dom.compilaDoma(doma);
    assertNotNull(dom);
    assertEquals(flag,true);
    Assert.assertEquals(flag, true);
  }
  
  @Test
  public void testfillDomandeNotNull() throws SQLException, ClassNotFoundException {
    ListDomandeTiro listaDomande = new ListDomandeTiro();
    String taz = "Calogero@azienda.it";
    String daz = "Cicciobello@azienda.it";
    String tuni = "FedericaAuciello@unisa.it";
    listaDomande.getDomande();
    assertNotNull(dom.fillDomandeTutorAz(listaDomande,taz));
    assertNotNull(dom.fillDomandeDirAz(listaDomande,daz));
    assertNotNull(dom.fillDomandeTutorUni(listaDomande,tuni));
    
  }

  @Test
  public void testfillDomandeTrue() throws SQLException, ClassNotFoundException {
    ListDomandeTiro listaDomande = new ListDomandeTiro();
    String taz = "Calogero@azienda.it";
    String daz = "Cicciobello@azienda.it";
    String tuni = "FedericaAuciello@unisa.it";
    listaDomande.getDomande();
    assertTrue(dom.fillDomandeTutorAz(listaDomande,taz));
    assertTrue(dom.fillDomandeDirAz(listaDomande,daz));
    assertTrue(dom.fillDomandeTutorUni(listaDomande,tuni));
  }

  @Test
  public void testfillDomandeFalse() throws SQLException, ClassNotFoundException {
    ListDomandeTiro listaDomande = new ListDomandeTiro();
    String taz = "Calogero@azienda.it";
    String daz = "Cicciobello@azienda.it";
    String tuni = "FedericaAuciello@unisa.it";
    listaDomande.getDomande();
    assertFalse(dom.fillDomandeTutorAz(listaDomande,taz));
    assertFalse(dom.fillDomandeDirAz(listaDomande,daz));
    assertFalse(dom.fillDomandeTutorUni(listaDomande,tuni));
  }

  @Test
  public void testfirmaDocumentoPresente() {
    int id = 3;
    dom.firmaTAz(id);
    dom.firmaTuni(id);
    dom.firmaDirDip(id);
    dom.firmaDirAz(id);
    assertNotNull(dom);
  }
  
  @Test
  public void testfirmaReturnTrue() {
    int id = 3;
    assertTrue(dom.firmaTAz(id));
    assertTrue(dom.firmaTuni(id));
    assertTrue(dom.firmaDirDip(id));
    assertTrue(dom.firmaDirAz(id));
    
  }
  
  @Test
  public void testfirmaReturnFalse() {
    int id = 3;
    assertFalse(dom.firmaTAz(id));
    assertFalse(dom.firmaTuni(id));
    assertFalse(dom.firmaDirDip(id));
    assertFalse(dom.firmaDirAz(id));
  }

  @Test
  public void testdomandaPresente() {
	  String tir="alfredoangrisani@studenti.unisa.it";
	  assertNotNull(dom.domandaPresente(tir));
	  assertTrue(dom.domandaPresente(tir));
	  assertFalse(dom.domandaPresente(tir));
  }
}
