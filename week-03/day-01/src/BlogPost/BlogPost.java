package BlogPost;

public class BlogPost {
    String authorName;
    String title;
    String text;
    String publicationDate;

    void blogPost(String authorName, String title, String text, String publicationDate){
        System.out.println(title + " titled by " + authorName + " posted at " + publicationDate);
        System.out.println(text);
    }
    }
