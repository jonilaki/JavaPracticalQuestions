package com.basicjava;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		int n,sum=0,i,num;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter an integer number:");
	num=input.nextInt();
	n=num;
	while(n!=0)
	{
		i=n%10;
		sum +=i;
        n/= 10;
	}
	System.out.println("The sum of digits of "+num+" is "+ sum);

	}

}
