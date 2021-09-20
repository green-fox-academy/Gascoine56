package PostIt;
class Main{

    public static void main(String[] args) {
        PostIt one = new PostIt();
        one.text = "Idea1";
        one.textColor = "blue";
        one.backgroundColor = "orange";

        PostIt two = new PostIt();
        two.backgroundColor = "pink";
        two.text = "Awsome";
        two.textColor = "black";

        PostIt three = new PostIt();
        three.textColor = "green";
        three.text = "Superb!";
        three.backgroundColor = "yellow";
    }
}


