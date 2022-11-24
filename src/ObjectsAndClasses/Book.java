package ObjectsAndClasses;

public class Book {
    private final String bookName;
    private final Author author;
    private int publicationYear;

    public Book(String bookName, Author author, int publicationYear) {
        this.bookName = bookName;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    //написала вручную
    @Override
    public String toString() {
        return bookName + ", " + author + " " + publicationYear;
    }
    //написала вручную
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        return bookName.equals(c2.bookName) && author.equals(c2.author) && publicationYear == c2.publicationYear;

    }
    //сгенерировала
    @Override
    public int hashCode() {
        int result = getBookName().hashCode();
        result = 31 * result + getAuthor().hashCode();
        result = 31 * result + getPublicationYear();
        return result;
    }
}

