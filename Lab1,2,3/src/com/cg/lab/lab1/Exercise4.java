package com.cg.lab.lab1;

import java.util.Scanner;

public class Exercise4 {
	
public static void main(String[] args) {
		
		int num;
		int count;
		
		Scanner scan=new Scanner(System.in);
	   
		System.out.println("enter a number: ");
		
		num=scan.nextInt();
		
		for(int i=2;i<=num;i++) {
			count=0;
		    	for(int j=2;j<i;j++){
		    		if(i%j==0)
		            count=count+1;
		    	}
		 if(count==0) {
			 System.out.print(i+ "\t"); 
		 }
		
	    }
		scan.close();
	}

}
