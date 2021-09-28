package Sharpie;

public class Main {
    public static void main(String[] args) {
        SharpieSet abc = new SharpieSet();
        Sharpie x = new Sharpie();

        abc.add(new Sharpie());
        abc.add(new Sharpie());
        abc.add(new Sharpie());
        abc.add(new Sharpie());
        abc.add(x);

        System.out.println(abc.countUsable());

        x.use();
        x.use();
        System.out.println(x.getInkAmount());
        System.out.println(abc.countUsable());
        abc.removeTrash();


    }
}
