package BinarySeach;

public class AgressiveCows {
    public static boolean canplace(int target,int[] arr,int numbercows){
        int count=1;
        int initial = arr[0];
        for(int i=1;i<arr.length;i++){
            if((arr[i]-initial) >= target){
                count++;
                initial = arr[i];
            }
        }
        if(count == numbercows) {
            return true;
        }else{
            return false;
        }

    }
    public static int f(int[] arr,int numbercows){
        int low = 1,high  = arr[0]-arr[arr.length-1];
        int res =-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(canplace(mid,arr,numbercows)){
                res = mid;
                low = mid+1;//here if the mid is satisfy all the cows then we trying to
                //find greates maximum value
            }else{
                high = mid-1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,8,9};
        int cows = 3;
        System.out.println(f(arr,cows)+"it is the result");
    }
}
