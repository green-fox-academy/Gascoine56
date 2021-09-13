public class URLFixer {
    // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
    // Also, the URL is missing a crucial component, find out what it is and insert it too!
    // Try to solve it more than once using different String functions!
    public static void main(String... args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";
        String tempUrl = url.substring(5);
        String fixer = "https:";
        String fixedUrl = fixer.concat(tempUrl);
        fixedUrl = fixedUrl.replace("bots","odds");


        System.out.println(fixedUrl);
    }
}
