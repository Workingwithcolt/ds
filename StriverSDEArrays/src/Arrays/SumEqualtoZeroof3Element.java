package Arrays;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SumEqualtoZeroof3Element {
    //The First Approach take the O(N^3logn) here the logn for inserting the element in the set
    public static  List<List<Integer>> Optimise(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> res =new LinkedList<>();
        for(int i=0;i<arr.length-2;i++){
            //here we are done arr.length-2 because 1 position for a and second position for b and c
            if(i ==0 || (i>0 && arr[i] != arr[i-1])){//
                //when i is at initial position  or if i is greater than 0 then we want to chck duplicate
                //element
                int lo = i+1,hi = arr.length-1,sum =0-arr[i];//here a is negative therefore we add apply
                //the negative in that way
                while(lo<hi){
                    //here we dont want to cross the low and hi therefore we make here strictly low
                    if((arr[lo]+arr[hi]) == sum){
                        res.add(Arrays.asList(arr[i],arr[lo],arr[hi]));
                        while(lo<hi && arr[lo] == arr[lo-1])lo++;
                        while(lo<hi && arr[hi] == arr[hi-1])hi++;
                        lo++;
                        hi--;
                    }else if((arr[lo] + arr[hi])< sum){
                        //here if the adddition of both element is less than sum the we have to grow that
                        //addition for that we move the lo++
                        lo++;
                    }else{
                        hi--;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> s = Optimise(arr);
        for(List<Integer> el:s){
            System.out.println(el);
        }
    }
}
