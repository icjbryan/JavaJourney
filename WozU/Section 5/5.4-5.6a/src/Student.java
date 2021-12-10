
public class Student {
    String firstName;
    String lastName;
    String courseFocus;
    private String initials;

    // constructor
    public Student(){
        firstName = "";
        lastName = "";
        courseFocus = "";
        initials = "";
    }

    // overloaded constructor
    public Student(String first, String last, String focus){
        firstName = first;
        lastName = last;
        courseFocus = focus;
        setInitials();
    }

    // getter method
    public String getFirstName(){
        return firstName;
    }

    // setter method
    public void setFirstName(String newFirstName){
        firstName = newFirstName;
    }

    // getter method
    public String getLastName(){
        return lastName;
    }

    // setter method
    public void setLastName(String newLastName){
        lastName = newLastName;
    }

    // getter method
    public String getCourseFocus(){
        return courseFocus;
    }

    // setter method
    public void setCourseFocus(String newCourseFocus){
        courseFocus = newCourseFocus;
    }

    // private setter method
    private void setInitials(){
        String firstNameInitial = firstName.substring(0,1);
        String lastNameInitial = lastName.substring(0,1);
        initials = firstNameInitial + lastNameInitial;
    }

    // getter method
    public String getInitials(){
        return initials;
    }
}