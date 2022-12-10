import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FractionalKnapsack {
    static void Knapsack(ArrayList<Knapsackitem> item,int capacity){
        Comparator<Knapsackitem> comparator = new Comparator<Knapsackitem>() {
            @Override
            public int compare(Knapsackitem o1, Knapsackitem o2) {
                if(o2.getRatio() > o1.getRatio()){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        Collections.sort(item,comparator);
        int usedCapacity = 0;
        double totalValue = 0;
        for(Knapsackitem items:item){
            if(usedCapacity + items.getWeight() <= capacity){
                usedCapacity += items.getWeight();
                System.out.println("Taken :"+items);
                totalValue += items.getValue();
            }else{
                int usedweight = capacity - usedCapacity;
                double value = items.getRatio()*usedweight;//here
                //(usedweight*items.getValue)/items.getweight it will give the same result as the above give
                System.out.println("Taken :item index = "+items.getIndex()+"obtained value"+value+",used weight = "
                        +usedweight+",ratio = "+items.getRatio());
                usedCapacity += usedweight;
                totalValue += value;
            }
            System.out.println("\n Total value obtained = "+totalValue);
            if(usedCapacity == capacity){
                break;
            }
        }
    }
}
