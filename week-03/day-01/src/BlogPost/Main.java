package BlogPost;

public class Main {
    public static void main(String[] args) {

        BlogPost post = new BlogPost();


        post.blogPost("John Doe", "Lorem Ipsum",
                "Lorem ipsum dolor sit amet.", "2000.05.04");
        System.out.println("");
        post.blogPost("Tim Urban", "Wait but why",
                "A popular long-form, stick-figure-illustrated blog about almost everything.",
                "2010.10.10.");
        System.out.println("");
        post.blogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump",
                "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center\n" +
                        "of attention. When I asked to take his picture outside one of IBM’s \n" +
                        "New York City offices, he told me that he wasn’t really into the whole organizer\n" +
                        "profile thing.", "2017.03.28");
    }
}
