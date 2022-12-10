public class Main{
    public static void main(String[] args) {
        Trie newTrie = new Trie();
        newTrie.insert("API");
        newTrie.insert("APIS");
        newTrie.insert("super");
        newTrie.search("APIhv");
        newTrie.search("APIS");
        newTrie.delete("super");
        newTrie.search("APIS");
    }
}