import java.util.PriorityQueue;

public class Kthmallestelement {
    public  static PriorityQueue<Integer> pq = new PriorityQueue<>();
    public static int findKthelement(int[][] arr,int n) {
        int value = 0;
        for (int i = 0; i <arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                pq.offer(arr[i][j]);
            }
        }
        for(int i=0;i<n;i++)
            value =  pq.poll();
        return value;
    }
    public static void main(String[] args) {
        int[][] arr ={{30,20,40},
                {15,25,35},
                {25,29,37},
                {32,33,39}};
        System.out.println(findKthelement(arr,2));
    }

}
