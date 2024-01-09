package com.oopjava;

public class Car5 {
	public String make,model;
	public int year;
	public Car5(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	public void printDetails() 
	{
        System.out.println("Car Details: ");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Model: " + year);
    }
	
	
}
