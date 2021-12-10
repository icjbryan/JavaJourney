package com.jaredbryan.section3;

public class Main {

	public static void main(String[] args) {
		//String userName = "George";
		//greetPerson(userName);
		
		greetPerson("George");
		greetPerson("Tom");
		greetPerson("Jim");
		greetPerson("Carol");
	}
	
	public static void greetPerson(String personName) {
		System.out.println("Hello " + personName);
	}
}
