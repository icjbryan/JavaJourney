package com.jaredbryan.handson5;

public class Main {

	public static void main(String[] args) {
        // create `Person` no params and print age
        System.out.println("CREATE P1");
        Person p1 = new Person();
        System.out.println("P1 (no params) age = " + p1.getAge());

        // create `Person` with first name and print age
        System.out.println("CREATE P2");
        Person p2 = new Person("Billy");
        System.out.println("P2 (1 param) age = " + p2.getAge());

        // create `Person` with first and last names and print age
        System.out.println("CREATE P3");
        Person p3 = new Person("Sally", "Smith");
        System.out.println("P3 (2 params) age = " + p3.getAge());

        // create `Person` with all params and print age
        System.out.println("CREATE P4");
        Person p4 = new Person("Sofia", "Gonzalez", 24);
        System.out.println("P4 (all params) age = " + p4.getAge());

        // create `Person` with all params and bad age and print age
        //		The warning about the invalid age should be shown
        System.out.println("CREATE P5");
        Person p5 = new Person("Bad", "Age", -10);
        System.out.println("P5 (all params bad age) age = " + p5.getAge());

        // change age to invalid value
        //		The warning about the invalid age should be shown
        System.out.println("SET INVALID AGE");
        p4.setAge(-2);
        System.out.println("Set P4 age = " + p4.getAge());
    }
}