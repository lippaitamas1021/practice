package classsctructureconstructors;

public class BookMain {

    public static void main(String[] args) {

        Book b = new Book("James Gosling", "JAVA");

        b.register("5648");

        System.out.println("Könyv címe: " + b.getTitle() + ", szerzője: " + b.getAuthor() + ", regisztrációs száma: " + b.getRegNumber());
    }
}
