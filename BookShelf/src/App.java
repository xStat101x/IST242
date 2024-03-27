public class App {

    public static void main(String[] args) {
        Book B1 = new Book("Book1", 200, 2012, "Joe");
        Book B2 = new Book("Book2", 300, 2005, "Bob");
        Book B3 = new Book("Book3", 100, 2022, "Smith");

        BookShelf BookShelf = new BookShelf();

        BookShelf.addBook(B1);
        BookShelf.addBook(B2);
        BookShelf.addBook(B3);

        Boolean temp = BookShelf.isSorted();
        System.out.println(temp);

    }
}
