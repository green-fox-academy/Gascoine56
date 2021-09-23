package Comparable;

/**
 * Created by aze on 2017.03.29..
 */
public class Thing implements Comparable {
    private String name;
    private boolean completed;

    public Thing(String name) {
        this.name = name;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }

    @Override
    public int compareTo(Object o) {
        return toString().compareTo(o.toString());
    }
}
