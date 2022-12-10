package n;

import java.util.HashMap;
import java.util.Map;

public class node {
    public int insert(int[] nums){
        int max = Integer.MAX_VALUE;
        int j =0;
        int count = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[j] == nums[i]){
                count++;
            }else{
                j = i;
                count =1;
            }
            max = Math.max(max,count);
        }
        return max;
    }
    public static void m(double N){
        double a = 1/N;
        String s =String.valueOf(a);
        int count = 0;
        String res = "";
        boolean istrue = false;
        System.out.println(s);
        while(s.length()-1 > count && s.length() > 2) {
            if(s.charAt(count+1) == s.charAt(count)){
                res+=s.charAt(count+1);
                res+=s.charAt(count);
                break;
            }
            res +=""+s.charAt(count);
            count++;
            istrue = true;
        }
        if(istrue){
            System.out.println(res);
        }else if(res.length() > 1){
            if(res.charAt(0) == res.charAt(1)){
                System.out.println(res);
            }
        }else{
            System.out.println(res+"00");
        }
    }
    public static void main(String[] args){
        m(10);
    }
}
