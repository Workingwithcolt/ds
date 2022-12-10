import java.lang.reflect.Array;
import java.util.*;

public class RateOut {
//    static boolean isSafe(int[][] arr,int x,int y,int n){
//        if(x <  n && y<n && arr[x][y] == 1){
//            return true;
//        }else{
//            return false;
//        }
//    }
//    static boolean rateinMaze(int[][] arr,int x,int y,int n,int[][] solArr){
//        if(x == n-1 && y == n-1){
//            solArr[x][y] = 1;
//            return true;
//        }
//        if(isSafe(arr,x,y,n)){
//            solArr[x][y] = 1;
//            if(rateinMaze(arr,x+1,y,n,solArr)){//to move the right direction
//                return true;
//            }
//            if(rateinMaze(arr,x,y+1,n,solArr)){//to move the downward
//                return true;
//            }
//            solArr[x][y] = 0;//Backtracking here we intantiate the position by setting it the
//            //the zero
//            return false;
//        }
//        return false;
//    }
//    public static void main(String [] args){
//        int n;
//        n = 5;
//        int[][] solarr ={
//                {1,0,1,0,1},
//                {1,1,1,1,1},
//                {0,1,0,1,0},
//                {1,0,0,1,1},
//                {1,1,1,0,1}};
//        int[][] arr = {{0,0,0,0,0},
//                {0,0,0,0,0},
//                {0,0,0,0,0},
//                {0,0,0,0,0},
//                {0,0,0,0,0}};
//        rateinMaze(solarr,0,0,n,arr);
//        for (int[] el:arr) {
//            for (int e:el) {
//                System.out.print(e+" ");
//            }
//            System.out.println();
//        }
//    }

//public static void subsequence(int[] a,ArrayList<ArrayList<Integer>> arrayList){
//   arrayList.add(new ArrayList<Integer>());
//   for(int el:a){
//       int n = arrayList.size();
//       for(int i=0;i<n;i++){
//           ArrayList<Integer> r = new ArrayList(arrayList.get(i));
//           r.add(el);
//           arrayList.add(r);
//       }
//   }
//}
//
//    public static int stringsub(int ind, int[] arr, String formed, Map<String, Integer> map) {
//        if (map.containsKey(formed)) {
//            System.out.println("it is executed");
//            return map.get(formed);
//        }
//        if (ind > arr.length - 1) {
//            if (formed.length() > 0) {
//                long g1 = Long.parseLong(formed);
//                if (g1 > 0) {
//                    if (g1 % 7 == 0) {
//                        return 1;
//                    }
//                }
//            }
//            return 0;
//        }
//        int sum2 = stringsub(ind + 1, arr, formed, map);
//        int sum1 = stringsub(ind + 1, arr, formed.concat(String.valueOf(arr[ind])), map);
//             map.put(formed, sum1 + sum2);
//             return sum1+sum2;
//    }
//
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int[] arr = {1,2,3,4,5,2,3,4,5};
//   String r ="";
//   ArrayList<String> a = new ArrayList<>();
//   Map<String,Integer> map  = new Hashtable<>();
//    stringsub(0,arr,r,map);
//        int count = 0;
//        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
//        subsequence(arr, arrayList);
//        for (ArrayList<Integer> el : arrayList) {
//            int k = 0;
//            for (Integer e : el) {
//                k = 10 * k + e;
//            }
//            if (k % 7 == 0) {
//                count++;
//            }
//        }
//        System.out.println(count);


//
//    public static  int printF(int ind, Stack<Integer> ds, int arr[], int n){
//        if(ind == n){
//            int k = 0;
//            for(Integer e:ds) {
//                k = 10 * k + e;
//            }
//            System.out.println(k);
//            if(k>0 && k%7 == 0){
//                return 1;
//            }
//            System.out.println();
//            return 0;
//        }
//        ds.push(arr[ind]);
//        int sum1 = printF(ind+1,ds,arr,n);
//        ds.remove(ds.peek());
//        int sum2 = printF(ind+1,ds,arr,n);
//        return sum2+sum1;
//    }
//public static void main(String[] args){
//    int[] arr  = {1,2,3};
//    Stack<Integer> q = new Stack<>();
//    System.out.println(printF(0,q,arr,arr.length));
//}
//}


//while(tt>0){
//        int n = 4;
//        int[] arr  = new int[34];
//        for(int i=0;i<n;i++){
//        int a,j = 0;
//        a = s.nextInt();
//        while(a>0){
//        if(arr[j] ==0){
//        arr[j] = a%2;
//        }
//        a = a/2;
//        j++;
//        }
//        }
//        int ans  = 0;
//        for(int i=0;i<34;i++){
//        ans += arr[i];
//        }
//        System.out.println(ans);
//        tt--;
//        }

    public static void main(String[] args){
        System.out.println(1%7);
        System.out.println(2%7);
        System.out.println(3%7);
        System.out.println(4%7);
        System.out.println(5%7);
        System.out.println(6%7);
        System.out.println(7%7);
    }
}