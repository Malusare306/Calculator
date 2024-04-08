package com.demo;

import java.util.Scanner;

public class CalculatorOperations {
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		CalculatorOperations calculator = new CalculatorOperations();

		int choice;
		do {
			System.out.println("1. Addition of two numbers");
			System.out.println("2. Subtraction of two numbers");
			System.out.println("3. Multiplication of two numbers");
			System.out.println("4. Division of two numbers");
			System.out.println("5. Modulus of two numbers");
			System.out.println("6. Square of a number");
			System.out.println("7. Cube of a number");
			System.out.println("8. Average of numbers");
			System.out.println("9. Factors of a number");
			System.out.println("10. Find out even or odd number");
			System.out.println("Enter your choice (0 to exit): ");
			choice = calculator.scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter the first number: ");
				double num1 = calculator.scanner.nextDouble();
				System.out.print("Enter the second number: ");
				double num2 = calculator.scanner.nextDouble();
				calculator.addition(num1, num2);
				break;

			case 2:
				System.out.print("Enter the first number: ");
				num1 = calculator.scanner.nextDouble();
				System.out.print("Enter the second number: ");
				num2 = calculator.scanner.nextDouble();
				calculator.subtraction(num1, num2);
				break;

			case 3:
				System.out.print("Enter the first number: ");
				num1 = calculator.scanner.nextDouble();
				System.out.print("Enter the second number: ");
				num2 = calculator.scanner.nextDouble();
				calculator.multiplication(num1, num2);
				break;

			case 4:
				System.out.print("Enter the first number: ");
				num1 = calculator.scanner.nextDouble();
				System.out.print("Enter the second number: ");
				num2 = calculator.scanner.nextDouble();
				calculator.division(num1, num2);
				break;

			case 5:
				System.out.print("Enter the first number: ");
				num1 = calculator.scanner.nextDouble();
				System.out.print("Enter the second number: ");
				num2 = calculator.scanner.nextDouble();
				calculator.modulus(num1, num2);
				break;

			case 6:
				System.out.print("Enter any number: ");
				double number = calculator.scanner.nextDouble();
				calculator.square(number);
				break;

			case 7:
				System.out.print("Enter any number: ");
				number = calculator.scanner.nextDouble();
				calculator.cube(number);
				break;

			case 8:

				System.out.print("Enter the number of elements: ");
				int n = calculator.scanner.nextInt();
				double[] nums = new double[n];
				for (int i = 0; i < n; i++) {
					System.out.print("Enter number " + (i + 1) + ": ");
					nums[i] = calculator.scanner.nextDouble();
				}
				calculator.average(nums);
				break;

			case 9:
				System.out.print("Enter a number: ");
				int numberToFactor = calculator.scanner.nextInt();
				calculator.factors(numberToFactor);
				break;

			case 10:
				System.out.print("Enter a number: ");
				int numToCheck = calculator.scanner.nextInt();
				calculator.checkEvenOrOdd(numToCheck);
				break;

			case 0:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid choice. Please enter a number from 0 to 10.");
				break;
			}
		} while (choice != 0);

		calculator.scanner.close();
	}

	void addition(double num1, double num2) {
		System.out.println("Addition is " + (num1 + num2));
	}

	void subtraction(double num1, double num2) {
		System.out.println("Subtraction is " + (num1 - num2));
	}

	void multiplication(double num1, double num2) {
		System.out.println("Multiplication is " + (num1 * num2));
	}

	void division(double num1, double num2) {
		if (num2 == 0) {
			System.out.println("Error! Division by zero is not allowed.");
		} else {
			System.out.println("Division is " + (num1 / num2));
		}
	}

	void modulus(double num1, double num2) {
		System.out.println("Modulus is " + (num1 % num2));
	}

	void square(double num) {
		System.out.println("Square is " + (num * num));
	}

	void cube(double num) {
		System.out.println("Cube is " + (num * num * num));
	}

	void average(double... numbers) {
		double sum = 0;
		for (double num : numbers) {
			sum += num;
		}
		System.out.println("Total sum is " + sum);
		System.out.println("Average is " + (sum / numbers.length));
	}

	void factors(int num) {
		System.out.print("Factors are ");
		for (int i = 1; i <= num; ++i) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	void checkEvenOrOdd(int num) {
		if (num % 2 == 0) {
			System.out.println("It’s even number");
		} else {
			System.out.println("It’s odd number");
		}
	}
}
