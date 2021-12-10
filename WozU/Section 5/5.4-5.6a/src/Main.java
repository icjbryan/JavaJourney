
public class Main {

	public static void main(String[] args) {
		/*Student student1 = new Student("Sam", "Storms", "Theology");
		Student student2 = new Student("Jared", "Bryan", "Java");
		Student student3 = new Student("Brook", "Bryan", "JavaScript");*/
		
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
				
		student1.setFirstName("Jared");		
		student1.setLastName("Bryan");
		student1.setCourseFocus("Java");
		
		student2.setFirstName("Brook");
		student2.setLastName("Bryan");
		student2.setCourseFocus("JavaScript");
		
		student3.setFirstName("Thomas");
		student3.setLastName("Tank Engine");
		student3.setCourseFocus("Trains");
		
	/*	System.out.println(student1.getFirstName() + " " + student1.getLastName() 
		+ " is studying " + student1.getCourseFocus() );
		
		System.out.println(student2.getFirstName() + " " + student2.getLastName() 
		+ " is studying " + student2.getCourseFocus() );
		
		System.out.println(student3.getFirstName() + " " + student3.getLastName() 
		+ " is studying " + student3.getCourseFocus() ); */
		
		/* System.out.println(student1.getFirstName() + " " + student1.getLastName() + ": " + student1.getInitials());
		    System.out.println(student2.getFirstName() + " " + student2.getLastName() + ": " + student2.getInitials());
		    System.out.println(student3.getFirstName() + " " + student3.getLastName() + ": " + student3.getInitials());
		}*/
		
		String firstNameStudent1 = student1.getFirstName();
		System.out.println(firstNameStudent1);
		
		String firstNameStudent2 = student2.getFirstName();
		System.out.println(firstNameStudent2);
		
		String firstNameStudent3 = student3.getFirstName();
		System.out.println(firstNameStudent3);
		
		//student2.setFirstName("Nathan");
		//System.out.println(student2.getFirstName());
	}
}

