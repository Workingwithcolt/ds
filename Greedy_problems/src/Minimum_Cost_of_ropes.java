import java.util.PriorityQueue;

public class Minimum_Cost_of_ropes {

    public static int minimumCost(int[] arr){
        int firstpeek =0;
        int secondpeek =0;
        int cost =0;
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for (int e:arr){
            p.add(e);
        }
        for (int e:p) {
            System.out.println(e+"it is the value");
        }
        int prioritylength = p.size();
        int i=0;
        while(prioritylength>0){
            firstpeek = p.poll();
            System.out.println("firstpeek"+firstpeek);
            secondpeek = p.poll();
            System.out.println("secondpeek"+secondpeek);
            cost += (firstpeek+secondpeek);
            if(p.size()>0) {
                p.add((firstpeek + secondpeek));
            }
            System.out.println(p.size());
            i++;
            prioritylength = p.size();
        }
        return cost;// 2 3 4 6
        //6 9
        // 5 + 9+15
    }
    public static void main(String[] args){
        int[] arr = {4, 3, 2, 6};
        System.out.println(minimumCost(arr));
    }

}
