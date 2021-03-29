package Trie;

public class TrieTest {
    public static void Test(){
        var trie = new Trie();
        trie.insert("car");
        trie.insert("can");
        trie.insert("card");
        trie.insert("careful");
        trie.insert("carefully");
        System.out.println(trie.contains("can"));
        // trie.traverse();
        var words = trie.findWords(null);
        System.out.println(words);
        System.out.println("Done");
    }
}
