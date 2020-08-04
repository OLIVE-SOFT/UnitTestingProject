package com.olivesoft.internship.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {

		Calculator calculator = new CalculatorImpl();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter two values \n");
		int FirstValue = scanner.nextInt();
		int SecondValue = scanner.nextInt();
		System.out.println("Choose an operator (+, -, *, /): \n");
		char operator = scanner.next().charAt(0);
		int calculatedResult;
		switch (operator) {
		case '+':
			calculatedResult = calculator.addition(FirstValue, SecondValue);
			break;

		case '-':
			calculatedResult = calculator.substract(FirstValue, SecondValue);

			break;

		case '*':
			calculatedResult = calculator.multiply(FirstValue, SecondValue);

			break;

		case '/':
			calculatedResult = calculator.divide(FirstValue, SecondValue);
			break;
		default:
			System.out.printf("Error! Invalid operator");
			return;

		}
		System.out.println(calculatedResult);

	}
}
