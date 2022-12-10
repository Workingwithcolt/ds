import java.lang.reflect.Array;
import java.util.Arrays;

public class LArrays {
    public static void main(String[] args) {
        int[] Arr = {1,2,3,4,5,6};
        int index = Arrays.binarySearch(Arr,5);
        System.out.println(index);
        Arrays.fill(Arr,12);
        System.out.println(Arr);
    }
}
