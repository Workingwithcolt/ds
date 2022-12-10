public class Main {
    public static void main(String[] args) {
        CircularLinkedLISt CSLL = new CircularLinkedLISt();
        CSLL.createCSLL(1);
        System.out.println("That is the first node");
        System.out.println(CSLL.head.value);
        System.out.println("That is first node which points to the first node circular ");
        System.out.println(CSLL.head.next.next.value);
        CSLL.InsertCSLL(2,1);
        CSLL.InsertCSLL(3,2);
        CSLL.InsertCSLL(344,3);
        CSLL.traversalCSLL();
        System.out.println();
        CSLL.DeleteNoode(2);
        CSLL.traversalCSLL();
        CSLL.deleteCSLL();
    }
}
