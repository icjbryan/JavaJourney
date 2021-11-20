package com.jaredbryan.section3;


public class ForLoops {

	public static void main(String[] args) {
		

		//Do While Loop
		//A do-while loop is similar to a while loop with one big difference: the code is executed first, 
		//and then the condition is checked to determine whether or not to loop again. 
		/* String userInput;
		 
		  do {
		    System.out.println("Computer: Hi");
		    // read user input
		    userInput = StudentHelper.ReadInputString();
		    // echo user input
		    System.out.println("You: " + userInput);
		}
		while(userInput.equals("Hi"));

		// illustrates the rest of the code
		System.out.println("Out of the loop");*/
		
		//For Loops
		
		// start out with a counter value at 10
		/*int count = 10;
		// while the counter value is greater than 0, print the value and subtract 1
		while(count > 0) {
			System.out.println(count);
			// subtract count by one (decrement)
			count --;
		}
		System.out.println("Lift Off"); */
		
		/*for(init ; condition ; increment){
		    // do something
		}*/
		//for(int count = 10; count > 0; count--){}
		//    System.out.println(count);
		    
		//Enhanced For Loops
		String[] myArray = {"One", "Two", "Three", "Four"};
		for (int i=0; i < myArray.length; i++) {
			//System.out.println(myArray[i]);
		}
		
		for(String val : myArray) {
		    System.out.println(val);
		}
		
		int count = 0;

		while(true){

		    System.out.println(count);

		}
		}
	}


