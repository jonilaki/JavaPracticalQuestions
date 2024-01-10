package com.javacomposition;

public class Main {

	public static void main(String[] args) {
		// Create an instance of Engine
        Engine carEn = new Engine(200, "Gasoline");

        // Create an instance of Car with the Engine
        Car myCar = new Car("Toyota", "Coaster", carEn);

        // Print details of the car's engine
        myCar.printEngineDetails();

	}

}
