package LinkedList;
public class SumOfTwoLinkedListasNumber {
    public static LinkedListNode addTwoNumbers(LinkedListNode l1,LinkedListNode l2){
        LinkedListNode head = new LinkedListNode();
        LinkedListNode temp = head;
        int carry =0;
        while(l1 != null || l2 != null || carry == 1){
            int sum = 0;
            if(l1 != null) {
                sum += l1.value;
                l1 =l1.next;
            }
            if(l2 != null) {
                sum += l2.value;
                l2 = l2.next;
            }
            sum+=carry;
            carry = sum/10;
            LinkedListNode node =new LinkedListNode();
            node.value = sum%10;
            temp.next = node;
            temp= temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        SinglyLinkedList h = new SinglyLinkedList();
        h.InsertNode(1,Integer.MAX_VALUE);
        h.InsertNode(2,Integer.MAX_VALUE);
        h.InsertNode(3,Integer.MAX_VALUE);
        h.InsertNode(4,Integer.MAX_VALUE);
        h.InsertNode(4,Integer.MAX_VALUE);
        SinglyLinkedList h1 =new SinglyLinkedList();
        h1.InsertNode(1,Integer.MAX_VALUE);
        h1.InsertNode(3,Integer.MAX_VALUE);
        h1.InsertNode(5,Integer.MAX_VALUE);
        h1.InsertNode(6,Integer.MAX_VALUE);
        LinkedListNode head = addTwoNumbers(h.head,h1.head);
        h.printLinkedList(head);
    }
}
