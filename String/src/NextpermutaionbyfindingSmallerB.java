public class NextpermutaionbyfindingSmallerB {
    public static void Reverse(int[] arr,int i,int j){
        int mid = j-i;
        mid = mid/2;
        for(int m =0;m<mid;m++){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }

    }
    static  void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int[] nextPermution(int n,int[] arr){
        if(n == 1){
            return arr;
        }
        int i;
        for(i = n-1;i>0;i--){
            if(arr[i] > arr[i-1]){
                break;
            }
        }
        System.out.println(i+"i");
        if(i != 0){
            for(int j=n-1;j>=i;j--){
                if(arr[i-1] < arr[j] && arr[j]<arr[i]){
                    swap(arr,i-1,j);
                    break;
                }
            }
        }
        for (int el:arr) {
            System.out.print(el+" ");
        }
        System.out.println();
        Reverse(arr,i,arr.length-1);
        for (int el:arr) {
            System.out.print(el+" ");
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={5,3,4,9,7,6};
        nextPermution(arr.length,arr);
        int j = arr.length-1;
        int i = 0;
        int mid = j-i;
        mid = mid/2;
        for(int m =0;m<=mid;m++){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
        for(int el:arr){
            System.out.println(el);
        }
    }
}
