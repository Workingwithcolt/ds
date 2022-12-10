package LinkedList;

public class SinglyLinkedList {
    public  LinkedListNode head = null;
    public  LinkedListNode tail = null;
    static int size = 0;
    public  LinkedListNode CreateSinglyLinkedList(int value){
        LinkedListNode node = new LinkedListNode();
        node.value = value;
        head = node;
        tail = node;
        node.next =null;
        size = 1;
        return head;
    }
    public  void InsertNode(int value,int location){
        if(head == null){
            CreateSinglyLinkedList(value);
        }else{
            LinkedListNode node  =new LinkedListNode();
            if(location == 0){
                node.value = value;
                node.next = head;
                head = node;
            }else if(location >= size){
                node.value = value;
                tail.next = node;
                node.next =null;
                tail =node;
            }else{
                LinkedListNode temp = head;
                int index = 0;
                while(index<location-1 && temp.next != null){
                    temp = temp.next;
                }
                node.value = value;
                node.next = temp.next;
                temp.next = node;
            }
        }
        size++;
    }
    public  void printLinkedList(LinkedListNode head){
        LinkedListNode temp = head;
        while(temp.next != null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.print(temp.value);
    }

    public static void MiddleElement(LinkedListNode head,int size){
        LinkedListNode temp = head;
        for(int i=0;i<(size/2);i++){
            temp = temp.next;
        }
        System.out.println(temp.next.value);
    }

    public static void main(String[] args) {
        SinglyLinkedList h1 = new SinglyLinkedList();
        h1.InsertNode(1,Integer.MAX_VALUE);
        h1.InsertNode(2,Integer.MAX_VALUE);
        h1.InsertNode(3,Integer.MAX_VALUE);
        h1.InsertNode(43,Integer.MAX_VALUE);
        h1.InsertNode(4,Integer.MAX_VALUE);
        System.out.println(h1.head.value);
        h1.printLinkedList(h1.head);

//        head = reverse(head);
//        System.out.println();
//        printLinkedList(head);
//        int count = 0;
//        LinkedList.LinkedListNode temp = head;
//        while(temp != null){
//            temp = temp.next;
//            count++;
//        }
//        temp = head;
//        for(int i=0;i<(count/2)+1;i++){
//           temp = temp.next ;
//        }
//        System.out.println(temp.value);
    }

}
