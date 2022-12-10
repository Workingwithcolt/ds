package Heap;

import java.util.Scanner;

public class kthLargetAndSmallest {
    public static void BruteforceApproach(int k) {
        //here we can do that problem by use heap also
        Scanner s = new Scanner(System.in);
        int size = 6;
        Heap heap = new Heap(size);
        for (int i = 0; i < size; i++) {
            int value = s.nextInt();
            heap.insert(value, "max");
        }
        System.out.println(heap.arr[heap.sizeoftree-k+1]+"it is k th smallest value");
        int valueofK = 0;
        for (int j=0;j<k;j++) {
            valueofK = heap.extracthead("max");
        }
        System.out.println(valueofK+"it is kth larget");
            System.out.println();
        }
//        public static void Heap()
        public void Optimise(){
        }
        public static int partition(int[] arr,int start,int end){
        int i = start-1;
        int pivote = end;
        for(int j=start;j<end;j++){
            i++;
            if(arr[j] <= arr[pivote]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return i;
        }
        public static void QuickSort(int[] arr,int start,int end,int k) {
            if (start < end) {
                int pivote = partition(arr, start, end);
                if (pivote + 1 == k) {
                    System.out.println(arr[pivote+1] + "it is largest");
                    return;
                }
                QuickSort(arr, start, pivote - 1, k);
                QuickSort(arr, pivote + 1, end, k);
            }
        }

    public static void main(String[] args) {
//        BruteforceApproach(3);
        int[] arr ={1,3,2,4,8,5};
        QuickSort(arr,0,arr.length-1,3);
    }
    }
