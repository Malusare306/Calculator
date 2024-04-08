package com.demo;

public interface Calculator {
	void addition(double num1, double num2);

	void subtraction(double num1, double num2);

	void multiplication(double num1, double num2);

	void division(double num1, double num2);

	void modulus(double num1, double num2);

	void square(double num);

	void cube(double num);

	void average(double... numbers);

	void factors(int num);

	void checkEvenOrOdd(int num);
}