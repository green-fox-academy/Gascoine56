public class URLFixer {
    // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
    // Also, the URL is missing a crucial component, find out what it is and insert it too!
    // Try to solve it more than once using different String functions!
    public static void main(String... args) {
        StringBuilder url = new StringBuilder("https//www.reddit.com/r/nevertellmethebots");
        url.insert(5,":");
        url.replace(39,43, "odds");



        System.out.println(url);
    }
}
