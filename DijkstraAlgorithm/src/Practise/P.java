package Practise;
import java.util.Scanner;
public class P {
    private static Scanner s =new Scanner(System.in);

    public static void main(String[] args){
        int T;
        T = s.nextInt();
        while(T >0){
            float a,b;
            a = s.nextFloat();
            b =s.nextFloat();
            if(a>1000){
                System.out.println(a*b*0.9);
            }else{
                System.out.println(a*b);
            }
        }
    }
}
