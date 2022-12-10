import java.util.Arrays;
public class MinimumandMaximumbuyCandies {
    public static void reverse(int[]  arr){
        int N = arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[N-i];
             arr[N-i] =arr[i];
             arr[i] = temp;
        }
    }
    public static void main(String[] args){
        int k= 2;
        int[] arr ={1,2,3,4,5};
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;
        int min = 0;
        int max = 0;
        while(i<=j){
            min+=arr[i];
            i++;
            j =j-k;
        }
        //5,4,3,2,1
        i = 0;
        j =arr.length-1;
        reverse(arr);
        while(i<=j){
            max+=arr[i];
            i++;
            j =j-k;
        }
        System.out.println("min"+min+"max:"+max);
    }
}
