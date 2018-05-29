package com.servicemax.diag;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class MainTest {
	
	@Test
	public void testMain() {
		boolean status = true;
		String[] args = {""};
		Main.main(args);
		assertTrue(status);
		
	}

}
