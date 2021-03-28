package HashTable;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class HashTableDemo {

    public static void show(){

        FindFirstNonRepeatedCharacter("A GreenApple");

    }

    private static void FindFirstNonRepeatedCharacter(String string) {

        var string_lowered = string.toLowerCase().toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        // Build a frequency map
        for (var c : string_lowered)
            if(Character.isLetter(c))
                if (map.containsKey(c))
                    map.put(c, map.get(c) + 1);
                else
                    map.put(c, 1);

        // Print the first Character that has frequency of 1
        for(var c: string_lowered)
            if(map.containsKey(c) && map.get(c) == 1) {
                System.out.println(c);
                break;
            }

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
