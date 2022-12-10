package LinkedList;

public class Rotate {
    public static LinkedListNode Rotate(LinkedListNode head,int k){
        LinkedListNode temp = head;
        for(int i=0;i<k;i++){
            while (true){
                    if (temp.next.next != null) {
                        temp = temp.next;
                    }else{
                        break;
                    }
            }
            //before from the last node
            LinkedListNode end = temp.next;
            temp.next = null;
            end.next = head;
            end = head;
        }
        return head;
    }//it is workable but due to some problem it does not work in this pc
    public static LinkedListNode  OptimisedApproach(LinkedListNode head,int k){
        LinkedListNode curr = head;
        int len = 1;
        while(curr.next != null){
            curr = curr.next;
            len++;
        }//here we want to stop at the last node not the null
        curr.next= head;//here we connect the last node to the head
        k = (k>len)? k%len:len-k;//if the length is greater than k then len-k otherwise k%len
        LinkedListNode temp = head;
        while(k>-1){
            temp = temp.next;
            k--;
        }
        temp.next = null;
        head = curr.next;
        curr.next = null;
        return head;
    }//timecomplexity = o(n)


    public static void main(String[] args) {
        SinglyLinkedList h1 = new SinglyLinkedList();
        h1.InsertNode(1,Integer.MAX_VALUE);
        h1.InsertNode(2,Integer.MAX_VALUE);
        h1.InsertNode(3,Integer.MAX_VALUE);
        h1.InsertNode(43,Integer.MAX_VALUE);
        h1.InsertNode(4,Integer.MAX_VALUE);
        LinkedListNode head = Rotate(h1.head,2);
        h1.printLinkedList(head);
    }
}
