package com.basicjava;

import java.util.Scanner;

public class FactorialCalculator {
	public static int fact(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		else
		{
			return n* fact(n-1);
		}
	}
	public static void main(String[]args) {
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		num=scan.nextInt();
		
		System.out.println("The factorial of "+num+ " is "+fact(num));
	}

}
