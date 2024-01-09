package com.oopjava;

public class Sedan extends Car4 {
	 int trunkSize;

	public Sedan(String make, String model, int year, int trunkSize) {
		super(make, model, year);
		this.trunkSize = trunkSize;
	}

		

		@Override
	public String toString() {
		return "Sedan [trunkSize=" + trunkSize + ", make=" + make + ", model=" + model + ", year=" + year + "]";
	}



		public static void main(String[] args) {
	        // Instantiate an object of the Sedan class
	        Sedan sedan = new Sedan("Toyota", "Coaster", 2023, 10);

	        // Print details of the sedan
	        System.out.println(sedan.toString());
	    } 

}
