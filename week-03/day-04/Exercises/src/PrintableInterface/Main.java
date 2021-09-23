package PrintableInterface;

public class Main {
    public static void main(String[] args) {
        Domino domino = new Domino(6, 8);
        Todo list = new Todo("Eat lunch" , "high", true);

        domino.prinAllFields();
        list.prinAllFields();
    }
}
