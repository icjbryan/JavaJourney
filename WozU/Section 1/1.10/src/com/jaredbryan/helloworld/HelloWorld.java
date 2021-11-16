package com.jaredbryan.helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		//We're creating a String Variable called message and then calling it below.
		//Now we don't have to print the same thing over an over, we just System.out.println(message)
		//rather than rewriting System.out.println("Hello World") over and over.
		//Rather than having to change Hello World to Hi World three times, I can just change the message.
		
		//String message ="Hi World";
		
		//System.out.println(message);
		//System.out.println(message);
		
		
		//If using quotes to start and stop a string, how do you print a quotation mark? 
		//When you want to include the quotation mark itself, you use something called an escape sequence. 
		//This is a character prefixed by the backslash symbol "". 
		//If you wanted to use the literal quote, you would write \"
		String message = "he was taking a \"nap\" in the back of the class";
		System.out.println(message);

	}

}
