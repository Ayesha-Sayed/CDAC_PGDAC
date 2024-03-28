package com.overloading.java;

class Vehicle {
	private String model;
	private int year;
	private double fuelEfficiency;

//	public String getModel() {
//		return model;
//	}
//
//	public int getYear() {
//		return year;
//	}
//
//	public double getFuelEfficiency() {
//		return fuelEfficiency;
//	}
//
//	public void setModel(String model) {
//		//System.out.println("enter fuel efficiency:" + fuelEfficiency);
//		this.fuelEfficiency = fuelEfficiency;
//	}

	public void display(String model, int year, double fuelEfficiency) {
		System.out.println("The model is: " + this.model);
		System.out.println("The year is: " + this.year);
		System.out.println("The fuel efficiency is: " + this.fuelEfficiency);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFuelEfficiency() {
		return fuelEfficiency;
	}

	public void setFuelEfficiency(double fuelEfficiency) {
		this.fuelEfficiency = fuelEfficiency;
	}

	public void display(String model, double fuelEfficiency, int year) {
		System.out.println("The year is: " + this.year);
		System.out.println("The fuel efficiency is: " + this.fuelEfficiency);
		System.out.println("The model is: " + this.model);
	}
	
	public void display(int year, double fuelEfficiency, String model) {
		System.out.println("The year is: " + this.year);
		System.out.println("The fuel efficiency is: " + this.fuelEfficiency);
		System.out.println("The model is: " + this.model);
	}
	
	
}
