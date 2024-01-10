package com.javaabstract;

public abstract class Vehicle {
	 
    public abstract void start();

}
class Car extends Vehicle{
	 private String make;
	    private String model;
	    
		public Car(String make, String model) {
			super();
			this.make = make;
			this.model = model;
		}	
	    
		// Implement the abstract start method
	    public void start() {
	        System.out.println("Start the " + make + " " + model + " car.");
	    }
	    
	 
}
