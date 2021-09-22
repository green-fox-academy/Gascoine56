package GreenFoxInheritance;

import jdk.swing.interop.SwingInterOpUtils;

public class Person {
    protected String name;
    protected int age;
    protected String gender;

    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    Person() {
        name = "Jane Doe";
        age = 30;
        gender = "female";
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + " a " + age + " year old " + gender + ".");
    }
}