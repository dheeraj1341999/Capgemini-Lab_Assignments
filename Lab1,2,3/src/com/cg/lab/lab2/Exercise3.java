package com.cg.lab.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
	
	public int[] getSorted(int [] array) {
		for(int i=0;i<array.length;i++) {
			StringBuilder xString=new StringBuilder();
			xString.append(array[i]);
			array[i]=Integer.parseInt(xString.reverse().toString());
		}
		Arrays.sort(array);
		return array;
		
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
		Exercise3 obj=new Exercise3();
		array=obj.getSorted(array);
		for(int x :array)
			System.out.print(x +" ");
		scanner.close();

}

}
