
public class Main {

	public static void main(String[] args) {
		// All 3 vars have the same string value: My dog Fido.
		/*String var1 = "My dog Fido";
		String var2 = "My dog Fido";
		String var3 = new String("My dog Fido");
		
		// TRUE! because both are assigned to the same literal
		boolean equal12 = (var1 == var2);
		System.out.println(equal12);
		//true
		
		boolean equal23 = (var2 == var3);
		System.out.println(equal23);*/
		//false
		
		//equal12 is True, because both variables (var1 and var2) point to the same String literal. 
		//However, equal23 is False, because var2 points to a String literal while var3 is created using 
		//the new operator — they reference different objects.
		
		String var1 = "My dog Fido.";
		String var2 = "My DOG Fido.";   // notice the case
		String var3 = new String("My dog Fido.");

		// FALSE! case (capitalization) matters!
		boolean equal12 = var1.equals(var2);
		System.out.println(equal12);

		// TRUE! both variables contain the same string value
		boolean equal13 = var1.equals(var3);
		System.out.println(equal13);
	}

}
