public class Main {
    public static void main(String[] args) {
        DirectChaning s = new DirectChaning(15);
        s.inserthashtable("The");
        s.inserthashtable("quick");
        s.inserthashtable("brown");
        s.inserthashtable("fox");
        s.inserthashtable("over");
        s.inserthashtable("over");
        s.displayHashTable();
        s.searchHashtable("The");
        s.deletekeyhashtable("The");
        s.displayHashTable();
    }
}
