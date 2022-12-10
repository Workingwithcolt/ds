public class InsertionSort {
    void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void insertSort(int[] arr){
        for(int i=1;i< arr.length;i++){//5 4 3 2
            int temp = arr[i], j = i;// 5 | 4 3 2 ...4 5| 3 2.....4 3 5 2..3 4 5 2..2 3 4 5
            while(j > 0 && arr[j-1]>temp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }
}
