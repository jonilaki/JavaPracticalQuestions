package com.basicjava;

import java.util.Scanner;

public class StringReverser {
	
public static String reverseString(String str) {
        // Check for null or empty string
        if (str == null || str.isEmpty()) 
        {
            return str;
        }
        // Convert the string to a character array
        char[] strArray = str.toCharArray();

        // Reverse the character array
        int start = 0;
        int end = strArray.length - 1;
        
        while (start < end) {
            char temp = strArray[start];
            strArray[start] = strArray[end];
            strArray[end] = temp;
            start++;
            end--;
        }
        return new String(strArray);
}
public static void main(String[]args){
	String str1,str2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string:");
	str1=sc.nextLine();
	str2=reverseString(str1);
	System.out.println("Original String: " + str1);
    System.out.println("Reversed String: " + str2);
	
}

}
