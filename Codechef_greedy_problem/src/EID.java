import java.util.*;

public class EID {
    public static int minimumDiffer(int[] arr,int N){
        Arrays.sort(arr);
        int minimumDifferenece = Integer.MAX_VALUE;//nlogn
        for(int i=0;i<N-1;i++){
            if(Math.abs(Math.abs(arr[i]) - Math.abs(arr[i+1])) < minimumDifferenece){
                minimumDifferenece = Math.abs(Math.abs(arr[i]) - Math.abs(arr[i+1]));
            }
        }
        return minimumDifferenece;
    }
    public  static void main(String[] args){
        Scanner s =new Scanner(System.in);
        int testCases = s.nextInt();
        for(int i=0;i<testCases;i++){
            int N = s.nextInt();
            int[] arr = new int[N];
            for(int j=0;j<N;j++){
                arr[j] = s.nextInt();
            }
            System.out.println(minimumDiffer(arr,N));
        }
    }
}
