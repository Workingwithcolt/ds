import java.util.Objects;

public class Student implements Comparable<Student>{
    public String name;
    public int rollnumber;
    public Student(String name,int rollnumber){
        this.name =name;
        this.rollnumber = rollnumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollnumber=" + rollnumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollnumber == student.rollnumber && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollnumber);
    }
//
//    @Override
//    public int compareTo(Student that) {
//        return this.rollnumber - that.rollnumber;//here the int is the primitive class there it does not
    //implement the code of comparator therefore we write that
//    }

    @Override
    public int compareTo(Student that) {
        return this.name.compareTo(that.name);//here String class was already implemented the method compareto
        //there we here just call it
    }
}
