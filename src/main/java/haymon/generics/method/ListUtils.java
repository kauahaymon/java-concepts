package haymon.generics.method;

import java.util.List;

public class ListUtils {

    public static <T> T getLast(List<T> list) {
        return list.getLast();
    }
}
