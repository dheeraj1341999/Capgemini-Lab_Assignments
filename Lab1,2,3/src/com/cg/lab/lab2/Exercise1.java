package com.cg.lab.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
	
	public int getSecondSmallest(int [] array) {
		Arrays.sort(array);
		return array[1];
	}
	public static void main(String[] args) {
		
		int array[];
		System.out.println("enter the number of elements in array:");
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		array=new int[size];
		System.out.println("enter the elements of array");
		for(int i=0;i<size;i++) {
			array[i]=scanner.nextInt();
		}
		Exercise1 obj=new Exercise1();
		System.out.println(obj.getSecondSmallest(array));
		scanner.close();
	}

}
