package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TrappingWater {
    public static int MaximumWater(int[] arr){
        int sum = 0;
        int Maximumleft =0;
        int Maximumright = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[Maximumleft]<arr[i]){
                Maximumleft = i;
            }
            for(int j=i+1;j<arr.length;j++){
                if(arr[Maximumright]<arr[j]){
                    Maximumright = j;
                }
            }
            int t = Math.min(arr[Maximumleft],arr[Maximumright])-arr[i];
            if(t>0){
                sum+=t;
            }
        }
        return sum;
    }
    public static int OptimizeApproach(int[] arr){
        int left = 0;
        int right = arr.length-1;
        int leftmost =0;
        int result = 0;
        int rightmost = 0;
        while(left<=right){
            if(arr[left]<=arr[right]){
                if(arr[left] >= leftmost){
                    leftmost =arr[left];
                }else{
                    result+=(leftmost-arr[left]);
                }
                left++;
            }else{
                if(arr[right] >= rightmost){
                    rightmost = arr[right];
                }else{
                    result+=(rightmost-arr[right]);
                }
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,0,3,2,5};
//        System.out.println(MaximumWater(arr));
        System.out.println(OptimizeApproach(arr));
    }
}
