package haymon.myMethods;

import java.util.Collection;

public final class My {

    private My() {}

    public static void print(Collection<?>... items) {
        for (Object args: items) {
            System.out.println(args);
        }
    }

    public static void printf(Object... objects) {
        for (int i = 0; i < objects.length; i += 2) {
            System.out.println(objects[i] + ": " + objects[i + 1]);
        }
    }
}
