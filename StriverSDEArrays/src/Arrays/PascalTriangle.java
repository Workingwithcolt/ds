package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void pascalTriangle(int numberrows){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> prev = null,row = null;
        for(int i=0;i<numberrows;i++){
            row = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j == 0 || j== i){
                    row.add(1);
                }else{
                    row.add(prev.get(j-1) + prev.get(j));
                }
                prev = row;
                res.add(row);
            }
        }
    }
    public static void secondApproach(int[] arr){
        List<Integer> prev = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            prev.add(arr[i]);
        }
        List<Integer> curr = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<prev.size();j++) {
                curr.add((prev.get(j-1)+prev.get(j))%10);
            }
            prev = curr;
            curr = new ArrayList<>();
        }
        for (Integer e:prev) {
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        int[] arr = {4,5,3,2};
        secondApproach(arr);
    }
}
