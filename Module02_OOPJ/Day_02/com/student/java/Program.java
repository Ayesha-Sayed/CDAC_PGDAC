package com.student.java;

import java.util.Scanner;

class Student {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class Program {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.print("Enter name:");
		s1.setName(sc.nextLine());
		System.out.print("Enter Age:");
		s1.setAge(sc.nextInt());
		System.out.println(" The name is : " + s1.getName());
		System.out.println(" The name is : " + s1.getAge());
	}
}
