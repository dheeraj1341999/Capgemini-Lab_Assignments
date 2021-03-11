package com.cg.lab.lab1;

import java.util.Scanner;

public class Exercise8 {

	public boolean checkNumber(long number) {
		long num = 2;
		while (num <= number) {
			num = num * 2;
			
		}
		if (num / 2 == number) {
			return true;
		} else {
			return false;
		}

	}

	public static void main (String [] args){
		System.out.println("enter the number");
		Scanner scanner= new Scanner(System.in);
		long number=scanner.nextInt();
		Object obj=new Exercise8();
		System.out.println(((Exercise8) obj).checkNumber(number));

		scanner.close();
	}
}
