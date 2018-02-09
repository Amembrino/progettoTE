package db.test;

import static org.junit.Assert.*;

import db.Connector;
import org.junit.Test;


/**
 * Classe per testare l'avvenuta connessione al database.
 */
public class ConnectorTest {

  @Test
  public void testGetConnection() {
    assertNotNull(Connector.getConnection());
    fail("Not yet implemented");
  }

}
