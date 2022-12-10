package LinkedList;


public class middleElement {
    public static void TotosAlgorithm(LinkedListNode head){
        LinkedListNode temp = head;
        LinkedListNode first= head,second =head;
        while(second != null && second.next  != null){
            first  = first.next;
            second = second.next.next;
        }
        System.out.println(first.value);
    }

    public static void main(String[] args) {
        SinglyLinkedList h = new SinglyLinkedList();
        h.InsertNode(1,Integer.MAX_VALUE);
        h.InsertNode(2,Integer.MAX_VALUE);
        h.InsertNode(3,Integer.MAX_VALUE);
        h.InsertNode(43,Integer.MAX_VALUE);
        h.InsertNode(4,Integer.MAX_VALUE);
        LinkedListNode temp = h.head;
        TotosAlgorithm(temp);

    }
}
