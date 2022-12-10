package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MejorityNby3 {
    public static void mejority(int[] arr){
        int c1 = 0;
        int c2 = 0;
        int num1 =-1,num2 = -1;
        for (int el:arr) {
            if(el == num1){
                c1++;
            }else if(el == num2){
                c2++;
            }else if(c1 == 0){
                num1 = el;
                c1 = 1;
            }else if(c2 == 0){
                num2 = el;
                c2 = 1;
            }else{
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        List<Integer> list= new ArrayList<>();
        for (int e:arr) {
            if(e == num1){
                c1++;
            }else if(e  == num2){
                c2++;
            }
        }
        if(c1>arr.length/3){
            System.out.println(num1);
        }
        if(c2>arr.length/3){
            System.out.println(num2);
        }
    }
}
