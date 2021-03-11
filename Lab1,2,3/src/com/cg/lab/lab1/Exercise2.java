package com.cg.lab.lab1;

import java.util.Scanner;

public class Exercise2 {
	
public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a colour [red/yellow/green ] :");
		String light= scan.nextLine();
		
		switch (light) {
			case "red":
				System.out.println("stop");
				break;
			case "green":
				System.out.println("go");
				break;
			case "yellow":
				System.out.println("wait");
				break;
		}
		scan.close();

	}

}
