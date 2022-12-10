import java.util.*;

public class HashMapL {
    public static void main(String[] args) {
//        Map<String,Integer> number = new HashMap<>();
//        number.put("one",1);
//        number.put("two",2);
//        number.put("third",3);
//        number.put("four",4);
//        number.put("four",5);
//        System.out.println(number);
//        for(Map.Entry<String,Integer> e:number.entrySet()){
//            System.out.println(e);
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }
//        for(String key: number.keySet()){
//            System.out.println(key);
//        }
//        for(Integer valye:number.values()){
//            System.out.println(value);
//        }

        Map<String,Integer> number = new TreeMap<>();
        number.put("one",1);
        number.put("two",2);
        number.put("third",3);
        number.put("four",4);
        number.put("four",5);
        System.out.println(number);
        for(Map.Entry<String,Integer> e:number.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        for(String key: number.keySet()){
            System.out.println(key);
        }
        for(Integer value:number.values()){
            System.out.println(value);
        }
    }
}
