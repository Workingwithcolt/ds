import java.util.Random;
import java.util.Scanner;

public class j {
    public static int gcd (int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd (b, a % b);
    }
    public static void main(String[] args)
    {
            Scanner s  = new Scanner(System.in);
            Double d = s.nextDouble();
            int t = d.intValue();
            int tt = s.nextInt();
            for(int i=0;i<tt;i++){
                int start= 0;
                System.out.println("it is the numer");
                int end = 0;
                int sum =  Integer.MAX_VALUE;
                int less = Integer.MAX_VALUE;
                int X = s.nextInt();
                int Y = s.nextInt();
                for(int j=X;j<Y-1;j++){
                    for(int m = j+1;m<=Y;m++){
                        System.out.println("it is executng");
                        int temp = gcd(j,m);
                        if(temp>1){
                            if(sum>(m+j)){
                                if(temp<less){
                                    less = temp;
                                    start =j;
                                    end = m;
                                    sum = m+j;
                                }
                            }
                        }
                    }
                }
                if(less == Integer.MAX_VALUE){
                    System.out.println("-1");
                }else{
                    System.out.println(start+" "+end);
                }
            }
        }
    }