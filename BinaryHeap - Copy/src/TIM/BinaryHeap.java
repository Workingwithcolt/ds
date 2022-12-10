package TIM;

public class BinaryHeap {
    int arr[];
    int sizeoftree;

    public BinaryHeap(int size) {
        arr = new int[size + 1];
        this.sizeoftree = 0;
        System.out.println("Binary has been created");
    }

    public boolean isEmpty() {
        if (sizeoftree == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Binary heap is empty ");
            return 0;
        } else {
            return arr[1];
        }
    }

    public int sizeofbp() {
        return sizeoftree;
    }

    public void levelOrder() {
        for (int i = 1; i <= sizeoftree; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    public void heapifybottomtotop(int index, String heaptype) {
        int parent = index / 2;
        int temp;
        if (index <= 1) {
            return;
        }
        if (heaptype == "min") {
            if (arr[index] < arr[parent]) {
                temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        } else if (heaptype == "max") {
            if (arr[index] > arr[parent]) {
                temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        }
        heapifybottomtotop(parent, heaptype);//here we are going bottom to top
    }

    public void insert(int value, String heaptype) {
        arr[sizeoftree + 1] = value;//here we are adding the new element after the last inserted element by addition of 1
        sizeoftree++;
        heapifybottomtotop(sizeoftree, heaptype);
        System.out.println("The value  is successfully inserted");
    }

    public void heapifytoptobottom(int index, String heaptype) {
        int left = index * 2;//it return the nodes left child index
        int right = index * 2 + 1;
        int swapchild = 0;
        if (sizeoftree < left) {
            return;//Binary heap that dont has a child
        }
        if (heaptype == "max") {
            //here we have two condition
            if (sizeoftree == left) {//it has a only one child
                if (arr[index] < arr[left]) {
                    int temp = arr[left];
                    arr[index] = arr[left];
                    arr[left] = temp;
                }
                return;
            } else {

                if (arr[left] > arr[right]) {
                    swapchild = left;
                } else {
                    swapchild = right;
                }
                if (arr[index] < arr[swapchild]) {
                    int temp = arr[index];
                    arr[index] = arr[swapchild];
                    arr[swapchild] = temp;
                }
            }
        } else if (heaptype == "min") {
            if (sizeoftree == left) {//that code for one child
                if (arr[index] > arr[left]) {
                    int temp = arr[left];
                    arr[index] = arr[left];
                    arr[left] = temp;
                }
                return;
            } else {//that code for two child
                if (arr[left] < arr[right]) {
                    swapchild = left;
                } else {
                    swapchild = right;
                }
                if (arr[index] > arr[swapchild]) {
                    int temp = arr[index];
                    arr[index] = arr[swapchild];
                    arr[swapchild] = temp;
                }
            }
        }
        heapifytoptobottom(swapchild, heaptype);
    }

    public int extractHeadofbp(String headtype) {
        if (isEmpty()) {
            return -1;
        } else {
            int extractedValue = arr[1];//in heap tree we only can extract the root
            arr[1] = arr[sizeoftree];
            sizeoftree--;
            heapifytoptobottom(1, headtype);
            return extractedValue;
        }
    }

    public void deleteBH() {
        arr = null;
        System.out.println("Binary heap is successfully deleted");
    }

}
