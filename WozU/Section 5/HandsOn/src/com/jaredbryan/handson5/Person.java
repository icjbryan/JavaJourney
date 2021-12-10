package com.jaredbryan.handson5;

public class Person {

    // properties
    private String firstName;
    private String lastName;
    private int age;

    // constructor
    public Person() {
        firstName = "";
        lastName = "";
        age = 0;
    }

    // overloaded constructors
    public Person(String firstName) {
        this.firstName = firstName;
        lastName = "";
        age = 0;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        age = 0;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        validateAge();
    }

    // method to validate age
    private void validateAge() {
        if(age < 0) {
            age = 0;
            System.out.println("Attempted to set age to an invalid value. Setting age to 0 instead.");
        }
    }

    // getters / setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        validateAge();
    }
}