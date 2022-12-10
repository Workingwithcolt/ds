package TIM;

public class Main  {
    public static void main(String[] args){
        SingleLiknkedList sLL = new SingleLiknkedList();
        sLL.CreateLinkList(5);
//        System.out.println(sLL.head.value);
        sLL.insertInLinkedList(6,1);
        sLL.insertInLinkedList(7,2);
        sLL.insertInLinkedList(12,3);
        sLL.insertInLinkedList(23,0);
        sLL.searchNode(23);
        sLL.traversalSinglyLinkedList();//it wil return the current head
        sLL.deleteSLL();
        sLL.traversalSinglyLinkedList();
    }
}
