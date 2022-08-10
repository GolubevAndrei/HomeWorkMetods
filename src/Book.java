import java.util.Objects;

public class Book {
    private String authorName;
    private String bookName;
    private int bookYear;

    public Book(String authorFirstName, String authorLastName, String bookName, int bookYear ) {
        Author author = new Author(authorFirstName, authorLastName);
        this.authorName = author.toString();
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

    public String toString() {
        return getBookName() + " " + getAuthorName() + " " + getBookYear();
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book bookNew = (Book) other;
        boolean bEq = bookName.equals(bookNew.bookName) && authorName.equals(bookNew.authorName);
        return bEq;
    }

    public int hashCode() {
        return Objects.hash(bookName,authorName);
    }

}
