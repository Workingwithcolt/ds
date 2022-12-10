public class Main {
    public static void main(String[] args) {
        doublehash dh = new doublehash(13);
        dh.inserthashtable("The");
        dh.inserthashtable("key");
        dh.inserthashtable("brown");
        dh.inserthashtable("quick");
        dh.inserthashtable("fox");
        dh.inserthashtable("over");
        dh.inserthashtable("lazy");
        dh.displayHashTable();
    }
}
