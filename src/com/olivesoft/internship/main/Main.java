package com.olivesoft.internship.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {

		Calculator calculator = new CalculatorImpl();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Veuillez saisir l'operateur (+, -, *, /): \n");

		char operator = scanner.next().charAt(0);
		int calculatedResult;

		switch (operator) {
		case '+':
			System.out.print("Veuillez saisir les deux valeurs \n");

			int FirstValue = scanner.nextInt();
			int SecondValue = scanner.nextInt();
			calculatedResult = calculator.addition(FirstValue, SecondValue);
			break;

		case '-':
			System.out.print("Veuillez saisir les deux valeurs \n");

			int minuend = scanner.nextInt();
			int substrahend = scanner.nextInt();
			calculatedResult = calculator.substract(minuend, substrahend);
			break;

		case '*':
			System.out.print("Veuillez saisir les deux valeurs \n");

			FirstValue = scanner.nextInt();
			SecondValue = scanner.nextInt();
			calculatedResult = calculator.multiply(FirstValue, SecondValue);
			break;

		case '/':
			System.out.print("Veuillez saisir les deux valeurs \n");

			int dividened = scanner.nextInt();
			int divisor = scanner.nextInt();
			calculatedResult = calculator.divide(dividened, divisor);
			System.out.println(calculatedResult);
			break;
		default:
			System.out.printf("Error! l'operateur est incorrect");
			return;

		}
		System.out.println(calculatedResult);

	}
}
