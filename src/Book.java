public class Book {
    public final String title;
    public final String author;
    public final int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "'%s' by %s, %d pages".formatted(title, author, pages);
    }
}
