package com.exceptionhandling;

public class Main {

	public static void main(String[] args) {
		try {
            // Create an instance of Car with a valid year
            Car Car1 = new Car("Toyota", "Coaster", 1900);

            // Call the start method from the Vehicle abstract class for the valid car
            Car1.start();

            // Check the year for the valid car
            Car1.checkYear();
        } catch (InvalidYearException e) {
            // Handle the custom exception for invalid year
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            // Create an instance of Car with an invalid year
            Car invalidCar = new Car("Ford", "Pick Up", 2025);

            // This block will not be reached due to the exception thrown during the creation of the car
            invalidCar.start();
        } catch (InvalidYearException e) {
            // Handle the custom exception for invalid year
            System.out.println("Exception caught: " + e.getMessage());
        }

	}

}
