package BinarySeach;

public class KthElementOfTwoSortedArray {
    public static void BruteforceApproach(int[] arr1,int[] arr2,int k){
        int i =0;
        int j =0;
        int value = 0;
        int count =0;
        for(int l=0;l<k;l++){
            if(arr1[i] < arr2[j]){
                value = arr1[i];
                i++;
            }else if(arr1[i]>arr2[j]){
                value = arr2[j];
                j++;
            }
        }
        System.out.println(value+"it is the");
    }
    public static int OptimizeSolution(int[] arr1,int[] arr2,int k) {
        int n = arr1.length;
        int m = arr2.length;
        if (n > m) {
            return OptimizeSolution(arr2, arr1, k);
        }
        int lo = 0;//Math.max(0,k-m);//here we taking the as possible as minimum elements(k-m) in the arr1
        //because there is possibility of k is higher than the length of the size of arr1
        int hi =n-1;// Math.min(k,n);//here we are taking the value of the  hi is minimum between k and length
        //of arr1
        while (lo <= hi) {
            int partition1 = (lo+hi) / 2;
            int partition2 = k - partition1;
            int l1 = partition1 == 0 ? Integer.MIN_VALUE : arr1[partition1-1];//it is first arr first part
            int l2 = partition2 == 0 ? Integer.MIN_VALUE : arr2[partition2-1];//it is second arr first part
            int r1 = partition1 == n ? Integer.MAX_VALUE : arr1[partition1];
            int r2 = partition2 == m ? Integer.MAX_VALUE : arr2[partition2];
            if(l1 <= r2 && l2<=r1){
                return Math.max(l1,l2);
            }else if(l1 >r2 ){
                hi = partition1-1;
            }else{
                lo = partition1+1;
            }
        }
        return 1;
    }
    public static void main(String[] args){
        int[] arr = {2,3,6,7,9};
        int[] arr2 = {1,4,8,10};
        BruteforceApproach(arr,arr2,5);
        System.out.println(OptimizeSolution(arr,arr2,5));
    }
}
