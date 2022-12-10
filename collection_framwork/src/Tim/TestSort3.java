package Tim;
import java.util.ArrayList;
import java.util.Collections;

public class TestSort3 {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(101, "vijat", 23));
        al.add(new Student(106, "Ajay", 27));
        al.add(new Student(105, "jai", 21));
        Collections.sort(al);

        for (Student st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}
