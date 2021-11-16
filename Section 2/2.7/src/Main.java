
public class Main {

	public static void main(String[] args) {
		//The Or operation, using the || symbols, evaluates to a boolean value as well. 
		//As long as one of the arguments is true, the whole statement evaluates to true.
		boolean isSleepy = false;
		//boolean isSleepy = true;
		boolean isLibraryClosed = false;
		//boolean isBatteryDead = true;
		boolean isBatteryDead = false;
		
		//boolean isLibraryClosed = true;
		
		if(isSleepy || isLibraryClosed || isBatteryDead) {
			System.out.println("Leave the Library now.");
		}
		else {
			System.out.println("Keep Studying.");
		}
	}

}
