package ObjectsAndClasses;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Stiven", "King");
        Author author2 = new Author("Joanne", "Rowling");
        Author author3 = new Author("Stiven", "King");
        Book book1 = new Book("The Dark Tower", author1, 2004);
        Book book2 = new Book("The ink black heart", author2, 2022);
        Book book3 = new Book("The Dark Tower", author1, 2007);
        book1.setPublicationYear(2007);

        System.out.println(author1);
        System.out.println(book1);
        System.out.println(author1.equals(author2));
        System.out.println(author1.equals(author3));
        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));

    }

}
