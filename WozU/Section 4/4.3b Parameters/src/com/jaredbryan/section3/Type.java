package com.jaredbryan.section3;

public class Type {

	public static void main(String[] args) {
		System.out.println(isEven(5005));

	}

	//public static void isEven(int numbers){
	    // if the number is even, set variable to true
	    // otherwise, set variable to false
	    // return the variable
	//}
	
	/*"void" is very useful when you want some code to run and don't need any results. 
	 * This is evident when you print to the console. You don't expect anything to be evaluated. 
	 * Although, there are situations in which you want a method to evaluate to a value, such as 
	 * a string or an integer. When you specify a data type, rather than using void,
	 * the method can evaluate to a value, similar to how boolean operations evaluate to boolean values.
	 */
	
	public static boolean isEven(int number) {
		boolean result; 
		
		// if the number is even, set variable to true
		if(number % 2 == 0) {
			result = true;
		}
		// otherwise, set variable to false
		else {
			result = false;
		}
		return result;
	}
}
