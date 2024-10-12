package app.bruner.bookstore.model;

//Book class
public class Book {
    private String title;
    private int cover;
    private String shortDescription;

    public Book(String title, int cover, String shortDescription) {
        this.title = title;
        this.cover = cover;
        this.shortDescription = shortDescription;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
}
