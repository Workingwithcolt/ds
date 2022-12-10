public class MergeSort {
    public static void merge(int[] A,int left ,int middle,int right){
        System.out.println("left:"+left+"right: "+right+"middle:"+middle);
        int[] leftTempArray = new int[middle-left+2];//add 2 to two avoid the index out of bound exception
        int[] rightTempArray = new int[right-middle+1];//similarly we here add the 1 to avoid the index out of bound exception
        for(int i=0;i<=middle-left;i++){
            leftTempArray[i] = A[left+i];
        }
        for(int i=0;i<right-middle;i++){
            rightTempArray[i] = A[middle+i+1];
        }
        leftTempArray[middle-left+1] = Integer.MAX_VALUE;
        rightTempArray[right-middle] = Integer.MAX_VALUE;

        int i=0,j=0;
        for(int k=left;k<=right;k++){
            if(leftTempArray[i]<rightTempArray[j]){
                A[k] = leftTempArray[i];
                i++;
            }else{
                A[k] = rightTempArray[j];
                j++;
            }
        }
    }
    public static  void mergeSort(int[] Array,int left,int right){
        if(right>left){
            int m = (left+right)/2;
            mergeSort(Array, left, m);
            mergeSort(Array,m+1,right);
            merge(Array,left,m,right);
        }
    }
    void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
