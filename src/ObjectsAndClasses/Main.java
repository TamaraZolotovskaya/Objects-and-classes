package ObjectsAndClasses;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Stiven", "King");
        Author author2 = new Author("Joanne", "Rowling");
        Book book1 = new Book("The Dark Tower", author1, 2004);
        Book book2 = new Book("The ink black heart", author2, 2022);
        book1.setPublicationYear(2007);

        System.out.println(author1.getAuthorName() + " " + author1.getAuthorSurname());
        System.out.println(book1.getBookName() + ", " + book1.getAuthor().getAuthorName() + " " + book1.getAuthor().getAuthorSurname() + ", " + book1.getPublicationYear());
    }

}
