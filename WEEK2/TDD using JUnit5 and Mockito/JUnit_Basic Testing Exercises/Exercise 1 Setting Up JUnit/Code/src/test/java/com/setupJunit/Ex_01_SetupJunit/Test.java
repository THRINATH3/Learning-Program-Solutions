package com.setupJunit.Ex_01_SetupJunit;

import static org.junit.Assert.*;

import org.junit.Before;

public class Test {

	@Before
	public void setUp() throws Exception {
		
	}
	
	@org.junit.Test
	public void test() {
		App a = new App();
		char actu = a.check("Thrinath");
		assertEquals('T',actu);
	}
}
