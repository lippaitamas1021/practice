package attributes.book;

public class BookMain {
    public static void main(String[] args) {

        Book book = new Book("JAVA alapok");

        System.out.println(book.getTitle());

        book.setTitle("JAVA haladó");

        System.out.println(book.getTitle());
    }
}
