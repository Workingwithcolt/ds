package TIM;

public class Main {
    public static void main(String[] args) {
        CircularDoubleLinkedlist CDLL = new CircularDoubleLinkedlist();
        CDLL.createCDLL(343);
        System.out.println(CDLL.head.value);
        CDLL.insertNode(100,0);
        System.out.println(CDLL.head.value);
        CDLL.Traversal();
        System.out.println();
        CDLL.Reverse();
    }

}
