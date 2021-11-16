
public class Main {

	public static void main(String[] args) {
		//Arithmetic Operations
		System.out.println(2+2);
		
		int sum = 2+2;
		System.out.println(sum);
		
		int sum1 = 1+2+3+4+5;
		System.out.println(sum1);
		
		int sum2 = 4;
		sum2 = sum2 +1;
		System.out.println(sum2);
		
		int sum3 = 4;
		sum3++;
		System.out.println(sum3);
		
		int sum4 = 4;
		sum4--;
		System.out.println(sum4);
		
		int product = 6*3;
		System.out.println(product);
		
		int product1 = 6/3;
		System.out.println(product1);
		
		//System.out.println(4/0);
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
	    //at com.jamesgosling.helloworld.HelloWorld.main(HelloWorld.java:6)
		
		//Hierarchy of Operators
		//It's important to know that operators for math exist in code just as they do in real life. 
		//Try to determine the result of the following code snippet without looking at the solution.
		
		System.out.println(2 * 3 + 4);
		
		System.out.println(2 + 3 * 4);
		
		//You can remember the order of execution for math formulas with the acronym P.E.M.D.A.S., which stands for:

		//Parenthesis
		//Exponents
		//Multiplication
		//Division
		//Addition
		//Subtraction
		
		//Modulus is a handy way to get the remainder of a division problem using the percent % symbol. 
		//Given two numbers, the first number will be divided by the second number and the remainder is evaluated.
		
		int remainder = 5 % 2;
		System.out.println(remainder);
		
		int remainder1 = 54321 % 12345;
		System.out.println(remainder1);
		
		// an integer to hold your number
		int number = 123;
		// if the modulus of the number (remainder) divided by 2 is 0, then print "it's even"
		if(number % 2 == 0) {
			System.out.println(number);
		}
			
	}

}
