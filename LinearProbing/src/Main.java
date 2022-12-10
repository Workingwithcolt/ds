import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Linearprob linearprob = new Linearprob(13);
        linearprob.inserthashtable("The");
        linearprob.inserthashtable("fox");
        linearprob.inserthashtable("city");
        linearprob.inserthashtable("city");
        linearprob.inserthashtable("over");
        System.out.println();
        linearprob.deletekeyhashtable("city");
        linearprob.displayHashTable();
        linearprob.searchhashtable("fox");


    }
}
