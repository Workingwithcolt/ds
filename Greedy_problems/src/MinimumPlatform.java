import java.util.*;

public class MinimumPlatform {
    public  static void  main(String[] args){
        int[] arr = {1,2,6,8};
        int[] dep= {5,9,7,10};
        Arrays.sort(arr);
        Arrays.sort(dep);
//        j//1,2,6,8
//        i//5,7,9,10,
        int i = 0;
        int j = 1;
        int plat = 1;
        while(i< arr.length && j<arr.length){
            if(arr[j]<=dep[i]){
                plat++;
            }else{
                i++;
            }
            j++;
        }
        System.out.println(plat);
    }
}