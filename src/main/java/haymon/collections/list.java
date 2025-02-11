/**
 * - Indexed
 * - Sorted
 * - Accepts repetition
 */
package haymon.collections;

import haymon.collections.entities.Person;
import haymon.collections.entities.PersonHashCodeEquals;
import haymon.myMethods.My;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class list {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(10);

        // O(1) Complexity
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        My.print(numbers.get(0), numbers.get(1), numbers.get(2));

        // O(N) Complexity
        numbers.set(0, 1);
        numbers.add(1, 2);
        numbers.remove(3);

        My.print(numbers);

        PersonHashCodeEquals p1, p2;
        Person p3, p4;

        p1 = new PersonHashCodeEquals("Jake");
        p2 = new PersonHashCodeEquals("Jake");

        p3 = new Person("Jake");
        p4 = new Person("Jake");

        My.print(p1.equals(p2)); // compares hashCode of Names
        My.print(p3.equals(p4)); // compares hashcode of Addresses

        My.print(p1.hashCode());
        My.print(p2.hashCode());
        My.print(p3.hashCode());
        My.print(p4.hashCode());

        List<Person> people = new ArrayList<>();

        people.add(p3);
        people.add(p4);
        people.add(new Person("Niel"));
        people.add(new Person("Andy"));

        people.forEach(System.out::println);

        My.print(people.contains(new Person("Andy")));
        My.print(people.remove(p4));
        My.print(people.isEmpty());
        My.print(people);
    }
}