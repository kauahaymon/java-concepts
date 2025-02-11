package haymon.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {

    private String name;
    private List<Book> books = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<String> getAllBooks() {
        return books.stream().map(Book::getName).toList();
    }

    public void saveBook(Book book) {
        books.add(book);
        book.setPerson(this);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", books=" + getAllBooks() +
                '}';
    }
}
