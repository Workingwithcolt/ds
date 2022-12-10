package LinkedList;

import java.util.HashMap;

public class StartingPointOfLinkedList {
    public static void StartingPoingCycle(LinkedListNode head) {
        LinkedListNode temp = head;
        LinkedListNode prev;
        HashMap<LinkedListNode, Integer> map = new HashMap<>();
        while (true) {
            if (temp == null) {
                break;
            }
            if (!map.containsKey(temp)) {
                map.put(temp, temp.value);
                prev = temp;
            } else {
                break;
            }
            temp = temp.next;
        }
        if (temp != null) {
            System.out.println(temp.value);
            return;
        } else {
            System.out.println("There is not any cycle");
        }
    }
        public static LinkedListNode OptimiseALGORITHM (LinkedListNode head){
            LinkedListNode slow, fast;
            slow = head;
            fast = head;
            boolean istrue = false;
            while (true) {
                if (fast.next == null || fast.next.next == null || fast == null) {
                    break;
                }
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    istrue = true;
                    break;
                }
            }
            LinkedListNode entry = head;
            while (istrue) {
                if (slow == entry) {
                    return slow;
                }
                slow = slow.next;
                entry = entry.next;
            }
            return  null;
        }


    public static void main(String[] args) {
        SinglyLinkedList h1 =new SinglyLinkedList();
        h1.InsertNode(1,Integer.MAX_VALUE);
        h1.InsertNode(3,Integer.MAX_VALUE);
        h1.InsertNode(5,Integer.MAX_VALUE);
        h1.InsertNode(6,Integer.MAX_VALUE);
        h1.tail.next = h1.head.next;
        LinkedListNode j1 = OptimiseALGORITHM(h1.head);
        System.out.println((j1 != null) ? j1.value : "null" );
    }
}
