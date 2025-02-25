package haymon.generics;

public class Box<Type> {
    Type item;

    public Type getItem() {
        return item;
    }

    public void save(Type type) {
        this.item = type;
    }
}
