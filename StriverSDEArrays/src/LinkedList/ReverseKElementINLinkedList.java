package LinkedList;public class ReverseKElementINLinkedList {
    public static int lengthofLinkedList(LinkedListNode head){
        int length =0;
        while(head != null){
            length++;
            head = head.next;
        }
        return length;
    }
    public static LinkedListNode  Reverse(LinkedListNode head,int k) {
        if (head == null || head.next == null) return head;
        int length = lengthofLinkedList(head);
        LinkedListNode dummyhead = new LinkedListNode();
        dummyhead.next = head;
        LinkedListNode pre = dummyhead;
        LinkedListNode curr, nex;
        while (length >= k) {
            curr = pre.next;
            nex = curr.next;
            for (int i=1;i<k;i++){
                curr.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = curr.next;
            }
            pre = curr;
            length = length-k;
        }
        return dummyhead;
    }
}
