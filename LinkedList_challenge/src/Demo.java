import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

    public class Demo {
        private Scanner s = new Scanner(System.in);
        public void main(String[] args){
            ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
            take(integerArrayList);
        }
        public void take(ArrayList<Integer> integerArrayList){
            for(int i=0;i<=5;i++){
                System.out.println("Enter the element:"+i);
                integerArrayList.add(s.nextInt());
            }
            printlist(integerArrayList);
        }

        public  void printlist(ArrayList<Integer> ArrayList){
            Iterator<Integer> i  = ArrayList.iterator();
            while(i.hasNext()){
                System.out.println("Now to visiting "+i.next());
            }
            System.out.println("\n");
        }
    }
