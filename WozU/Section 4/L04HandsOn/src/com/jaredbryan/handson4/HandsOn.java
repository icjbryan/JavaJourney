package com.jaredbryan.handson4;

public class HandsOn {

	public static void main(String[] args) {

		int val = 2;
		int count = 5;
		//System.out.println(doubleMe(val));
		System.out.println(doubleMeTimes(val, count));		
	}
	
	// Leveraging what you have learned about methods, create a method named doubleMe that:
	// Has one integer parameter val (you can name the parameter however you'd like)
	//Doubles the value of val and returns the result

		public static int doubleMe(int val) {
		return 2 * val;
		}
	
		//Create a method named quadrupleMe that:
		// Has one integer parameter val (you can name the parameter however you'd like)
		// Uses the doubleMe method (from Step 1) to double the value of val — twice (i.e., quadrupled). The method should return the result.
		// Print out the value of the input and output, before and after calling the quadrupleMe method.
	
		public static int quadrupleMe(int val) {
		return 2 * val * val;
	
}
		
		//Create a method named doubleMeTimes that:

			/*Has two integer parameters:
			val - This first parameter is the value that should be doubled. You should use the doubleMe method from Step 1. 
			The number of times to double the value is determined by the second parameter.
			count - The value of this second parameter indicates the number of times val should be doubled.
			Returns the result of doubling val a total of count times.
			Print out the value of the input and output, before and after calling the doubleMeTimes method.*/
			
			public static int doubleMeTimes(int val, int count) {
			int valDouble = val * 2 * count;
				for(int i =0; i<valDouble; i++) {
				
			}
			
			return valDouble;
					
			
}
			}





