package Zoo;

public abstract class Animal {
    protected String name;
    private int age;
    private String color;
    private String gender;
    private int legs;

    public String getName() {
        return name;
    }

    public String breed() {
        return "laying eggs.";
    }
}
