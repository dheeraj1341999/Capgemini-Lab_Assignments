package com.cg.lab.lab1;

import java.util.Scanner;

public class Exercise7 {
	
	public boolean checkNumber(int number) {
		int array[] = new int[20];
		int count = 0;
		while (number > 0) {
			array[count] = number % 10;
			number = number / 10;
			count++;
		}
		for (int iteraror = 1; iteraror <= count; iteraror++) {
			if (array[iteraror - 1] - array[iteraror] > 0) {
				continue;
			} else {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		Exercise7 obj = new Exercise7();
		System.out.println(obj.checkNumber(number));
		scanner.close();
	}

}
