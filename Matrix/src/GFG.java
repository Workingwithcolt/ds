public class GFG{
    static class HeapNode
    {
        int val;
        int r;
        int c;

        HeapNode(int val, int r, int c)
        {
            this.val = val;
            this.c = c;
            this.r = r;
        }
    }
    static void minHeapify(HeapNode harr[],
                           int i, int heap_size)
    {
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int min = i;

        if(l < heap_size && r<heap_size && harr[l].val < harr[i].val && harr[r].val < harr[i].val){
            HeapNode temp=harr[r];
            harr[r]=harr[i];
            harr[i]=harr[l];
            harr[l]=temp;
            minHeapify(harr ,l,heap_size);
            minHeapify(harr ,r,heap_size);
        }
        if (l < heap_size && harr[l].val < harr[i].val){
            HeapNode temp=harr[i];
            harr[i]=harr[l];
            harr[l]=temp;
            minHeapify(harr ,l,heap_size);
        }
    }
    public static int kthSmallest(int[][] mat,int n, int k)
    {
        if (k < 0 && k >= n * n)
            return Integer.MAX_VALUE;
        HeapNode harr[] = new HeapNode[n];

        for(int i = 0; i < n; i++)
        {
            harr[i] = new HeapNode(mat[0][i], 0, i);
            System.out.println(harr[i].val+" ");
        }

        HeapNode hr = new HeapNode(0, 0, 0);
        for(int i = 1; i <= k; i++) {
            hr = harr[0];
            System.out.println(hr.val + " hr");
            int nextVal = hr.r < n - 1 ?
                    mat[hr.r + 1][hr.c] :
                    Integer.MAX_VALUE;
            System.out.println(hr.r + 1 + ":[hr.r + 1]" + hr.c + ":hr.c");
            System.out.println("mat[hr.r + 1][hr.c]" + mat[hr.r + 1][hr.c]);
            System.out.println("nextVal" + nextVal);
            harr[0] = new HeapNode(nextVal, hr.r + 1, hr.c);
            System.out.println("harr[0].val" + harr[0].val);

            // Heapify root
            for (int j = 0; j < harr.length; j++) {
                System.out.print(harr[j].val + " ");
            }
            System.out.println();
            minHeapify(harr, 0, n);
            for(int j=0;j<harr.length;j++){
                System.out.print(harr[j].val+" ");
            }
            System.out.println("k is complete");
        }

        // Return the value at last extracted root
        return hr.val;
    }

    // Driver code
    public static void main(String args[])
    {
        int mat[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 25, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        int res = kthSmallest(mat, 4, 2);

        System.out.print("7th smallest element is "+ res);
    }
}

