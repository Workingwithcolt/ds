import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compm {
    public static void main(String[] args) {
        List<Laptop> laps = new ArrayList<>();
        laps.add(new Laptop("Dell",16,0));
        laps.add(new Laptop("Apple",8,0));
        laps.add(new Laptop("Acer",12,0));
        Collections.sort(laps);
        System.out.println(laps);
        Collections.sort(laps, new Comparator<Laptop>() {
            @Override
            public int compare(Laptop o1, Laptop o2) {
                if(o1.Ram > o2.Ram){
                    return 1;
                }else if(o1.Ram < o2.Ram){
                    return -1;
                }else{
                    return 0;
                }
            }
        });
        System.out.println(laps);
    }
}
