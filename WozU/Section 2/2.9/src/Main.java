
public class Main {

	public static void main(String[] args) {
		//String Inequality
		//String method. Similarly, when testing for inequality, you use the equals() 
		//method along with the not operator !.
		String var1 = new String("My dog Fido");	
		String var2 = new String("My dog Spot");
		
		// Test for equality
		// FALSE! "var1" and "var2" are not equal
		boolean equal12 = var1.equals(var2);
		System.out.println(equal12);
		
		// Test for Inequality (note the not operator)
		// TRUE! "var1" does NOT (!) equal "var2"
		boolean notEqual12 = !var1.equals(var2);
		System.out.println(notEqual12);

	}

}
