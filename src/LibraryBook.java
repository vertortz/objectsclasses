public class LibraryBook {
    public final String title;
    public final String author;
    public boolean isAvailable = true;

    public LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public boolean borrow() {
        if (!isAvailable) {
            return false;
        }
        isAvailable = false;
        return true;
    }

    public void returnBook() {
        isAvailable = true;
    }
}
