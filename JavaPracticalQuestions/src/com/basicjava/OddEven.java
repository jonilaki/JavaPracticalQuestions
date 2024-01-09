package com.basicjava;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num;
		System.out.println("Enter a given integer number:");
		num=input.nextInt();
		if(num%2==0)
		{
			System.out.println("The number entered is even!");
		}
		else {
			System.out.println("The number entered is odd!");
		}

	}

}
