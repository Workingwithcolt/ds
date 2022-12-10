package Arrays;

import java.util.HashMap;

public class LongestLengthwithZeroSum {
    /**
     *
     */
    //longest length with zero sum
    public static int LongestLength(int[] arr){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum == 0){
                    if((j-i+1) > max){
                        max= (j-i+1);
                    }
                }
            }
        }
        return max;
    }
    public static int  Optimisesolution(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int maximumLength = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
            if(!map.containsKey(sum)){
                map.put(sum,i);
                if(sum == 0){
                    if(maximumLength < (i+1)){
                        maximumLength = i+1;
                    }
                }
            }else{
                int index = map.get(sum);
                if((i-index)>maximumLength){
                    maximumLength = (i-index);
                }
            }
        }
        return maximumLength;
    }
    public static void main(String[] args) {
        int[] arr = {9,-3,3,-1,6,-5};
        System.out.println(Optimisesolution(arr));
    }
}
