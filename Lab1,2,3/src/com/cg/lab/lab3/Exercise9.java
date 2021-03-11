package com.cg.lab.lab3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Exercise9 {
	
	static String dayMonthYears(String date) {
		LocalDate dateToFind = LocalDate.parse(date);
		LocalDate today = LocalDate.now();
		Period period = Period.between(dateToFind, today);
		
		return ( period.getYears()+" Years "+ period.getMonths()+" Months " + period.getDays()+ " Days.");
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Date in format of yyyy-mm-dd : ");
		String date=scan.next();
		System.out.println(dayMonthYears(date));
		scan.close();

	}

}
