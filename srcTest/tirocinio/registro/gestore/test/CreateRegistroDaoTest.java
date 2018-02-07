package tirocinio.registro.gestore.test;

import static org.junit.Assert.*;

import org.junit.Test;

import tirocinio.registro.gestore.CreateRegistroDao;

public class CreateRegistroDaoTest {
private boolean flag;
private CreateRegistroDao cr=new CreateRegistroDao();
  @Test
  public void testgetDatiTrue() {
    int id=3; 
    flag=cr.getDatiDomanda(id);
    assertEquals(flag,true);
    assertNotEquals(flag,false);
  }
  @Test
  public void testgetDatiFalse() {
  int id=3; 
    flag=cr.getDatiDomanda(id);
    assertEquals(flag,false); //fail perché si aspetta un true
    assertNotEquals(flag,true);
  }
  @Test
  public void testCreaRegistro() {
  int id=3; int c=1;
    flag=cr.CreaRegistro(id,c);
    assertEquals(flag,false);
    assertNotEquals(flag,true);
  }

}
