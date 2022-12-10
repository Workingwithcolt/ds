package BinarySeach;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Median {
    public static int countSmaller(List<Integer> row,long target){
       int l = 0,h = row.size()-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(row.get(mid)<= target){
                l = mid+1;
            }else{
                h  = mid-1;
            }
        }//here when the the low and high cross each other we want the low that is count of the element
        //lesss than the mid element
        return l;
    }
    public static long FindMedian(List<List<Integer>> A){
        long low = 1;
        long high = 1000000000;
        int n = A.size();
        int M = A.get(0).size();
        while(low<=high){
            int count = 0;
         long mid = low+high/2;
         for(int i=0;i<n;i++){
             count+=countSmaller(A.get(i),mid);
         }
         int target = (n*M)/2;
         if(target >= count){
             low = mid+1;
         }else{
             high = mid-1;
         }
        }
        return low;
    }


}
