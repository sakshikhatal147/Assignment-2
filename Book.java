public class Book {
    int id;
    String book;
    String Author;

    // Parameterized constructor
    public Book(int i, String b, String a) {
        id = i;
        book = b;
        Author = a;
        System.out.println("book id: " + id + " book name: " + book + " Author: " + Author);
    }

    // Copy constructor
    public Book(Book b) {
        id = b.id;
        book = b.book;
        Author = b.Author;
        System.out.println("book id: " + id + " book name: " + book + " Author: " + Author);
    }

    public static void main(String args[]) {
        Book b = new Book(1, "The Dream", "Ram");
        Book b1 = new Book(b);
    }
}
