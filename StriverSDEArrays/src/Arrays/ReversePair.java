package Arrays;

import java.util.ArrayList;

public class ReversePair {
    public static int Merge(int low,int mid,int high,int[] arr){
        int count =0;
        int j = mid+1;
        for(int i=low;i<=mid;i++){
            while(j<=high && arr[i]>(2*arr[j])){
                j++;
            }
            count += (j-(mid+1));
        }
        ArrayList<Integer> temp =new ArrayList<>();
        int left = low,right = mid+1;
        while(left<=mid && right<high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left++]);
            }else{
                temp.add(arr[right++]);
            }
        }
        while(left<=mid){
            temp.add(arr[left++]);
        }
        while(right<high){
            temp.add(arr[right++]);
        }
        return count;
    }
    public static int MergeSort(int low,int high,int[] arr){
        int count = 0;
        if(low>=high) {
            return 0;
        }
            int mid = (low+high)/2;
            count+=MergeSort(low,mid, arr);
            count+=MergeSort(mid+1,high,arr);
            count+=Merge(low,mid,high,arr);
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {40,25,19,12,9,6,2};
        System.out.println(MergeSort(0,arr.length,arr));
    }
}
