import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistLearn {
    public static void main(String[] args) {
       List<Integer> number = new ArrayList<>();
       number.add(1);
       number.add(2);
       number.add(3);
       number.add(4);
       number.add(5);
       List<Integer> digit = new ArrayList<>();
       digit.add(1);
       digit.add(34);
       number.addAll(digit);
       for(int i=0;i<number.size();i++){
           System.out.println("The number is"+number.get(i));
       }
       for(Integer element:number){
           System.out.println("foreach the number is "+element);
       }
        Iterator<Integer> it = number.iterator();
       while(it.hasNext()){
           System.out.println("iterator"+it.next());//next it is used to access the next element
       }
    }
}
