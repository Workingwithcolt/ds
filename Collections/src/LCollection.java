import jdk.javadoc.doclet.StandardDoclet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LCollection {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
//        list.add(134);
//        list.add(12);
//        list.add(3);
//        System.out.println("min element "+ Collections.min(list));
//        System.out.println("max element"+Collections.max(list));
//        System.out.println(Collections.frequency(list,3));
//        Collections.sort(list, Comparator.reverseOrder());
//        System.out.println(list);
        list.add(new Student("Chetan",1));
        list.add(new Student("Sakshi",2));
        list.add(new Student("Shivam",3));
        list.add(new Student("Rohit",4));
        Student s1 = new Student("s",21);
        Student s2 = new Student("d",22);
        System.out.println(s1.compareTo(s2));
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });//here why we implement the comparator beacause we want sort the data on the
        //basis of name or rollnumber
        //if we sort the data according to the rollnumber but it does not give the right result
        //that time it will automatically sort or dynamically sort on the basis of name for that we will use the
        //comparator
    }
}
