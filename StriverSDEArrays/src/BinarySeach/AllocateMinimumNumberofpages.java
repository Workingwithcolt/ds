package BinarySeach;

public class AllocateMinimumNumberofpages {
    public  static boolean allocationisPossible(int barrier,int[] arr,int numberstudent){
        int allocated_student = 1,pages = 0;
        for(int i=0;i<arr.length;i++){
            if(pages+arr[i] > barrier) {
                allocated_student += 1;
                pages = 0;
            }
            pages+=arr[i];
        }
        if(allocated_student > numberstudent){
            return false;
        }else{
            return true;
        }
    }
    public static int MinimumPages(int[] arr,int student){
        //here that array is already sorted therefore we directly take the first element
        int low = arr[0];
        int high =0;
        int result= -1;
        for (int e:arr) {
            high+=e;
        }
        while(low<=high){
         int mid = (low+high)/2;
         if(allocationisPossible(mid,arr,student)){
             result = mid;
             high = mid-1;
             //here we want the value as minimum as where all the number of books get distributed in
             //the number of student
         }else{
             low = mid+1;
         }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr ={12,34,67,90};
        System.out.println(MinimumPages(arr,2));
    }
}
