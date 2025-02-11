package haymon.collections;

import haymon.myMethods.My;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {

        Map<Integer, String> clients = new HashMap<>(10);
        clients.put(1, "Haymon");
        clients.put(20, "Max");
        clients.put(3, "Roger");
        clients.put(4, "Alex");

        My.print(
                clients.size(),
                clients.isEmpty(),
                clients.keySet(),
                clients.values(),
                clients.entrySet()
        );

        My.print(clients.containsKey(20));
        My.print(clients.containsValue("Roger"));

        My.print(clients.get(20));
        My.print(clients.remove(1));
        My.print(clients.remove(4, "alex"));

        for (Integer key: clients.keySet()) {
            System.out.println(key);
        }

        for (String value: clients.values()) {
            System.out.println(value);
        }

        for (Map.Entry<Integer, String> entry: clients.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
