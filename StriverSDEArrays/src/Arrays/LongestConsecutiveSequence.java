package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static int BRUTEFORCE(int[] arr){
        Arrays.sort(arr);
        int further = arr[0];
        int count =1;
        int greater_sequence = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i] == further+1){
                count+=1;
            }else {
                count = 1;
            }
            if (count > greater_sequence) {
                greater_sequence = count;
            }
            further = arr[i];
        }
        System.out.println(greater_sequence);
        return count;
    }
    public static int SecondApproach(int[] arr){
        Set<Integer> hashSet= new HashSet<>();
        for(int num:arr){
            hashSet.add(num);
        }
        int longestsequence = Integer.MIN_VALUE;
        for(int num:arr){
            if(!hashSet.contains(num-1)){
                int currentNum = num;
                int currentStream = 1;
                while(hashSet.contains(currentNum+1)){
                    currentNum=+ 1;
                    currentStream+=1;
                }
            }
        }
        return longestsequence;
    }
    public  static void main(String[] args){
        int[] arr = {3,8,5,7,6};
        SecondApproach(arr);
        BRUTEFORCE(arr);

    }
}
