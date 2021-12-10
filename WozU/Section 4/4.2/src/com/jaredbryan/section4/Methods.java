package com.jaredbryan.section4;

public class Methods {

	//The point of 4.2 is to demonstrate how to print a method outside of the "main" function.
	//"printHelloWorld" is a separate function, yet when the function name is called into the main
	//function, the console reads what's inside of "printHelloWorld".
	public static void main(String[] args) {
		
		printHelloWorld();
	}
	
	public static void printHelloWorld() {
		System.out.println("Hello World, again!");
	}

}
