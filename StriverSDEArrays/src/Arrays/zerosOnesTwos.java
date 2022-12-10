package Arrays;

public class zerosOnesTwos {
    public static void ZEROSONESTWOS(int[] arr){
        int low = 0,mid = 0;
        int temp = 0;
        int high = arr.length-1;
        while(mid<=high){
            switch (arr[mid]){
                case 0:
                    temp = arr[mid];
                    arr[mid] =arr[low];
                    arr[low] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp  = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp;
                    high--;
                    break;
            }
        }
        for (int a: arr){
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,1,0,1,2,2};
        ZEROSONESTWOS(arr);
    }
}
