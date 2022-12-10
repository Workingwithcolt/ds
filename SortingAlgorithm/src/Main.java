public class Main {
    public static void main(String[] args) {
//        Bubble bs =new Bubble();
//        int arr[] = {5,2,3,1,4};
//        bs.bubbleSort(arr);
//        bs.printArray(arr);
//        Selection ss = new Selection();
//        int arrr[] ={5,4,3,2,1} ;
//        ss.Selection(arrr);
//        ss.printArray(arrr);
//        int[] arr1 = {6,5,7,3,2,1};
//        InsertionSort.insertSort(arr1);
//        new InsertionSort().printArray(arr1);
//        int arr[] = {1,32,21,12,11,3};
//        BucketSort bas = new BucketSort(arr);
//        bas.printArray(arr);
//        bas.bucketSort();
//        bas.printArray(arr);
//        MergeSort ms = new MergeSort();
        int arr2[] = {10,9,8,7,5,3,4,2};
//        MergeSort.mergeSort(arr2,0,arr2.length-1);
//        ms.printArray(arr2);
        QuickSort.quickSort(arr2,0,arr2.length-1);
        new QuickSort().printArray(arr2);
    }
}
