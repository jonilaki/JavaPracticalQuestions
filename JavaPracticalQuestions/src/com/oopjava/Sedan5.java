package com.oopjava;

public class Sedan5 extends Car5 {
	private int numDoors;

	public Sedan5(String make, String model, int year, int numDoors) {
		super(make, model, year);
		this.numDoors = numDoors;
	}
	
	public void printDetails() {
        super.printDetails(); // Call the overridden method in the superclass
        System.out.println("Number of Doors: " + numDoors);
    }
}
