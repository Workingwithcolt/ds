import java.security.interfaces.RSAPrivateCrtKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FractionalKnapsack {
    static class Element implements  Comparable<Element>{
        public int profit;
        public int weight;
        public int fraction;
        public Element(int profit,int weight){
            this.fraction = (profit/weight);
            this.profit= profit;
            this.weight = weight;
        }

        @Override
        public int compareTo(Element o) {
            if(this.fraction > o.fraction){
                return -1;}
            if(this.fraction < o.fraction){
                return 1;
            }
            if(this.fraction == o.fraction){
                return 0;
            }
            return 0;
        }
    }
    public static void main(String[] args){
        int[] profit = {60,100,120};
        int[] weight = {10,20,30};
        int W = 50;
        int totalWeight = 0;
        List<Element> list = new ArrayList<Element>();
        for(int i=0;i< profit.length;i++){
            Element e  = new Element(profit[i],weight[i]);
            list.add(e);
        }
        Collections.sort(list);
        for (Element e:list) {
            System.out.println(e.fraction);
        }
        for (Element e:list){
            if(W < e.weight){
                totalWeight += (W*e.fraction);
            }else if(W>=e.weight){
                W = Math.abs(e.weight-W);
                totalWeight+= e.profit;
            }
        }
        System.out.println(totalWeight);
    }
}
