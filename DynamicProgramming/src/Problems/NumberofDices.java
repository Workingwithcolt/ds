//package Problems;
//import java.util.*;
//public class NumberofDices {
//    Map<Integer,Integer> counter = new HashMap<Integer,Integer>();
//    public void Toss(int n,int parent) {
//        if (n == 1) {
//            if(Math.abs(parent - n) >0) {
//                Toss(Math.abs(parent - n), n);
//            }else{
//                return
//            }
//        } else {
//            for (int i = 1; i <= n; i++) {
//                Toss(i, n);
//            }
//        }
//    }
//
//    }
