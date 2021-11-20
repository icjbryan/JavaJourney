package com.jaredbryan.handson3;



public class HandsOn {

	public static void main(String[] args) {
		//Define an integer array of size 5 with all elements initialized to the value 0
		int[] values = {0, 0, 0, 0, 0};
		//Using a for loop and the ReadInputInt() static method of the StudentHelper class, 
		//read in (as input) the 5 integer values and store them into the array.
		for(int i = 0; i < values.length; i++ ) {
			System.out.println("Enter a Number");
			values[i] = StudentHelper.ReadInputInt();
			
		}
		
		 // print array contents
		System.out.println("Array Contents");
		for(int val: values) {
			System.out.println(val);
		}
		
		// print array contents in reverse order
		for(int i= values.length -1; i >= 0; i--) {
			System.out.println(values[i]);
		}
		
		 // print array contents where index is odd
		for(int i = 0; i< values.length; i++) {
			if(i % 2 != 0) {
				System.out.println("Value at odd index " + i + ": " + values[i] );
			} 
		}
	}

}
