public class Book {
    private String authorName;
    private String bookName;
    private int bookYear;

    public Book(String authorName, String bookName, int bookYear ) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.bookYear = bookYear;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getBookYear() {
        return this.bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }
}
