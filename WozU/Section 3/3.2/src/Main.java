
public class Main {

	public static void main(String[] args) {
		String[] musicians = {"John", "George", "Paul", "Ringo"};
		//The first element is at index 0, _not_ index 1.
		System.out.println(musicians[0]);
		//System.out.println(musicians.length);
		
		String[] students = {"Joshua Alexander", "James Ward", "Tammy Holiday", 
							"Chris Evans", "Carrie Fisher", "Kimberly Walker" };
		System.out.println(students[5]);
		
		String[] groceryList = new String[4];
		groceryList[0] = "bread";
		groceryList[1] = "eggs";
		groceryList[2] = "milk";
		groceryList[3] = "tea";
		//updated number 1
		groceryList[1] = "beans";
		System.out.println(groceryList[1]);
		
		int[] highestArizonaTemperatures = {120, 122, 121, 118, 119 };
		System.out.println(highestArizonaTemperatures[0]);
		System.out.println(highestArizonaTemperatures[4]);
	}

}
