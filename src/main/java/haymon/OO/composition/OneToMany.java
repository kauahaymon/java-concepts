package haymon.OO.composition;

import haymon.entities.Book;
import haymon.entities.Person;
import haymon.myMethods.My;

public class OneToMany {
    public static void main(String[] args) {


        Person p1 = new Person("Ryan");

        p1.saveBook(new Book("Harry Potter"));
        p1.saveBook(new Book("Percy Jackson"));
        p1.saveBook(new Book("Plato"));
        p1.saveBook(new Book("Science"));
        p1.saveBook(new Book("History"));

        p1.getAllBooks();
        My.print(p1.getBooks().get(3).getPerson().getName());
        My.print(p1.getBooks().get(4).getName());
        My.print(p1);
    }
}
