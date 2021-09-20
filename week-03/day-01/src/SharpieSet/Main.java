package SharpieSet;

public class Main {
    public static void main(String[] args) {
        SharpieSet abc = new SharpieSet();
        Sharpie x = new Sharpie("green", 550.3);

        abc.add(new Sharpie("blue", 20.0));
        abc.add(new Sharpie("red", 80.0));
        abc.add(new Sharpie("orange", 40.0));
        abc.add(new Sharpie("white", 2.0));
        abc.add(x);

        System.out.println(abc.countUsable());

        x.use();
        x.use();
        System.out.println(x.getInkAmount());
        System.out.println(abc.countUsable());
        abc.removeTrash();


    }
}
