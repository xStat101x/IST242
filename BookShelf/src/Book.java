public class Book {

    private String title;
    private int pageCount;
    private int yearReleased;
    private String author;

    public Book (String title, int pageCount,
                 int yearReleased, String author) {
        this.title = title;
        this.pageCount = pageCount;
        this.yearReleased = yearReleased;
        this.author = author;
    }

    // Getter Methods
    public String getTitle() {
        return title;
    }
    public int getPageCount() {
        return pageCount;
    }
    public int getYearReleased() {
        return yearReleased;
    }
    public String getAuthor() {
        return author;
    }

    public String toString() {
        return "Book: <" + title + "> By <" + author + ">";
    }
}
