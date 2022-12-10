import java.util.Arrays;
import java.util.Scanner;

public class MaximumsumafterK {
//    Given an array of size n and a number k. We must modify array K number of times. Here modify array means in each operation we can replace any array element arr[i] by -arr[i].
//    We need to perform this operation in such a way that after K operations, sum of array must be maximum?
//    Input : arr[] = {-2, 0, 5, -1, 2}
//    K = 4
//    Output: 10
//    Explanation:
//            1. Replace (-2) by -(-2), array becomes {2, 0, 5, -1, 2}
//2. Replace (-1) by -(-1), array becomes {2, 0, 5, 1, 2}
//3. Replace (0) by -(0), array becomes {2, 0, 5, 1, 2}
//4. Replace (0) by -(0), array becomes {2, 0, 5, 1, 2}
//
//    Input : arr[] = {9, 8, 8, 5}
//    K = 3
//    Output: 20
    public static void main(){
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int[] arr= new int[N];
        for(int i=0;i<N;i++){
            arr[i] = s.nextInt();
        }
        int counter = 0;
        int start = 0;
        int furtherstart =1;
        int k = s.nextInt();
        Arrays.sort(arr);
        while(true){
            if(arr[start] < arr[furtherstart]){
                arr[start] = -arr[start];
                counter++;
            }else if(arr[start]>arr[furtherstart]){
                start = furtherstart;
                furtherstart ++;
            }
            if(counter == k){
                break;
            }
        }
        int sum  = 0;
        for (int i=0;i<N;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
