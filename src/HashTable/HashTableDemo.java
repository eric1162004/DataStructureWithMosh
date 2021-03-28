package HashTable;

import java.util.HashMap;
import java.util.Map;

public class HashTableDemo {

    public static void show(){



    }
    public static void Example1(){
        Map<Integer, String> map  =new HashMap<>();
        map.put(1, "Mosh");
        map.put(2, "John");
        map.put(3, "Mary");
        map.put(4,  null); // OK
        map.put(null, null); // OK

        var value = map.get(2);
        map.containsKey(3); // O(1) - no iteration
        map.containsValue("Mosh"); // O(n) - must iterate the collection

        // iterate over key sets
        for (var key :
                map.keySet()) {
            System.out.println(key);
        }

        // iterate over key/value pairs
        for (var entry :
                map.entrySet()) {
            System.out.println(entry);
        }

        System.out.println(map);
    }
}
