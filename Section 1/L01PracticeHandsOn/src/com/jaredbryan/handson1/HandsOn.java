package com.jaredbryan.handson1;

public class HandsOn {

	public static void main(String[] args) {
		boolean isSunny = true;
		//boolean isSunny = false;
		boolean atBeach =true;
		//boolean atBeach = false;

		// if it's sunny
		if(isSunny) {
			// print "Wear sunglasses!"
			System.out.println("Wear Sunglasses");
			if(atBeach) {
				System.out.println("Wear Sunblock");
			}
			else {
				System.out.println("Don't Wear Sunblock");
			}
		}
		

		// else
		else {
			// print "Don't wear sunglasses."
			System.out.println("Don't wear Sunglasses");
			
		}
		if(atBeach) {
			System.out.println("Come back tomorrow.");
		}
		else {
			System.out.println("Don't go to the beach.");
		}
	
		    

	}

}
