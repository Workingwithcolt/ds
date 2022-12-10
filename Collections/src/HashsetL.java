import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashsetL {
    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<>();
//        set.add(34);
//        set.add(34);
//        set.add(1);
//        set.add(5);//it dont store the element as it is it store in random order
//        System.out.println(set);
////
//        Set<Integer> set = new LinkedHashSet<>();
//        set.add(34);
//        set.add(1);//it store the element as it is
//        set.add(5);
//        set.add(5);
//        System.out.println(set);
//        set.remove(1);
////        System.out.println(set);
//        Set<Integer> set = new TreeSet<>();//this implements the binary tree that mean all element we will insert
//        //that will take a position in sorted manner
//        set.add(3);
//        set.add(5);
//        set.add(1);
//        set.add(53);
//        set.add(34);
//        System.out.println(set);
        Set<Student> set = new HashSet<>();
        set.add(new Student("Chetan",2));
        set.add(new Student("Manish",3));
        set.add(new Student("Sakshi",5));
        set.add(new Student("Sakshi",5));
        System.out.println(set);
    }
}
