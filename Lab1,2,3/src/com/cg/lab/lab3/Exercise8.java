package com.cg.lab.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise8 {
	
	public boolean isPositiveString(String string) {
		char[] array = string.toCharArray();
		Arrays.sort(array);
		String string2 = new String(array);
		
		if (string.equals(string2)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		System.out.println("enter the string");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		
		Exercise8 ob = new Exercise8();
		System.out.println(ob.isPositiveString(string));
		scanner.close();
	}


}
