package com.cg.lab.lab3;

import java.util.Scanner;

public class Exercise4 {
	
	public int modifyNumber(int number) {
		String string = Integer.toString(number);
		StringBuilder stringBuilder = new StringBuilder();
		
		for (int i = 0; i < string.length() - 1; i++) {
			stringBuilder.append(Math.abs(
					Character.getNumericValue(string.charAt(i)) - Character.getNumericValue(string.charAt(i + 1))));
		}
		
		stringBuilder.append(string.charAt(string.length() - 1));
		return Integer.parseInt(stringBuilder.toString());
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int number = scanner.nextInt();
		
		Exercise4 ob = new Exercise4();
		System.out.println(ob.modifyNumber(number));
		scanner.close();
	}

}
