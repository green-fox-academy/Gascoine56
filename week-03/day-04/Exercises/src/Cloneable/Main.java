package Cloneable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Person> people = new ArrayList<>();

        Person mark = new Person("Mark", 46, "male");
        people.add(mark);
        Person markClone = mark.clone();
        people.add(markClone);
        Person jane = new Person();
        people.add(jane);
        Student john = new Student("John Doe", 20, "male", "BME");
        Student johnTheClone = john.clone();
        people.add(john);
        people.add(johnTheClone);
        Student student = new Student();
        people.add(student);


        student.skipDays(3);


        for (Person person : people) {
            person.introduce();
            person.getGoal();
        }

    }
}