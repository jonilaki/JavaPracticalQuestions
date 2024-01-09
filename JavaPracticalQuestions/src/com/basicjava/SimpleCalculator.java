package com.basicjava;

import java.util.Scanner;import javax.naming.AuthenticationException;

public class SimpleCalculator {

	public static void main(String[] args) {
		int num1,num2;
		char op;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number1:");
		num1=sc.nextInt();
		System.out.println("Enter number2:");
		num2=sc.nextInt();
		System.out.println("Select an operator:");
		op=sc.next().charAt(0);
		switch(op)
		{
		case '+':
			System.out.println("The sum of "+num1 +" and "+num2+" is "+(num1+num2));
			break;
		
		case '-':
			System.out.println("The difference of "+num1+" and "+num2+" is "+(num1-num2));
			break;
		case '*':
			System.out.println("The product of "+num1+" and "+num2+" is "+(num1*num2));
			break;
		case '/':
			
			if (num2 != 0) {
				System.out.println("The division of "+num1+" and "+num2+" is "+(num1/num2));
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                System.exit(1); 
            }
            break;
        default:
            System.out.println("Error: Invalid operator.");
            System.exit(1);
			
			
		}
		

	}

}
