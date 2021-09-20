package Counter;

public class Counter {
    private int counter = 0;
    int number;

    public Counter() {

    }

    public Counter(int counter) {
        number = counter;
        this.counter = counter;
    }

    public void add(int number) {
        counter += number;
    }

    public void add() {
        counter += 1;
    }

    public int get() {
        return counter;
    }

    public void reset() {
        counter = number;
    }

}
