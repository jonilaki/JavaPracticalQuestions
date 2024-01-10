package com.javacomposition;
public class Engine {
	private int horsepower;
    private String fuelType;
    
	public Engine(int horsepower, String fuelType) {
		super();
		this.horsepower = horsepower;
		this.fuelType = fuelType;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
    
	

}
//Modify the `Car` class to include an instance of the `Engine` class
class Car {
 private String make;
 private String model;
 private Engine engine;

 //car Constructor
 public Car(String make, String model, Engine engine) {
     this.make = make;
     this.model = model;
     this.engine = engine;
 }
// Method to print details of the car's engine
public void printEngineDetails() {
    System.out.println("Engine Details for " + make + " " + model + ":");
    System.out.println("Horsepower: " + engine.getHorsepower());
    System.out.println("Fuel Type: " + engine.getFuelType());
}
}
