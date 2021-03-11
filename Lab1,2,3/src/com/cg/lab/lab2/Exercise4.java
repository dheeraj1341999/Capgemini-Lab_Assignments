package com.cg.lab.lab2;
//changes required
import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
	
	public int[] modifyArray(int [] array) {
		Arrays.sort(array);
		int j=0;
		int[] temp=new int[array.length];
		
		for (int i=0;i<array.length-1;i++) {
			if (array[i]!=array[i+1]) {
				temp[j]=array[i];
				j++;
			}
		}
		
		temp[j++]=array[array.length-1];
		Arrays.sort(temp);
		return temp;
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
		
		Exercise4 obj=new Exercise4();
		array=obj.modifyArray(array);
		
		for(int i :array)
			System.out.print(i+" ");
		scanner.close();

    }

}
