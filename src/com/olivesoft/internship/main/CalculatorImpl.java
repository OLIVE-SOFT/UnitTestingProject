package com.olivesoft.internship.main;

public class CalculatorImpl implements Calculator {

	@Override
	public int multiply(int a, int b) {
		return a * b;
	}

	@Override
	public int divide(int dividend, int divisor) {
		return dividend / divisor;
	}

	@Override
	public int addition(int a, int b) {
		return a + b;
	}

	@Override
	public int substract(int minuend, int subtrahend) {
		return minuend - subtrahend;
	}

}
