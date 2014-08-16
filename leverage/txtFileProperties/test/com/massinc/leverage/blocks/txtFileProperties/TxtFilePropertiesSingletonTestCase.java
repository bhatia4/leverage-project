package com.massinc.leverage.blocks.txtFileProperties;

import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TxtFilePropertiesSingletonTestCase {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		try {
			TxtFilePropertiesSingleton txtFilePropertiesSingleton = TxtFilePropertiesSingleton.getInstance();
			assertTrue(txtFilePropertiesSingleton.getProperties()!=null);
			assertTrue(txtFilePropertiesSingleton.getProperties().containsKey("Width"));
			assertTrue(txtFilePropertiesSingleton.getProperties().getProperty("Width").equals("15"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
