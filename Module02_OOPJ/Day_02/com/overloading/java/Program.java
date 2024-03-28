package com.overloading.java;

import java.util.Scanner;

public class Program {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		System.out.print("Enter Modal Name = ");
		v1.setModel(sc.nextLine());
		System.out.print("Enter Year Name = ");
		v1.setYear(sc.nextInt());
		System.out.print("Enter Fuel Efficiency Name = ");
		v1.setFuelEfficiency(sc.nextDouble());
		/*System.out.println(v1.getModel());
		System.out.println(v1.getYear());
		System.out.println(v1.getFuelEfficiency());*/
		v1.display(v1.getModel(),v1.getYear(), v1.getFuelEfficiency() );
		v1.display(v1.getYear(), v1.getFuelEfficiency(),v1.getModel() );
	}

}