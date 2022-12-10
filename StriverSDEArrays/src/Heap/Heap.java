package Heap;

import java.util.Scanner;

public class Heap {
    public int[] arr;
    int size = 0;
    int sizeoftree = 0;

    public Heap(int size) {
        this.arr = new int[size + 1];
    }

    public int getroot() {
        return arr[1];
    }

    public int insert(int value, String heaptype) {
        arr[sizeoftree + 1] = value;
        sizeoftree++;
        bottomtoup(sizeoftree, heaptype);
        return value;
    }

    public int[] bottomtoup(int index, String heaptype) {
        int parent = index - 1;
        if (index <= 1) {
            return arr;
        }
        if (heaptype == "max") {
            if (arr[parent] < arr[index]) {
                int temp = arr[parent];
                arr[parent] = arr[index];
                arr[index] = temp;
                bottomtoup(parent, heaptype);
//                bottomtoup(parent+1,heaptype);
            } else {

            }// 4 1 10 9 0 =>
            //1 4
        } else if (heaptype == "min") {
            if (arr[parent] > arr[index]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
                bottomtoup(parent, heaptype);
//                    bottomtoup(parent+1,heaptype);
            } else {

            }//1 4 => 1 2 3 4
        }
        return arr;
    }

    public void toptobottom(int index, String heaptype) {
        int left = index * 2;
        int right = index * 2 + 1;
        int parent = index;
        int swapchild = 0;
        if (left > sizeoftree) {
            return;
        }
        if (heaptype == "max") {
            if (left == sizeoftree) {
                if (arr[parent] < arr[left]) {
                    int temp = arr[left];
                    arr[left] = arr[parent];
                    arr[parent] = temp;
                } else {
                    return;
                }
            } else {
                if (arr[left] > arr[right]) {
                    swapchild = left;
                } else if (arr[right] > arr[left]) {
                    swapchild = right;
                }
                if (arr[parent] < arr[swapchild]) {
                    int temp = arr[swapchild];
                    arr[swapchild] = arr[parent];
                    arr[parent] = temp;
                }
            }
        } else if (heaptype == "min") {
            if (left == sizeoftree) {
                if (arr[parent] > arr[left]) {
                    int temp = arr[parent];
                    arr[parent] = arr[left];
                    arr[left] = temp;
                } else {
                    return;
                }
            } else {
                if (arr[left] < arr[right]) {
                    swapchild = left;
                } else if (arr[right] < arr[left]) {
                    swapchild = right;
                }
                if (arr[parent] > arr[swapchild]) {
                    int temp = arr[parent];
                    arr[parent] = arr[swapchild];
                    arr[swapchild] = temp;
                }
            }
        }
        toptobottom(swapchild, heaptype);
    }

    public boolean isEmpty() {
        if (sizeoftree == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int extracthead(String heaptype) {
        if (isEmpty()) {
            return -1;
        }
        int extractvalue = arr[1];
        arr[1] = arr[sizeoftree];
        sizeoftree--;
        toptobottom(1, heaptype);
        return extractvalue;
    }

    public void deleteHeap() {
        arr = null;
        System.out.println("heap is successfully deleted");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = 6;
        Heap heap = new Heap(size);
        for (int i = 0; i < size; i++) {
            int value = s.nextInt();
            heap.insert(value, "max");
        }
//        for (int i = 1; i <=heap.sizeoftree; i++) {
//            System.out.print(heap.arr[i] + " ");
//        }
        heap.extracthead("max");
        heap.extracthead("max");
        System.out.println(heap.extracthead("max"));
        System.out.println();
        for (int i = 1; i <=heap.sizeoftree; i++) {
            System.out.print(heap.arr[i] + " ");
        }
    }
}

