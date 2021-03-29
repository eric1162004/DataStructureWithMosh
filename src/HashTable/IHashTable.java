package HashTable;

public interface IHashTable<k, v> {
    // Pre: @key and @value
    // Post: replace the value if @key already exists; else add the key/value pair to the table
    void put(k key, v value);

    // Pre: @key
    // Post: return value of @key if @key exists; else return null
    v get(k key);

    // Pre: @key
    // Post: remove key/value pair from the table if @key exists; else do nothing
    void remove(k key);

    // Pre: @key
    // Post: return the hash value of @key
    int hash(k key);

}
