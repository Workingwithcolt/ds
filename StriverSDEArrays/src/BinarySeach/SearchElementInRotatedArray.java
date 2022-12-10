package BinarySeach;

public class SearchElementInRotatedArray {
    public static int Search(int[] arr,int k){
        int lo = 0;
        int hi = arr.length-1;
        int target = 0;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid] == k){
                return mid;
            }
            if(arr[lo] <= arr[mid]){
                if(target>=arr[lo] && target <= arr[mid]){
                    hi = mid-1;
                }else{
                    lo =mid+1;
                }
            } else{//descended order
            if(target>=arr[mid] && arr[hi] >= target){
                lo = mid+1;
            }else{
                hi = mid-1;
            }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(Search(arr,0));
    }
}
