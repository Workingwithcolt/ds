package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class FOURsum {
    public static void foursum(int[] arr,int target){
        int front = 0;
        int back = 0;
        ArrayList<Integer> a = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int target1 = target-arr[i];
            for(int j=i+1;j<arr.length;j++){
                int target2 = target1 -arr[j];
                 front = j+1;
                 back = arr.length-1;
                 while(front<back){
                     if(arr[front]+arr[back]>target2){
                         back--;
                     }else if(arr[front]+arr[back] < target2){
                         front--;
                     }else if(arr[front]+arr[back] == target2){
                         a.add(arr[i]);
                         a.add(arr[j]);
                         a.add(arr[front]);
                         a.add(arr[back]);
                         while(arr[front] == a.get(3))front++;
                         while(arr[back] == a.get(4))back--;
                     }
                 }
                 while(j+1<=arr.length-1 && arr[j] == arr[j+1])j++;
            }
            while(arr[i] == arr[i+1] && i+1 <=arr.length-1)i++;
        }
    }
}
