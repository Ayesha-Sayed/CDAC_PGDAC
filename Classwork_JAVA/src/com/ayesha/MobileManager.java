package com.ayesha;
import java.util.ArrayList;
import java.util.Scanner;

class Mobiles {

	    private String model;
	    private String company;
	    private double price;

	    public Mobiles(String model, String company, double price) {
	        this.model = model;
	        this.company = company;
	        this.price = price;
	    }

	    public String getModel() {
	        return model;
	    }

	    public String getCompany() {
	        return company;
	    }

	    public double getPrice() {
	        return price;
	    }
	}

	public class MobileManager {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ArrayList<Mobiles> mobilesList = new ArrayList<>();

	        while (true) {
	            System.out.println("\nMenu:");
	            System.out.println("1. Add a mobile");
	            System.out.println("2. Display all mobiles");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // consume newline character

	            switch (choice) {
	                case 1:
	                    addMobile(scanner, mobilesList);
	                    break;
	                case 2:
	                    displayMobiles(mobilesList);
	                    break;
	                case 3:
	                    System.out.println("Exiting program...");
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	            }
	        }
	    }

	    private static void addMobile(Scanner scanner, ArrayList<Mobiles> mobilesList) {
	        System.out.print("Enter model: ");
	        String model = scanner.nextLine();
	        System.out.print("Enter company: ");
	        String company = scanner.nextLine();
	        System.out.print("Enter price: ");
	        double price = scanner.nextDouble();
	        scanner.nextLine(); // consume newline character

	        Mobiles mobile = new Mobiles(model, company, price);
	        mobilesList.add(mobile);
	        System.out.println("Mobile added successfully!");
	    }

	    private static void displayMobiles(ArrayList<Mobiles> mobilesList) {
	        if (mobilesList.isEmpty()) {
	            System.out.println("No mobiles added yet.");
	        } else {
	            System.out.println("Mobiles Details:");
	            for (Mobiles mobile : mobilesList) {
	                System.out.println("Model: " + mobile.getModel());
	                System.out.println("Company: " + mobile.getCompany());
	                System.out.println("Price: " + mobile.getPrice());
	                System.out.println();
	            }
	        }
	    }
	}

