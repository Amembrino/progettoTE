package tirocinio.domanda.gestore.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import bean.DomandaTirocinio;
import bean.ListDomandeTiro;
import tirocinio.domanda.gestore.DomaTirociDao;
 

import java.sql.SQLException;
import org.junit.Assert;
import org.junit.Test;

public class DomandaTirociDaoTest {
  private DomaTirociDao dom = new DomaTirociDao();
  private DomandaTirocinio doma = new DomandaTirocinio(2,0,0,0,0,"FedericaAuciello@unisa.it",
      "E.Salatiello43@studenti.unisa", "AstolfoTontodimamma@azienda.it");
  
  @Test
  public void testDomaTirociDao() {
    assertNotNull(dom);
  }
  
  @Test
  public void testgetMaxOrd() throws SQLException{
    assertNotNull(dom.getMaxOrd());
    //assertTrue(dom.getMaxOrd()==2);
  }
  
  @Test
  public void testcompilaDoma() throws SQLException, ClassNotFoundException{
    dom.compilaDoma(doma);
    assertNotNull(dom);
    assertEquals(dom, doma);
    Assert.assertEquals(dom, doma);
  }
  
  @Test
  public void testfillDomadeTiroTuAziDB() throws SQLException, ClassNotFoundException{
    ListDomandeTiro listaDomande = new ListDomandeTiro();
    String taz = "Calogero@azienda.it";
    listaDomande.getDomande();
    dom.fillDomadeTiroTA_DB (listaDomande,taz);
  }

  @Test
  public void testfillDomadeTiroDAz_DB() throws SQLException, ClassNotFoundException{
    ListDomandeTiro listaDomande = new ListDomandeTiro();
    String daz = "Cicciobello@azienda.it";
    listaDomande.getDomande();
    dom.fillDomadeTiroDAz_DB(listaDomande,daz);
  }

  @Test
  public void testfillDomadeTiroTu_DB() throws SQLException, ClassNotFoundException{
    ListDomandeTiro listaDomande = new ListDomandeTiro();
    String tuni = "FedericaAuciello@unisa.it";
    listaDomande.getDomande();
    dom.fillDomadeTiroTu_DB(listaDomande,tuni);
    
  }

  @Test
  public void testfirmaTaz() {
    int id = 3;
    dom.firmaTAz(id);
    assertNotNull(dom);
  }
  
  @Test
  public void testfirmaTuni() {
    int id = 3;
    dom.firmaTuni(id);
    assertNotNull(dom);
  }
  
  @Test
  public void testfirmaDirDip() {
    int id = 3;
    dom.firmaDirDip(id);
    assertNotNull(dom);
  }

  @Test
  public void testfirmaDirAz() {
    int id = 3;
    dom.firmaDirAz(id);
    assertNotNull(dom);
  }
}
