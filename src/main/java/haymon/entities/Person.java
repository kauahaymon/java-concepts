package haymon.entities;

import java.util.Objects;

public class Person {

    public String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }
}
