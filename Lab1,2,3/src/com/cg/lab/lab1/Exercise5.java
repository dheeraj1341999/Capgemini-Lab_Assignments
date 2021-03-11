package com.cg.lab.lab1;

import java.util.Scanner;

public class Exercise5 {
	public int calculateSum(int number) {
		return (number * (number + 1)) / 2;
	}

	public int calculateSumOf3Or5(int number) {
		int result = 0;
		for (int i = 0; i <= number; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				result = result + i;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		Exercise5 obj = new Exercise5();
		System.out.printf("The Sum Of First " + num + " Numbers is " + obj.calculateSum(num));
		System.out.println();
		System.out.printf("The Sum Of First " + num + " Numbers Divisible by 3 or 5 is " + obj.calculateSumOf3Or5(num));
	scanner.close();
	}
	

}