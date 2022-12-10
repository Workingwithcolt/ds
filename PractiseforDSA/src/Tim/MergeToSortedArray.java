package Tim;

public class MergeToSortedArray {
    public static void swap(int[] a,int[] b ,int pointer1,int pointer2){
        int temp = a[pointer1];
        a[pointer1] = b[pointer2];
        b[pointer2] =temp;
    }
    public static void MergesortedArray(int[] a,int[] b,int m,int n) {
        int gap = (int)Math.ceil((double)(n + m) / 2.0);
        int pointer1 = 0;
        int pointer2 = gap;
        while (gap>0){
            pointer1 = 0;
            pointer2 =gap;
            while (pointer2 < (n + m)) {
                if (pointer2 < m && a[pointer1] > a[pointer2] ) {
                    swap(a, a, pointer1, pointer2);
                } else if ( pointer1 < m && pointer2 >= m && a[pointer1] > b[pointer2-a.length]) {
                    swap(a, b, pointer1, pointer2 - a.length);
                } else if ( pointer1 >= m && pointer2 >= m && b[pointer1-a.length] > b[pointer2-a.length]) {
                    swap(b, b, pointer1 - a.length, pointer2 - a.length);
                }
                pointer1++;
                pointer2++;
            }
            if(gap == 1){
                gap =0;
            }else{
                gap =(int)Math.ceil((double)gap / 2.0);
            }
        }
        for (int e1:a) {
            System.out.print(e1);
        }
        System.out.println();
        for (int e2:b) {
            System.out.print(e2);
        }//logn time complexotu
    }
    public static void SecondApproach(int[] a,int[] b,int m,int n){
        int i,k;
        for(i=0;i<m;i++){
            if(a[i]>b[i]){
                int temp  = a[i];
                a[i] = b[i];
                b[i] = temp;
            }
            int first = b[0];
            for(k=1;k<n && b[k] < first;k++){
                b[k-1] = b[k];
            }
            b[k-1] = first;
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,8,10};
        int[] b = {4,7,9};
        MergesortedArray(a,b,a.length,b.length);
    }
}
9t