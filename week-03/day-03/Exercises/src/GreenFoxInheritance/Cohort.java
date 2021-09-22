package GreenFoxInheritance;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
    String name;
    List<Student> students = new ArrayList<>();
    List<Mentor> mentors = new ArrayList<>();

    Cohort(String name) {
        this.name = name;
        List<Student> students = new ArrayList<>();
        List<Mentor> mentors = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    public void info(String name, ArrayList<Student> students, ArrayList<Mentor> mentors) {
        System.out.println("The " + name + "cohort has " + students.size() + "students and " + mentors.size() + "mentors.");
    }

    public void info() {
        System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
    }
}