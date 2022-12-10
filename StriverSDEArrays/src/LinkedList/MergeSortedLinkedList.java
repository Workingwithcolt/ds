package LinkedList;

public class MergeSortedLinkedList {
    public static LinkedListNode Merge(LinkedListNode h1,LinkedListNode h2){
        LinkedListNode head = null;
        LinkedListNode tail = null;
        if(h1.value < h2.value){
             head = h1;
             LinkedListNode node = new LinkedListNode();
             node.value = h1.value;
             head = node;
             tail = node;
             node.next = null;
             h1 = h1.next;
        }else{
            head.value = h2.value;
            LinkedListNode node = new LinkedListNode();
            node.value = h2.value;
            head = node;
            tail = node;
            node.next = null;
            h2 = h2.next;
        }
        int counter = 0;
        try {
            while (h1 != null || h1.next != null || h2.next != null || h2 != null) {
                counter++;
                if (h1.value < h2.value) {
                    LinkedListNode node = new LinkedListNode();
                    node.value = h1.value;
                    tail.next = node;
                    tail = node;
                    tail.next = null;
                    h1 = h1.next;
                } else {
                    LinkedListNode node = new LinkedListNode();
                    node.value = h2.value;
                    tail.next = node;
                    tail = node;
                    tail.next = null;
                    h2 = h2.next;
                }

            }
        }catch (NullPointerException e){
            System.out.println("df");
        }
            while (true) {
                if(h1 == null ){
                    break;
                }
                LinkedListNode node = new LinkedListNode();
                node.value = h1.value;
                tail.next = node;
                tail = node;
                tail.next= null;
                h1 = h1.next;
            }
            while (true) {
                if(h2 == null ){
                    break;
                }
                LinkedListNode node = new LinkedListNode();
                node.value = h2.value;
                tail.next = node;
                tail =node;
                tail.next = null;
                h2 = h2.next;
            }

        return head;
    }
    public static LinkedListNode InplaceAlgorithm(LinkedListNode h1,LinkedListNode h2){
        if(h1 == null){
            return h2;
        }
        if(h2 == null){
            return h1;
        }
        if(h1.value > h2.value){
            LinkedListNode temp = h2;
            h2 = h1;
            h1 = temp;
        }
        LinkedListNode res = h1;
        while(h1 != null && h2 != null){
            LinkedListNode tmp = null;
            while(h1 != null && h1.value <= h2.value){
                tmp = h1;
                h1 = h1.next;
            }
            tmp.next = h2;
            LinkedListNode temp =h1;
            h1 = h2;
            h2 = temp;
        }
        return res;

    }

    public static void main(String[] args) {
        SinglyLinkedList h1 =new SinglyLinkedList();
        h1.InsertNode(1,Integer.MAX_VALUE);
        h1.InsertNode(3,Integer.MAX_VALUE);
        h1.InsertNode(5,Integer.MAX_VALUE);
        h1.InsertNode(6,Integer.MAX_VALUE);
        SinglyLinkedList h2 =new SinglyLinkedList();
        h2.InsertNode(2,Integer.MAX_VALUE);
        h2.InsertNode(7,Integer.MAX_VALUE);
        h2.InsertNode(8,Integer.MAX_VALUE);
        h2.InsertNode(9,Integer.MAX_VALUE);
        LinkedListNode f = InplaceAlgorithm(h1.head,h2.head);
        h1.printLinkedList(f);

}
}
