import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Setl {
    public static Set<Laptop> laps = new HashSet<>();
    public static void main(String[] args) {
        laps.add(new Laptop("Dell",16,0));
        laps.add(new Laptop("Apple",8,0));
        laps.add(new Laptop("Acer",12,0));
        System.out.println(laps);
    }
}
