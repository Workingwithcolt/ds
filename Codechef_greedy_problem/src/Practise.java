import java.util.Scanner;

//import java.util.Stack;
//
//public class Practise {
//    public static void main(String[] args){
//        int counter = 0;
//        int i=0;
//        int[] arr = {1,0,1,1,0};
//        Stack<Integer> stack = new Stack<>();
//        for(int j=0;j<arr.length;j++) {
//            for (i = 0; i < arr.length; i++) {
//                if (arr[i] == 1 && arr[i + 1] == 1 && i < arr.length - 2) {
//                    stack.push(i);
//                    if (i != arr.length - 2) {
//                        i += 2;
//                    } else {
//                        continue;
//                    }
//                } else if (arr[i] == 1 && arr[i + 1] == 0) {
//                    stack.push(i);
//                    i += 1;
//                } else if (arr[i] == 0) {
//                    i++;
//                }
//
//            }
//            int length = stack.size();
//            for (int k = 0;k<length;k++){
//                int index = stack.pop();
//                arr[index] = 0;
//                length = stack.size();
//            }
//            counter++;
//            i =0;
//            for(int i=0;i<)
//        }
//    }
//}
public class Practise{
    public static int gcd (int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd (b, a % b);
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s  = new Scanner(System.in);
        int tt = s.nextInt();
        for(int i=0;i<tt;i++){
            int start= 0;
            int end = 0;
            boolean istrue = false;;
            int sum =  Integer.MAX_VALUE;
            int less = Integer.MAX_VALUE;
            int X = s.nextInt();
            int Y = s.nextInt();
            //(X+Y)/2
            if(((X+Y)/2) > (X+(X+1))) {
                for (int j = X; j < Y - 1; j++) {
                    System.out.println("the outer loop is executed");
                    for (int m = j + 1; m <= Y; m++) {
                        if ((j + m) == (X + Y) / 2) {
                            System.out.println("The inner looop is executed");
                            int temp = gcd(j, m);
                            if (temp > 1) {
                                if (sum > (m + j)) {
                                    if (temp < less) {
                                        less = temp;
                                        start = j;
                                        end = m;
                                        sum = m + j;
                                        istrue = true;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    if (istrue) {
                        break;
                    }
                }
                if (less == Integer.MAX_VALUE) {
                    System.out.println("-1");
                } else {
                    System.out.println(start + " " + end);
                }
            }else{
                System.out.println("-1");
            }
        }

    }
}