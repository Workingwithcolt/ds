package Tim;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Spaceship{
    String[] Array = new String[5];
    int[] arr = new int[5];
    public boolean type(int sum,int divide){
        if(sum % divide == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Spaceship o = new Spaceship();
        Scanner s = new Scanner(System.in);
        for(int i=0;i<5;i++) {
            o.arr[i] = s.nextInt();
        }
        for(int i=0;i<5;i++){
            for(int j=i+1;j<4;j++){
                int sum = o.arr[i]+o.arr[j];
                boolean value = o.type(sum, 5);
                if(value == true){
                    o.Array[i] = "("+o.arr[i]+","+o.arr[j]+")";
                }
                }
            }
        for(int i=0;i< o.Array.length;i++){
            System.out.println(o.Array[i]);
        }
    }
}
