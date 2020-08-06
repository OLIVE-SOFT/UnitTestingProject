package com.olivesoft.internship.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.olivesoft.internship.main.Calculator;
import com.olivesoft.internship.main.CalculatorImpl;

public class CalculatorImplTest<testdividebyzero> {

	/**
	 * Test
	 * 
	 */
	public final void testAdd() {
		Calculator calc = new CalculatorImpl();

		int a = Integer.MAX_VALUE, b = 1;
		long expectedResult = (long) Integer.MAX_VALUE + 1;
		int calculatedResult = calc.addition(a, b);

		assertEquals(expectedResult, calculatedResult);
	}

	/*** Test pour la methode Substract */
	@Test
	public void testSubstract() {

		Calculator calculator = new CalculatorImpl();

		int minuend = Integer.MAX_VALUE, subtrahend = 1;
		long expectedResult = (long) Integer.MAX_VALUE - 1;
		int calculatedResult = calculator.substract(minuend, subtrahend);

		assertEquals(expectedResult, calculatedResult);
	}

	/** Test pour la methode Multiply */
	@Test
	public void testMultiply() {

		Calculator calculator = new CalculatorImpl();

		int a = Integer.MAX_VALUE, b = 2;
		long expectedResult = (long) Integer.MAX_VALUE * 2;
		int calculatedResult = calculator.multiply(a, b);

		assertEquals(expectedResult, calculatedResult);
	}

	/** Test pour la methode Divide */
	@Test
	public void testDivide() {

		Calculator calculator = new CalculatorImpl();

		int dividend = Integer.MAX_VALUE, divisor = 2;
		long expectedResult = (long) Integer.MAX_VALUE / 2;
		int calculatedResult = calculator.divide(dividend, divisor);

		assertEquals(expectedResult, calculatedResult);
	}

	@Test(expected = ArithmeticException.class)
	public void testdividebyzero() {

		Calculator calculate = new CalculatorImpl();

		int a = Integer.MAX_VALUE, b = 0;
		int expectedResult = 0;

		if (calculate.divide(a, b) != expectedResult) {
			fail("on a divise par 0!");
		}
		a = 0;
		b = 0;
		expectedResult = 0;
		if (calculate.divide(a, b) != expectedResult) {
			fail("a et b sont nuls");
		}
	}

}
