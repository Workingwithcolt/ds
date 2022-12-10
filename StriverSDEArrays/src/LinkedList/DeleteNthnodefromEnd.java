package LinkedList;

public class DeleteNthnodefromEnd {
    public static LinkedListNode DeleteNth(LinkedListNode head,int deleteindex){//1Approach
        int counter = 0;
        LinkedListNode temp = head;
        while (temp != null){
            temp = temp.next;
            counter++;
        }
        int index = counter-deleteindex;
        int i = 1;
        temp = head;
        while(i<=index){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return temp;
    }

    public static LinkedListNode OptimiseApproach(LinkedListNode head,int n){
        LinkedListNode  first =new LinkedListNode();
        first = head;
        LinkedListNode second = new LinkedListNode();
        second = head;
//        int i=0;
//        while(i<=n){
//           first = first.next;
//           i++;
//        }
        int counter =0;
        boolean istrue = false;
        while(true){
            if(istrue && first != null) {
                first = first.next;
                second = second.next;
            }
            if(first.next == null){
                break;
            }
            if(counter <= n){
                first = first.next;
                counter++;
            }else{
                istrue = true;
            }

        }
        second.next= second.next.next;
        return head;
    }

    public static void main(String[] args) {
        SinglyLinkedList h1 =new SinglyLinkedList();
        h1.InsertNode(1,Integer.MAX_VALUE);
        h1.InsertNode(3,Integer.MAX_VALUE);
        h1.InsertNode(5,Integer.MAX_VALUE);
        h1.InsertNode(6,Integer.MAX_VALUE);
//        DeleteNth(h1.head,2);
        OptimiseApproach(h1.head,2);
        h1.printLinkedList(h1.head);
    }
}
