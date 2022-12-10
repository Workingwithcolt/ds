package Arrays;

import java.util.ArrayList;
import java.util.List;

public class NextPermutation {
    public static void swap(int i,int j,int[] arr){
        int temp = arr[i];
        arr[i] =  arr[j];
        arr[j] = temp;
    }
    public  static void  NextPermutation(int index, int[] arr, List<List<Integer>> ans){
        if(index == arr.length){
            List<Integer> ds = new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                ds.add(arr[i]);
            }
            ans.add(ds);
            return;
        }
        for(int i=index;i<arr.length;i++){
            swap(index,i,arr);
            NextPermutation(index+1,arr,ans);
            swap(index,i,arr);
        }
    }
    public static void reverse(int[] arr,int l,int h){
        while(l<h) {
            swap(l++, h--, arr);
        }
    }
    public static void SecondnextPermutation(int[] arr){
        if(arr == null || arr.length<=1) return;
        int i;
        for(i=arr.length-2;i>=0 && arr[i] >= arr[i+1];i--);
        //here that loop will go to zero for finding the value which satisfy the arr[i]>=arr[i+1]
            //here we start from arr.length-2 becoz here we check at arr[i+1]
            if(i>=0){//here we want only the positive value of i
                int j = arr.length-1;
                while (j>=0 && arr[j]<=arr[i])j--;
                //here the above loop will execute till the bellow condition is satisfying arr[j]<=arr[i]
                    swap(i,j,arr);
                reverse(arr,i+1,arr.length-1);
            }
    }
    public static void main(String[] args){
        int[] arr = {1,3,2};
        SecondnextPermutation(arr);
        for (int a:arr) {
            System.out.println(a);
        }
//        List<List<Integer>> ans = new ArrayList<>();
//        Arrays.NextPermutation(0,arr,ans);
    }
}
