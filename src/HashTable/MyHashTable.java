package HashTable;

import java.util.LinkedList;

public class MyHashTable implements IHashTable<Integer, String>{
    private LinkedList<Entry>[] entries;
    final int SIZE;

    public MyHashTable(int size) {
        SIZE = size;
        entries = new LinkedList[SIZE];
    }

    @Override
    public void put(Integer key, String value) {
        var index = hash(key);

        if(entries[index] == null)
            entries[index] = new LinkedList<Entry>();

        var bucket = entries[index];
        for(var entry : bucket){
            if(entry.key == key){
                entry.value = value;
                return;
            }
        }

        bucket.addLast(new Entry(key, value));
    }

    @Override
    public String get(Integer key) {
        var index = hash(key);
        var bucket = entries[index];
        if(bucket != null) {
            for (var entry : bucket)
                if (entry.key == key)
                    return entry.value;
        }
        return null;
    }

    @Override
    public void remove(Integer key) {
        var index= hash(key);
        var bucket = entries[index];
        if(bucket == null)
            throw new IllegalStateException();

        for(var entry : bucket){
            if(entry.key == key ){
                bucket.remove(entry);
                return;
            }
        }
        throw new IllegalStateException();
    }

    @Override
    public int hash(Integer key) {
        return key % SIZE;
    }

    public class Entry {
        public int key;
        public String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

}
