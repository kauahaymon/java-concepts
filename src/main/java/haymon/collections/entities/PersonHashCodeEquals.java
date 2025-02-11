package haymon.collections.entities;

import java.util.Objects;

public class PersonHashCodeEquals {

    public String name;

    public PersonHashCodeEquals(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PersonHashCodeEquals that = (PersonHashCodeEquals) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
