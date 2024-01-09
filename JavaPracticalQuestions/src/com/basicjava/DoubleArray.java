package com.basicjava;

public class DoubleArray {
	
	public static void main(String[] args) {
        // Initialize an array
        int[]originalArray = {1, 2, 3, 4, 5};
        // Double each element in the array
        doubleArrayElements(originalArray);
        // Print the modified array
        printArray(originalArray);
    }

	private static void doubleArrayElements(int[]array) {
		for (int i=0; i<array.length; i++) {
            array[i]*=2;
		}
	}
		private static void printArray(int[] array) {
	        System.out.print("Doubled Array: [");
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i]);
	            if (i < array.length - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println("]");
	    }
	

}
