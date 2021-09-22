package GreenFoxInheritance;

public class Sponsor extends Person {
    protected String company;
    protected int hiredStudents;

    Sponsor(String name, int age, String gender, String company) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
        hiredStudents = 0;
    }

    Sponsor() {
        name = "John Doe";
        age = 30;
        gender = "female";
        company = "Google";
        hiredStudents = 0;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + " a " + age + " year old " + gender + " who represents "
                + company + " and hired " + hiredStudents + " students so far.");
    }

    public void hire() {
        hiredStudents++;
    }

    public void getGoal() {
        System.out.println("My goal is: Hire brilliant junior software engineers.");
    }
}