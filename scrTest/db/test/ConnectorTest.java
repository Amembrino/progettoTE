package db.test;

import static org.junit.Assert.*;

import org.junit.Test;

import db.Connector;

public class ConnectorTest {

	@Test
	public void testGetConnection() {
		assertNotNull(Connector.getConnection());
		fail("Not yet implemented");
	}

}
