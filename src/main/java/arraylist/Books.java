package arraylist;

import classsctructureconstructors.Book;

import java.util.ArrayList;
import java.util.List;

public class Books {
    private List<String> titles = new ArrayList<>();

    public void add(String title) {
        titles.add(title);
    }

    public List<String> findAllByPrefix(String prefix) {
        List<String> found = new ArrayList<>();
        for (String title : titles) {
            if (title.startsWith(prefix)) {
                found.add(title);
            }
        }
        return found;
    }

    public void removeAllByPrefix(String prefix) {
        List<String> toDelete = new ArrayList<>();
        for (String title : titles) {
            if (title.startsWith(prefix)) {
                toDelete.add(title);
            }
        }
        titles.removeAll(toDelete);
    }

    public List<String> getTitles() {
        return titles;
    }

    public static void main(String[] args) {
        Books books = new Books();

        books.add("JAVA alapok");
        books.add("Haladó JAVA");
        books.add("JAVA senior");
        System.out.println(books.getTitles());

        System.out.println(books.findAllByPrefix("JAVA"));

        books.removeAllByPrefix("JAVA");
        System.out.println(books.getTitles());
    }
}