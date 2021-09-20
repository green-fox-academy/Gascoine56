package Blog;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    List<BlogPost> blog = new ArrayList<>();

    public void add(BlogPost x) {
        blog.add(x);
    }

    public void delete(int index) {
        blog.subList(index, blog.size());
    }

    public void update(int y, BlogPost article) {
        blog.set(y, article);
    }
}
