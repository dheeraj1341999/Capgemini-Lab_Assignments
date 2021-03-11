package com.cg.lab.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
	
	public String[] sortStrings(String [] array) {
		Arrays.sort(array);
		return array;
	}
	
	@Override
	public String toString() {
		return "Exercise2 [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public static void main(String[] args) {
		
		String array[];
		System.out.println("enter the number of elements in array:");
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		array=new String[size];
		System.out.println("enter the elements of array");
		
		for(int i=0;i<size;i++) {
			array[i]=scanner.next();
		}
		
		Exercise2 obj=new Exercise2();
		obj.sortStrings(array);
		
		for(String string :array)
		System.out.print(string+" ");
		scanner.close();
	}

}
