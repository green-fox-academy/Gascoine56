package TeacherStudent;

public class Teacher {
    public void giveAnswer() {
        System.out.println("The teacher is answering a question");
    }

    public void teach(Student student) {
        student.learn();
    }
}