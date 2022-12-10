import java.util.HashMap;
import java.util.Map;

public class RomannumbertoInteger {
    public static  Map<Character ,Integer> map = new HashMap<>();
    public RomannumbertoInteger(Character el,int value){
        this.map.put(el,value);
    }
    public static void fill(){
        new RomannumbertoInteger('I',1);
        new RomannumbertoInteger('V',5);
        new RomannumbertoInteger('X',10);
        new RomannumbertoInteger('L',50);
        new RomannumbertoInteger('C',100);
        new RomannumbertoInteger('D',500);
        new RomannumbertoInteger('M',1000);
    }
    public static int ConvertRoman(String word){
        fill();
        int total = 0;
        int value2 = map.get(word.charAt((word.length()-2)+1));// last
        System.out.println(value2);
        for(int i = word.length()-2;i>=0;i--){
            int value1 = map.get(word.charAt(i));//secondlast
            System.out.println(value1);
            if(value2 >=value1){
                total += (value2-value1);
            }else{
                total += (value1+value2);
                System.out.println("else total"+total);
            }
            value2 = total;
            total =0;
        }
        return value2;
    }

    public static void main(String[] args) {
        System.out.println(ConvertRoman("XL"));
    }
}
