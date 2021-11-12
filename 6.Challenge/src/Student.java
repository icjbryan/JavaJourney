
public class Student {

	
		String firstName;
		String lastName;
		int expectedGraduationYear;
		double gpa;
		String declaredMajor;
		
	public Student(String firstName, String lastName, 
					int expectedGraduationYear, 
					double gpa, String declaredMajor) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.expectedGraduationYear = expectedGraduationYear;
		this.gpa = gpa;
		this.declaredMajor = declaredMajor;
	}
	
	public void incrementExpectedGraduationYear() {
        this.expectedGraduationYear = this.expectedGraduationYear + 1;
    }
}


/*  FirstName
	LastName
	Expected Year to Graduate
	GPA
	Declared Major */