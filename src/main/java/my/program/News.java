package my.program;

public class News {

    private String title;
    private String link;
 //   private String shortDescription;      // TODO
 //   private Image image;                  // TODO
 //   private Date date;                    // TODO


    public News(String title, String link) {
        this.title = title;
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String toString()
    {
        return "Title: " + title + " ; Link: " + link;
    }
}
