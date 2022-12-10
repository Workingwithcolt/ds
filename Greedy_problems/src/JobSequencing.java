import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JobSequencing {
    static class Element implements  Comparable<Element>{
        public int deadline;
        public int profit;
        public Element(int deadline,int profit){
            this.deadline = deadline;
            this.profit = profit;
        }

        @Override
        public int compareTo(Element o) {
            if(this.profit > o.profit) {
                return -1;
            }
            if(this.profit < o.profit) {
                return 1;
            }
            if(this.profit == o.profit) {
                return 0;
            }
            return 0;
        }
    }
    public static void main(String[] args){
        List<Element> list = new ArrayList<>();
        int[] Deadline ={4,1,1,1};
        int[] profit ={20,10,40,30};
        for (int i = 0;i< profit.length;i++) {
            Element e = new Element(Deadline[i],profit[i]);
            list.add(e);
        }
        int sum = 0;
        int[] arr = new int[profit.length];
        Collections.sort(list);
        for (Element e:list) {
            for(int j=e.deadline;j>=0;j--) {
                if (arr[e.deadline-1] != 1){
                    arr[e.deadline-1] = 1;
                    sum+=e.profit;
                    break;
                }
            }
        }
        System.out.println(sum+":sum");
    }
}
