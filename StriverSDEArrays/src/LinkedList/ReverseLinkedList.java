package LinkedList;


public class ReverseLinkedList {
    public static  LinkedListNode reverse(LinkedListNode head){
        LinkedListNode newhead = null;
        while(head != null){
            LinkedListNode next = head.next;
            head.next = newhead;
            newhead = head;
            head = next;
        }
        return newhead;
    }
}
