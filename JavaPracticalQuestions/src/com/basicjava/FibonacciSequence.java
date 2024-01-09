package com.basicjava;

import java.util.Scanner;

public class FibonacciSequence {
	public static void fib(int n)
	{
		  int n1 = 0, n2 = 1;

	        System.out.println("Fibonacci Sequence up to " + n + " terms:");

	        for (int i = 0; i <n; i++) {
	            System.out.print(n1 + " ");

	            int n3=n1+n2;
	            n1=n2;
	            n2=n3;
	        }
	}
	public static void main(String[]args)
	{
		int num;
		Scanner nw=new Scanner(System.in);
		System.out.println("Enter a number:");
		num=nw.nextInt();
		fib(num);
	}

}
