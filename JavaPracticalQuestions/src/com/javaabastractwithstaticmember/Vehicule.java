package com.javaabastractwithstaticmember;

public abstract class Vehicule {

	public abstract void start();
}

class Car extends Vehicule {
 private String make;
 private String model;
  
 private static int totalCars = 0;

 // Constructor
 public Car(String make, String model) {
     this.make = make;
     this.model = model;
     
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
}

