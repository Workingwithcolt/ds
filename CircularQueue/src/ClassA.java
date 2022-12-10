public class ClassA {
    int i;
}
class B extends ClassA{
    int j;
    void display(){
        super.i = j-2;
        System.out.println(i  );
    }
}
class inheritance{
    public static void main(String[] args) {
        B o = new B();
        o.i = 1;
        o.j = 2;
        o.display();
    }
}
