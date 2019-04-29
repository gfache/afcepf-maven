package com.formation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Calculateur_test {

	private static Calculateur calcul = null;
	
	@BeforeAll
	public static void init() {
		calcul = new Calculateur();
	}
	
	@Test
	void addTest() {
		assertEquals(5,calcul.add(2,3),"Add not OK!!!");
		//fail("Not yet implemented");
	}

	@Test
	void multiplyTest() {
		assertEquals(6,calcul.multiply(2,3),"Multiply not OK!!!");
		//fail("Not yet implemented");
	}
}
