package com.cg.lab5.ui;

import java.util.Scanner;


import com.cg.lab5.exception.EmployeeException;

public class Exercise3 {
	
	public static void main(String[] args) throws EmployeeException {
		try(Scanner scan=new Scanner(System.in)) {
			System.out.println("Enter the salary : ");
			double salary=scan.nextDouble();
			if(salary<3000) {
				throw new EmployeeException("Invalid Salary!");
			}else {
				System.out.println("validated " + salary);
			}
		}catch(EmployeeException exp) {
			System.out.println(exp.getMessage());
	    }
	}
}		


