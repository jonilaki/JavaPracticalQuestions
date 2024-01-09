package com.basicjava;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		String input;
		Scanner txt=new Scanner(System.in);
		System.out.println("Enter a string:");
		input=txt.nextLine();
		if (isPalindrome(input)) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string is not a palindrome.");
		}
	}

	public static boolean isPalindrome(String str) {
		// Remove spaces and convert to lowercase
		String Str1 = str.replaceAll("\\s", "").toLowerCase();

		// Check if the cleaned string is a palindrome
		int length = Str1.length();
		for (int i = 0; i < length / 2; i++) {
			if (Str1.charAt(i) != Str1.charAt(length - 1 - i)) {
				return false;
			}
		}
		return true;
	}


}


