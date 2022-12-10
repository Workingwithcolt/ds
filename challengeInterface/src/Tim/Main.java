package Tim;
import java.util.ArrayList;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Player tim = new Player("Tim",10,15);
        System.out.println("that is toString method"+tim.toString());
        tim.setHitPoints(5);
        tim.setStrength(4);
        tim.setName("chetan");
        System.out.println(tim);
    }
    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();
        Scanner s = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n"+
                "1 to enter String"+
                "2 to quit");
        while(!quit){
            System.out.println("Choose the option");
            int choice  = s.nextInt();
            s.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter the String");
                    String stringinput = s.nextLine();
                    values.add(index,stringinput);
                    index++;
                    break;
            }
        }
        return values;
    }
}
