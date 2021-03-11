package com.cg.lab.lab3;

import java.util.Scanner;

public class Exercise2 {
	
	public String getImage(String string) {
		StringBuilder stringBuilder = new StringBuilder(string);
		return string + "|" + stringBuilder.reverse().toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String :");
		String string = scanner.next();
		Exercise2 obExercise2 = new Exercise2();
		System.out.println(obExercise2.getImage(string));
		scanner.close();
	}

}
