package Heap;

import java.util.*;

public class kMaxSumCombination {
    public static List<Integer>  kMaxSumCombination(ArrayList<Integer> a, ArrayList<Integer> b, int n, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(a);
        Collections.sort(b);
        List<Integer> l = new ArrayList<>();
        int target = 0;
        for(int i=1;i<100;i++){
            if(k<=i){
                target = i;
                break;
            }
        }//1 2 3 4
        for(int i=a.size()-1;(a.size())-target<=i;i--){
            for(int j=a.size()-1;(a.size())-target<=j;j--){
                p.add(a.get(i)+b.get(j));
            }
        }
        for (int i = k; i > 0; i--) {
            l.add(p.peek());
            p.poll();
        }
        return l;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};//1 3 5
        int[] b = {4,3,2,1};//2 4 6
//        System.out.println((kMaxSumCombination(a,b,a.length,4)));
    }
}
