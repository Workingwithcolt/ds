import java.util.ArrayList;
import java.util.Scanner;

public class practise {
    private static ArrayList<String> myarray = new ArrayList<String>();
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        for(int i=0;i<2;i++) {
            System.out.println("Enter the name :");
            myarray.add(s.nextLine());
        }
        for(int i=0;i<myarray.size();i++) {
            System.out.println(myarray.get(i));
        }

    }
}
