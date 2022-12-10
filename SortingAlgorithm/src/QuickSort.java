import java.util.Collections;
public class QuickSort {
    static int partition(int[] array,int start,int end){
        System.out.println("start:"+start+" End :"+end);
        int pivot = end;
        int i = start-1;
        for(int j=start;j<=end;j++){
            if(array[j]<= array[pivot]){
                i++;
                System.out.println("value of i"+i+"and value of j"+j);
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;//10,9,8,7,5,3,4,2 -> 2 9 8 7 5 3 4 10  ->
                System.out.println("swaping between"+array[i]+"and"+array[j]);
            }
        }
        for(int k=0;k<array.length;k++){
            System.out.print(array[k]+" ");
        }
        return i;
    }
//    10,9,8,7,5,3,4,2
    //
    public static void quickSort(int[] array,int start,int end){
        if(start<end){
            int pivot = partition(array,start,end);
            System.out.println("pivote"+pivot);
            quickSort(array, start, pivot-1);
            System.out.println(" second");
            quickSort(array, pivot+1, end);
        }
    }
    void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {8,1,3,2,6,7};
        quickSort(arr,0, arr.length-1);
    }
}
