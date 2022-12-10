public class Main {
    public static void main(String[] args) {
        DoublyLinkedList DLL =new DoublyLinkedList();
        DLL.createDLL(34);
        System.out.println(DLL.head.value);
        DLL.insertDLL(11,1);
        DLL.insertDLL(32,2);
        DLL.insertDLL(35,3);
        System.out.println(DLL.head.next.value);
        DLL.TraversalDLL();
        System.out.println();
        DLL.reverseTraversal();
        DLL.searchNode(32);
        DLL.deleteNodeDLL(0);
        DLL.TraversalDLL();
        DLL.deleteNodeDLL(3);
        DLL.TraversalDLL();
        DLL.deleteEntire();
        DLL.TraversalDLL();

    }
}
