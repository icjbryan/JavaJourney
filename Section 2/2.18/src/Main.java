
public class Main {

	public static void main(String[] args) {
		//Concatenation
		String morningGreeting = "Good Morning";
		String name = "Alex";
		System.out.println(morningGreeting + " " + name);
		
		boolean isProgramming = true;
		System.out.println("Am I a Programmer? " + isProgramming);
		
		int age = 30;
		System.out.println("My age is " + age);
		
		//Java also gives the ability to calculate the length of a string by appending .length() 
		//to the end of any string variable. 
		//When you use .length(), you instruct the computer to calculate the length of the string. 
		String goodMorning = "Good Morning";
		System.out.println(goodMorning.length());
		
		String morningGreeting1 = "Good Morning";
		int greetingLength = morningGreeting1.length();
		System.out.println(greetingLength);

		String goodMorning1 = "Good Morning";
		System.out.println(goodMorning1.toUpperCase());
		System.out.println(goodMorning1.toLowerCase());
	}

}
