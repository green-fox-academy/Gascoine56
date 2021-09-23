package PrintableInterface;

public class Domino implements Printable{
    private int rightSide;
    private int leftSide;

    public Domino(int rightSide, int leftSide) {
        this.rightSide = rightSide;
        this.leftSide = leftSide;
    }

    @Override
    public void prinAllFields() {
        System.out.println("Domino A side : " + leftSide + " , B side: " + rightSide);
    }
}
