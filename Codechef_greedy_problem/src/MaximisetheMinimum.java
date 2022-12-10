import java.util.Arrays;
import java.util.Scanner;

public class MaximisetheMinimum {
    public static int Maximumfromminimum(int[] arr,int N,int k){
        Arrays.sort(arr);
        k = Math.min(k,N-1);
        return arr[k];
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int testCases = s.nextInt();
        for(int m=0;m<testCases;m++){
            int N = s.nextInt();
            int K = s.nextInt();
            int[] arr = new int[N];
            for(int n=0;n<N;n++){
                arr[n] = s.nextInt();
            }
            System.out.println(Maximumfromminimum(arr,N,K));
        }
    }
//    that bellow question give the same result but it required the high memory
//    public static int Maximumfromminimum(int[] arr,int N,int k){
//        if(N >=2){
//            int lastvalue = 0;
//            int i= 1;
//            int counter = 0;
//            while(i>0){
//                if(arr[i] >= arr[i+1] && arr[i-1] >= arr[i]){
//                    arr[i] = arr[i-1];
//                    lastvalue = arr[i];
//                }else if(arr[i] <= arr[i-1] && arr[i] <= arr[i+1]){
//                    arr[i] = arr[i+1];
//                    lastvalue = arr[i];
//                }
//                if(arr.length-2 == i){
//                    return lastvalue;
//                }
//                i++;
//                counter +=1;
//                if(counter == k){
//                    return lastvalue;
//                }
//            }
//            return lastvalue;
//        }
//        return 0;
//    }
//    public static void main (String[] args) throws java.lang.Exception
//    {
//        Scanner s = new Scanner(System.in);
//        int testCases = s.nextInt();
//        for(int m=0;m<testCases;m++){
//            int N = s.nextInt();
//            int K = s.nextInt();
//            int[] arr = new int[N];
//            for(int n=0;n<N;n++){
//                arr[n] = s.nextInt();
//            }
//            System.out.println(Maximumfromminimum(arr,N,K));
//        }
//    }
}
