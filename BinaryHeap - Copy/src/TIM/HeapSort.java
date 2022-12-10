package TIM;

public class HeapSort {
    int[] arr = null;

    public HeapSort(int[] arr){
        this.arr = arr;
    }

    public void sort(){
        BinaryHeap bh = new BinaryHeap(arr.length);
        for(int i=0;i< arr.length;i++){
            bh.insert(arr[i],"min");
        }
        for(int i=0;i< arr.length;i++){
            arr[i] =bh.extractHeadofbp("min");
        }
    }

    void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10,23,43,5,3,5};
        HeapSort s = new HeapSort(arr);
        s.sort();
        s.printArray(arr);
    }
}
