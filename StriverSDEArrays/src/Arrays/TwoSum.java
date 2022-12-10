package Arrays;

import java.util.Arrays;

public class TwoSum {
    public static void  twosum(int[] arr,int target){
        int first = 0;
        int last = arr.length-1;

        int[] temp = new int[arr.length];
        temp = arr;
        Arrays.sort(temp);
        while(first<temp.length || last >= 0){
            if(temp[first]+temp[last]>target){
                last--;
            }else if(temp[first]+temp[last]<target){
                first++;
            }else if(temp[first]+temp[last] == target){
                break;
            }
        }
        for (int i=0;i<arr.length;i++) {
            if(temp[first] == arr[i]){
                System.out.println(i);
            }else if(last == arr[i]){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
    }
}
