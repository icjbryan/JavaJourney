
public class Main {

	public static void main(String[] args) {
		//Hierarchy of Operators
		//Not all operators are treated equally. This means some are evaluated before others. You will look at a 
		//modified version of the library code example again, which is posted below for your convenience.
		
		boolean isSleepy = true;
		boolean isLibraryClosed = true;
		boolean isBatteryDead = true;
		
		
		//As you've just seen, Java does not go from left to right in the expression.
		//In Java, operators have precedence. This means it will evaluate some parts (e.g. &&) before others (e.g. ||).
		if(isSleepy || isLibraryClosed && isBatteryDead){
		    System.out.println("You should leave now.");
		}
		else{
		    System.out.println("Keep on studying!");
		}
		
	}

}
