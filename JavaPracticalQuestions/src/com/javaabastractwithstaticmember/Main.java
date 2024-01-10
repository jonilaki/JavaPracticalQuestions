package com.javaabastractwithstaticmember;

public class Main {

	public static void main(String[] args) {
		// Create  instances of Car
        Car car1 = new Car("Toyota", "Coaster");
        Car car2 = new Car("Benz", "Barbus");
        Car car3 = new Car("Mazida","Nissan");
        Car car4 = new Car("Ford","Pick up");

        // Call the start method from the Vehicle abstract class for each car
        car1.start();
        car2.start();
        car3.start();
        car4.start();

        // Retrieve and print the total number of cars created
        System.out.println("Total number of cars created: " + Car.getTotalCars());

	}

}
