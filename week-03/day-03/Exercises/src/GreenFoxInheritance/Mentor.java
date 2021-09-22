package GreenFoxInheritance;

public class Mentor extends Person {
    String level;

    Mentor(String name, int age, String gender, String level) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.level = level;
    }

    Mentor() {
        name = "Jane Doe";
        age = 30;
        gender = "female";
        level = "intermediate";
    }

    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

    public void introduce() {
        System.out.println("Hello, I'm " + name + " a " + age + " years old " + gender + " " + level + " mentor.");
    }
}