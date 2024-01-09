package com.oopjava;

import java.util.Scanner;

public class TestCar3 {

	public static void main(String[] args) {
		Car3 cr3=new Car3();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the car make:");
		cr3.setMake(input.next());
		System.out.println("Enter the car model:");
		cr3.setModel(input.next());
		System.out.println("Enter the year of car:");
		cr3.setYear(input.nextInt());
		
		System.out.println("============================================");
		System.out.println("The car make is "+cr3.getMake());
		System.out.println("The car model is "+cr3.getModel());
		System.out.println("The car year is "+cr3.getYear());
		

	}

}
