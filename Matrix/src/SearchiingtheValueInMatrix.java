public class SearchiingtheValueInMatrix {
    public static boolean SearchMatrix(int[][] matrix,int target){
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
        {
            return false;
        }
        int start = 0;
        int end = matrix[0].length-1;
        while(end >=0 && start<= matrix[0].length -1){
            if(matrix[start][end] < target){
                start++;
            }else if(matrix[start][end] > target){
                end--;
            }else if(matrix[start][end] == target){
                return true;
            }
        }
        return false;
    }
    public static boolean BinarySearch(int[][] matrix,int target){
        int i=matrix.length;
        int j = matrix[0].length;
        int low = 0,high = (i*j)-1,mid = 0;
        while(low<=high){
            mid = ((low+high))/2;
            if(matrix[mid/j][mid%j] == target){
                return true;
            }else if(matrix[mid/j][mid%j] >target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[][] a = {{1,2,3,4},
                    {6,7,8,9},//
                    {10,11,12,13},
                    {14,15,16,17}};
        //taregt =15
        boolean t = BinarySearch(a,15);
        System.out.println(t);
    }
}
