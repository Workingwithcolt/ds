package Arrays;

public class SearchInSortedArray {
    public static boolean BinarySearch(int[][] arr,int target){
        int low = 0;
        int high = ((arr.length)* arr[0].length)-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid/arr[0].length][mid%arr[0].length] == target){
                return true;
            }else if(arr[mid/arr[0].length][mid%arr[0].length]>target){
                high =mid-1;
            }else{
                low = mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nn = 10;
        nn = 10*(-10);
        System.out.println(nn);
    }

}
