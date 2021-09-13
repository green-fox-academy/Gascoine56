import java.util.ArrayList;

public class ListIntroduction1 {

    public static void main(String [] args){
        ArrayList <String> list = new ArrayList<>();


        list.add("William");
        System.out.println(list.isEmpty());
        list.add("John");
        list.add("Amanda");
        System.out.println(list.size());
        System.out.println(list.get(2));

        for (String x: list) {
            System.out.print((list.indexOf(x) + 1) + ". ");
            System.out.println(x);

        }

        list.remove(1);

        for (int i = list.size()-1; i >= 0 ; i--) {
            System.out.println(list.get(i));

        }

        list.clear();





    }
}
