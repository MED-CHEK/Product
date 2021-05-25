package org.mql.java.junit5.parameterizedTest.valueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mql.java.junit5.example.Calculator;


public class ValueSourceDemo {

	@Test
	public void testEvenValues() {
		Calculator calculator = new Calculator();
		assertTrue(calculator.estPaire(2));
		
		assertTrue(calculator.estPaire(4));
		
		assertTrue(calculator.estPaire(6));
		
		assertTrue(calculator.estPaire(7));
		
		assertTrue(calculator.estPaire(8));
		
		assertTrue(calculator.estPaire(12));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {2, 4, 6, 8, 7, 10})
	public void testEvenValuesUsingParamaterizedTest(int number) {
		Calculator calculator = new Calculator();
		assertTrue(calculator.estPaire(number));
	}
	
}
