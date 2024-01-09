package com.oopjava;

public class TestCar5 {

	public static void main(String[] args) {
		Car5 car = new Car5("Toyota", "Coaster",2002);
		Sedan5 sedan = new Sedan5("Benz", "Barbus",2003, 4);
		System.out.println("Printing details for the Car object:");
        car.printDetails(); // Calls the method in the Car class
        System.out.println("\nPrinting details for the Sedan object:");
        sedan.printDetails(); // Calls the overridden method in the Sedan class

	}

}
