package HashTable;

import java.util.*;

public class HashTableDemo {

    public static void show(){
        MyHashTable myHashTable = new MyHashTable(5);
        myHashTable.put(6, "A"); // 1
        myHashTable.put(8, "A"); // 3
        myHashTable.put(11, "C"); // 3
        myHashTable.put(6, "A+"); //
        System.out.println(myHashTable.get(10));
        myHashTable.remove(6);
        myHashTable.remove(60);
        System.out.println("Done");

    }



    public static void UsingHashCodeExample(){
        String str = "orange";
        System.out.println(str.hashCode());
    }

    public static int hashString (String key){
        int hash = 0;
        for (var ch :
                key.toCharArray()) {
            hash += ch; // implicit casting
        }
        return hash % 100;
    }

    public static int hashNumber (int number){
        return number % 100;
    }

    public static void FirstRepeatedCharacter(String s){
        Set<Character> set = new HashSet<>();

        for (var c : s.toLowerCase().toCharArray()) {
            if (Character.isLetter(c) && set.contains(c)){
                System.out.println(c);
                break;
            }
            set.add(c);
        }
    }

    public static void SetExample(){
        Set<Integer> set = new HashSet<>();
        int[] numbers = {1,2,3,3,2,1,4};
        for (var number :
                numbers) {
            set.add(number);
        }
        System.out.println(set);
    }

    public static void FindFirstNonRepeatedCharacter(String string) {

        var string_lowered = string.toLowerCase().toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        // Build a frequency map
        for (var c : string_lowered)
            if(Character.isLetter(c))
                if (map.containsKey(c))
                    map.put(c, map.get(c) + 1);
                else
                    map.put(c, 1);

/*        // shorten way
        for(var c : string.toCharArray()){
            var count = map.containsKey(c) ? map.get(c) : 0;
            map.put(c, count + 1);
        }*/

        // Print the first Character that has frequency of 1
        for(var c: string_lowered)
            if(map.containsKey(c) && map.get(c) == 1) {
                System.out.println(c);
                break;
            }

    }

    public static void HashMapExample1(){
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
