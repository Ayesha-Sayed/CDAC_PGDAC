package com.array.java;

import java.util.Scanner;

public class Program {

	public static void main(String[] args)
	{
		//a. Accept an array of integers of size n from the user.
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the size of element: ");
		int size=sc.nextInt();
		int[] array = new int[size];
		for (int i=0; i<size; i++) {
			System.out.println("Enter element: ");
		array[i]=sc.nextInt();
		}
		sc.close();
		
		
		//b. Display the contents of the array on the console.
		for (int i=0;i<size;i++)
		{
			System.out.println("Elements are: "+ array[i]);
		}
		
		
		//c. Calculate and display the sum of all the elements in the array.
		int sum=0;
		for (int i=0;i<array.length;i++) {
		sum=sum+array[i];
	     }
		System.out.println("The sum of elements of array is: " + sum);
		
		
		//d. Calculate and display the average of all the elements in the array.
		int average;
		average=(sum/size);
		
		System.out.println("Average is: "+ average);
		
		}
}
