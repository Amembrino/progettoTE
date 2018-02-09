package tirocinio.registro.gestore.test;

import static org.junit.Assert.*;


import org.junit.Test;

import tirocinio.registro.gestore.RegistroDao;

public class RegistroDaoTest {

  @Test
  public void testcompilaAttivit‡Registro()  {
    RegistroDao reg = new RegistroDao();
    assertEquals(reg.compilaRegistro(2, "2017-12-15", "prova attivit‡", 2, 3),true); 
    assertNotNull(reg);
  }

  @Test
  public void testcompilaDescrizioneMancante()  {
    RegistroDao reg = new RegistroDao();
    assertEquals(reg.compilaRegistro(2, "2017-12-15", "", 2, 3),false); 
    assertNotNull(reg);
  }
  
  @Test
  public void testcompilaDataMancante()  {
    RegistroDao reg = new RegistroDao();
    assertEquals(reg.compilaRegistro(2, null, "prova attivit‡", 3, 4),false); 
    assertNotNull(reg);
  }
  
  @Test
  public void testcompilaOraMancante()  {
    RegistroDao reg = new RegistroDao();
    assertEquals(reg.compilaRegistro(0, "2017-12-15", "prova attivit‡", 4, 5),false); 
    assertNotNull(reg);
  }
}
