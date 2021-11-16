package com.jaredbryan.helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		//How would you go about changing the code so that it prints 
		//"Hello World!" three times instead of once? You could make copies of the print line.
		System.out.println("Hello World");
		System.out.println("Hello World");
		//This is easy to do now because the amount of source code is small.
		//But what if there were thousands of lines of code and hundreds of files?
		//As you might imagine, it would be tedious to hunt down and update every instance.
		//Variables aim to solve this problem. They allow you to give a name to data 
		//and reuse it in different parts of the code. See Lesson 1.10.
	}

}
