package com.exceptionhandling;
//Custom exception class for invalid year
class InvalidYearException extends Exception {
 public InvalidYearException(String message) {
     super(message);
 }
}

//Define the abstract Vehicle class
abstract class Vehicle {
 // Abstract method without implementation
 public abstract void start();
}

//Implement the Vehicle class in the Car class
class Car extends Vehicle {
 private String make;
 private String model;
 private int year;

 // Static variable to keep track of the total number of cars created
 private static int totalCars = 0;

 // Constructor
 public Car(String make, String model, int year) throws InvalidYearException {
     this.make = make;
     this.model = model;

     // Validate the year
     if (year < 1886 || year > 2024) {
         throw new InvalidYearException("Invalid year for the car: " + year);
     }

     this.year = year;

     // Increment the total number of cars when a new car is created
     totalCars++;
 }

 // Implement the abstract start method
 @Override
 public void start() {
     System.out.println("Start the " + make + " " + model + " car.");
 }

 // Static method to retrieve the total number of cars created
 public static int getTotalCars() {
     return totalCars;
 }

 // Method that throws a custom exception for invalid year
 public void checkYear() throws InvalidYearException {
     if (year < 1900) {
         throw new InvalidYearException("Invalid year. The car is too old.");
     } else if (year > 2024) {
         throw new InvalidYearException("Invalid year. The car is from the future!");
     } else {
         System.out.println("Valid year for the car: " + year);
     }
 }
}
