package tirocinio.registro.gestore.test;

import static org.junit.Assert.*;

import org.junit.Test;

import tirocinio.registro.gestore.Attivit‡;

public class Attivit‡Test {

  @Test
  public void attivit‡Test() {
    Attivit‡ att = new Attivit‡(5,"2018-11-03",2,"via pino","Descrizione prova",2);
    assertNotNull(att);
    assertNull(att);
  }
  

}
