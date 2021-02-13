package collectionsequalshash;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookCatalog {

    public Book findBookByTitleAuthor(List<Book> books, String title, String author) {
        Book searchedBook = new Book(title, author);
        if (!books.contains(searchedBook)) {
            return null;
        } else {
            int index = books.indexOf(searchedBook);
            return books.get(index);
        }
    }

    public Book findBook(List<Book> books, Book book) {
        if (!books.contains(book)) {
            return null;
        } else {
            int index2 = books.indexOf(book);
            return books.get(index2);
        }
    }

    public Set<Book> addBooksToSet(Book[] books) {
        Set<Book> localBooks = new HashSet<>();
        for (Book book : books) {
            localBooks.add(book);
        }
        return localBooks;
    }
}
