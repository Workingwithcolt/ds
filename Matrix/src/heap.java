public class heap {
    public static int[] arr;
    public  static int sizeofTree;
    public heap(int size){
        this.arr =new int[size+1];
        this.sizeofTree = 0;
    }
    public boolean isEmpty(){
        if(sizeofTree == 0){
            return true;
        }else{
            return false;
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Heap is empty");
            return 0;
        }else{
            return arr[1];
        }
    }

    public static void heapifybottomtotop(int index, String heaptype) {
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

    public static void heapifytoptobottom(int index, String heaptype) {
        int left = index * 2;//it return the nodes left child index
        int right = index * 2 + 1;
        int swapchild = 0;
        if (sizeofTree < left) {
            return;//Binary heap that dont has a child
        }
        if (heaptype == "max") {
            //here we have two condition
            if (sizeofTree == left) {//it has a only one child
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
            if (sizeofTree == left) {//that code for one child
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
    public static heapnode[] insert(heapnode[] array){
        heap h = new heap(array.length);
        for(int i=0;i<array.length;i++) {
            arr[sizeofTree + 1] = array[i].value;
            sizeofTree++;
            heapifybottomtotop(sizeofTree,"min");
        }
        for(int i= 0;i<array.length;i++){
            array[i].value = arr[i+1];
        }
        return array;
    }
    public int extract(String heaptype){
        if(isEmpty()){
            System.out.println("Heap is empty");
            return -1;
        }else{
            int extractvalue = arr[1];
            arr[1]= arr[sizeofTree];
            sizeofTree--;
            heapifytoptobottom(1,heaptype);
            return extractvalue;
        }
    }
    //first we have to create the structure
    //then  we have to

    static class heapnode {
        int value;
        int row;
        int col;

        public heapnode(int value, int row, int col) {
            this.col = col;
            this.row = row;
            this.value = value;
        }
    }
    public  static int findkthsmallest(int[][] arrA,int n,int k) {
        if (k < 0 && k >= n * n) {
            return Integer.MAX_VALUE;
        }
        heapnode[] array = new heapnode[n];
        for(int i=0;i<array.length;i++){
            array[i] = new heapnode(arrA[0][i],0,i);
        }
        heapnode hr;
        hr = new heapnode(0,0,0);
        System.out.println(hr.value);
        for(int i=1;i<=k;i++){
            hr = array[0];
            int newvalue = (hr.row < n-1) ?
                    arrA[hr.row+1][hr.col]:Integer.MAX_VALUE;
            array[0] = new heapnode(newvalue,hr.row+1, hr.col);
            insert(array);
            for(int j=0;j<array.length;j++){
                System.out.println(array[j].value+" ");
            }
            System.out.println();
        }
        return hr.value;
    }


    // Driver code
    public static void main(String args[])
    {
        int mat[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 25, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        int res = findkthsmallest(mat, 4, 2);
        System.out.print("7th smallest element is "+ res);
    }
}
