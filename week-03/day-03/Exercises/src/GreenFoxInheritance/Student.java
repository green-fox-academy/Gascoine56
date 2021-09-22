package GreenFoxInheritance;

public class Student extends Person {
    protected String previousOrganization;
    protected int skippedDays;

    Student(String name, int age, String gender, String previousOrganization) {
        this.name = name;
        this.age = age;
        this.previousOrganization = previousOrganization;
        this.gender = gender;
        skippedDays = 0;
    }

    Student() {
        name = "Jane Doe";
        age = 30;
        gender = "female";
        previousOrganization = "School of life";
        skippedDays = 0;
    }

    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public void skipDays(int x) {
        skippedDays += x;
    }
}