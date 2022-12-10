package Problem;

import jdk.jfr.Frequency;

import java.util.*;

public class Problem1 {
//    Given Arrival and Departure time of all trains
//    find minimum number of platform for railway station so no train is kept waiting
//    arrival and departure time cant be same for the same train but it is same for another train
//    arrival and departure of one train is not possible that means that train does not have the same value
//    the two train does not arriva or departure at the same time at the same platform
//    public void GetMinimumPlatform(int[] arr,int[] dist){
//    //    [0900,0940,0950,1100,1500,1800]
////        [0910,1200,1120,1130,1900,2000]
//        ArrayList<Element> elements= new ArrayList<>();
//}
//910(0) 1120(2) 1130(3) 1200(1) 1900(4) 2000(5)
//09100,12001,11202,11303,19004,20005

    //9100 11202 11303 12001 19004 20005
    public void Platform(int[] arr, int[] end) {
        for (int i = 0; i < arr.length; i++) {
            String convert = String.valueOf(arr[i]);
            int v = Integer.parseInt(convert.concat(String.valueOf(i)));
            System.out.println(v % 10);
        }
        String s = String.valueOf(arr[0]);
        int lastvalue = Integer.parseInt(s.substring(s.length() - 2, s.length() - 1));//index
        int firstcomparater = Integer.parseInt(s.substring(0, s.length() - 2));//910
        arr[0] = Integer.MIN_VALUE;
        int i = 1;
        boolean istrue = true;
        int counter = 0;
        int negativecounter = 0;
        int holder = firstcomparater;
        while (istrue) {
            for (i = 1; i < arr.length; i++) {
                if (arr[i] != Integer.MIN_VALUE) {
                    s = String.valueOf(arr[i]);
                    lastvalue = Integer.parseInt(s.substring(s.length() - 2, s.length() - 1));//index
                    firstcomparater = Integer.parseInt(s.substring(0, s.length() - 1));
                    if (holder < end[lastvalue]) {
                        arr[i] = Integer.MIN_VALUE;
                    }
                    holder = firstcomparater;
                } else if (arr[i] == Integer.MIN_VALUE) {
                    negativecounter += 1;
                }
                if (negativecounter == arr.length - 1) {
                    counter += 1;
                    istrue = false;

                }
            }
            negativecounter = 0;
            i = 0;
            counter += 1;
        }
        System.out.println("counter" + counter);
    }
//    [0900,0940,0950,1100,1500,1800]
//   [0910,1200,1120,1130,1900,2000]

//    [0900,0950,1100,940,1500,1800]arr
//    [0910,1120,1130,1200,1900,2000]dist

    //  [0900,0950,1100,940,1500,1800]arr
//      [0910,1120,1130,1200,1900,2000]dist

    //1100,940,1800
    //1130,1200,20000
//    900 - 910
//    940 - 1200 1
//    950 - 1120 2
//    1100 - 1130 3
//    1500 - 1900
//    1800 - 2000
//    A
//    900 - 910
//    950 - 1120
//    1500- 1900
//  B
//940 - 1200
//1800 - 2000
//    C
//    1100 - 1130

//    0900,1100,1235
//    1000,1200,1240
//    900- 1000
//    1100- 1200
//    1235 - 1240


    public Map<Integer, Integer> Langauge(int[] Frequ, int[] keysize) {
        Map<Integer, Integer> map = new HashMap<>();
        int temp = 0;
        int j = 1;
        int counter = 0;
        Frequ[counter] = -Frequ[counter];
        int sum = 0;
        int counterforeach = 1;
        sum += (counterforeach * Math.abs(Frequ[temp]));//-7 4 3 -1
        for (int i = 0; i < keysize.length; i++) {
            while (j < Frequ.length) {
                if (Frequ[j] > 0) {
                    if (Math.abs(Frequ[temp]) > Frequ[j]) {
                        temp = j;
                    }
                }
                j++;
            }
            counterforeach++;
            Frequ[temp] = -Frequ[temp];
            sum += (counterforeach * Math.abs(Frequ[temp]));
            j = 0;
            map.put(counter, sum);
            sum = 0;
            if (counterforeach == keysize[i]) {
                counterforeach = 1;
            }
            counter += 1;
            sum += (counterforeach * Math.abs(Frequ[counter]));
            temp = counter;
        }
        return map;
    }

    public static void main(String[] args) {
//        Problem1 p = new Problem1();
        Scanner s = new Scanner(System.in);
        int temp = Integer.MAX_VALUE;
        int T = s.nextInt();
        int N,k;
        for(int i=0;i<T;i++) {
             N = s.nextInt();//that is the length of the array
             k = s.nextInt();//that is teh adding the element to the minimum element to get it to maximize
            for(int j=0;j<N;j++){
                int value = s.nextInt();
                if(temp > value){
                    temp = value;
                }
            }
            temp = temp+k;
            System.out.println(temp);
            temp  = Integer.MIN_VALUE;
        }

//        int N = s.nextInt();
//        int[] Freq = new int[N];
//        for (int i = 0; i < N; i++) {
//            Freq[i] = s.nextInt();
//        }
//        int M = s.nextInt();
//        int[] keySize = new int[M];
//        for (int i = 0; i < M; i++) {
//            keySize[i] = s.nextInt();
//        }
//        int sum = 0;
//        Map<Integer, Integer> ma = p.Langauge(Freq, keySize);
//        for (int el : ma.values()) {
//            sum += el;
//        }
    }
//
//    chef has
//    a N
//    questions each
//    question has 3marks for
//    correct and -1 for incorrect
//    chef got
//    X question for
//    passing the
//    chef he
//    must got
//    at least
//    p marks

    //            5 2 3
//            5-2 = 3
//            2*3 = 6 = 3
    //5 2 4
    //2*3 = 6
    //5-2= 3
    //6-3 = 3
    //
    public void PassorFail(int[] arr) {
        int Q = arr[0];
        int X = arr[1];
        int p = arr[2];
        int totalMarkGot = X*3;
        int realMark =Q-X;
        realMark = totalMarkGot-realMark;
        if(realMark <= p) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
}







