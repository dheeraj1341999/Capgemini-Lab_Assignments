package com.cg.lab.lab1;

import java.util.Scanner;

public class Exercise6 {
	public int calculateDifference(int number) {
		int SumOfSquares = 0, SumOfNumbers = 0, Difference = 0;
		SumOfSquares = (number * (number + 1) * (2 * number + 1)) / 6;
		SumOfNumbers = (number * (number + 1)) / 2;
		Difference = SumOfSquares - (SumOfNumbers * SumOfNumbers);
		return Difference;
	}

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		Exercise6 obj = new Exercise6();
		System.out.printf(" the difference between the sum of the squares of the first " + number
				+ " natural numbers and the square of their sum " + obj.calculateDifference(number));
		scanner.close();
	}

}
