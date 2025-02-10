/**
 * - Not indexed
 * - Not sorted
 * - No repetition
 */
package haymon.collections;

import haymon.myMethods.My;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class set {
    public static void main(String[] args) {

        HashSet<Object> collection = new HashSet<>();

        Set<Object> setObjectOf = Set.of(2, 'b', 2.0, false); // java 9+

        collection.add("String");
        collection.add(true);
        collection.add(1.0);
        collection.add(1);

        collection.addAll(setObjectOf);

        My.printf(
                "Size", collection.size(),
                "Removed?", collection.remove("String"),
                "Contains?", collection.contains(false),
                "All", collection,
                "Retained?", collection.retainAll(setObjectOf)
        );
        My.print(collection);

        // Java 8+
        Set<String> setInstantiated = Stream.of("Roger", "Robert", "Ryan").collect(Collectors.toSet());
    }
}
