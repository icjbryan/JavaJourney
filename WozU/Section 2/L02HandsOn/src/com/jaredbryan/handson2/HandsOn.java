package com.jaredbryan.handson2;

public class HandsOn {

	public static void main(String[] args) {
		int age = 52;
		//Changing the tag name allows the program to determine if it should give the student 
		//discount or not.
		//String tag = "student";
		String tag = "non-student";
		double ticketPrice = 10.00;
		
		
		// if senior citizen, pay $7
		if (age >= 65) {
			ticketPrice = ticketPrice*.7;
		}
		
		else if (tag == "student") {
			ticketPrice = ticketPrice*.8;
		}
		
		else if (age <= 0) {
			System.out.println("Invalid Entry");
		}
		
		// if child, pay $8
		else if (age <= 12) {
			ticketPrice = ticketPrice*.8;
		}
		
		// everyone else, pay $10
		else  {
			System.out.println("Sorry, no discounts apply.");
		}
		
	System.out.println("The ticket is now $" + ticketPrice + ".");

	}

}
