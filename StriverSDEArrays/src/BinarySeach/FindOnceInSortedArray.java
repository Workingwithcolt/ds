package BinarySeach;
import java.util.List;

public class FindOnceInSortedArray {
    //here You need to find the eleement which come in once
    //for eg [1,1,2,3,3,5,5]
    //2 come once
    Integer f(List<Integer>nums){
        int low = 0,high = nums.size()-2;
        while(low<=high){
            int mid = low+high/2;
            if(nums.get(mid) == nums.get(mid^1)){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return nums.get(low);
    }
    public static void main(String[] args) {
        int  s = 34;
        System.out.println(s^1);
        int[] arr ={1,1,2,3,3,4,4};
    }
}
