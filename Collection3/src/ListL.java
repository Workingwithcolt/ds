import java.util.*;

public class ListL {
    //    public static List<String> list =new ArrayList<>();
    public static List<String> list = new LinkedList<>();

    public static void main(String[] args) {
//        list.add("chetan");
//        list.add("manisha");
//        list.add("suresh");
//        list.add("shantabai");
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
//        for (String el:list) {
//            System.out.println(el);
//        }
//        Iterator<String> it = list.iterator();
//        for(int i=0;i<list.size();i++){
//            if(it.hasNext()){
//                System.out.println(it.next());
//            }
////        }
//        List<String> surname = new LinkedList<>();
//        list.add("chetan");
//        list.add("aishvarya");
//        list.add("manisha");
//        list.add("sakshi");
//        list.add("c");
//        surname.add("mohite");
//        surname.add("mohite");
//        surname.add("mohite");
//        surname.add("mohite");
//        surname.add("m");
//        for (int i=0;i< list.size();i++){
//            System.out.println(list.get(i)+" "+surname.get(i));
//        }
//    }
        List<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        System.out.println(s);
        System.out.println(s.get(0));
    }
}