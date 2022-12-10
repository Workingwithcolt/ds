package TIM;

public class SingleLiknkedList {
    public Node head;
    public Node tail;
    int size = 1;
public Node CreateLinkList(int value) {
        head = new Node();
        Node Node = new Node();//O(n) complexity space and time complexity
        Node.next = null;
        Node.value = value;
        head = Node;
        tail = Node;
        return head;
    }
    public void insertInLinkedList(int nodeValue,int location){
    Node node = new Node();
    node.value = nodeValue;
    if(head == null){
        CreateLinkList(nodeValue);
        return;
    }else if(location == 0){
        //make the head address to the new node to be isert
        //before that address which is to be store in the head  that is assign to the new node next
        node.next = head;//the node of address which is to be stroed in the head is to be stored in the node by a
        //assigning this to the node>next
        head = node;//make the node to the head
    }else if(location >= size){
        //first we have to make the last node to the new node by assigning to the null
        //make the new node to tail
        node.next = null;
        tail.next = node;
        tail = node;
    }else{
        //we have to insett the given node at the particualr position which is given
        //
        int index = 0;
        while(index<location-1){
            head = head.next;
            index++;
        }
        Node nextnode = head.next;//here we make the relation between the nextnode and the next of head
        head.next = nextnode;//here we just assign the head of next value i.e address to the nextnode here the nextnode
        //and the head is connected

    }
    size++;
    }

    public void traversalSinglyLinkedList(){
    Node tempNode = head;
    if(tempNode == null){
        System.out.println("The linked list is not avilable");
    }else {
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.value);
            if (i != size - 1) {
                System.out.print(" ->");
            }
            tempNode = tempNode.next;
        }
    }
        System.out.println("\n");
    }
    public boolean searchNode(int nodevalue){
    if(head !=null){
        for(int i=0;i<size;i++){
            if(head.value ==  nodevalue){
                System.out.println("Found the location at "+i);
                return true;
            }
            head = head.next;
        }
    }
        System.out.println("node not found!!!!!");
    return false;
    }

    public void deletionofNode(int location) {
    Node tempNode = head;
        if (tempNode == null) {
            System.out.println("Single list does not exit");
            return;
        } else if (location == 0) {
            tempNode = tempNode.next;
            size = size - 1;
            if (size == 0) {
                tail = null;
            }
        } else if (location >= size) {
//            Node tempNode = head;
            //here if linked list constain the only one element then we want to make head and tail to null for deleting that node
            //why we assign the head to the tempnode variable of type Node the tempnode will hold the address of the head.next  and head.next will hold the value of nodenext

            for (int i = 0; i < size; i++) {
                tempNode = tempNode.next;
            }//after the completing the for loop the tempnode will reach to the last of the node
            if (head == tempNode) {
                head = tail = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
    }else{
            for(int i=0;i<location-1;i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;//here we just assigning the address of the node.next which we want to delelte
            size--;
        }
}

public void deleteSLL(){
    head  = null;
    tail = null;
    System.out.println("Deleting the singly list successfully!!!");
}
}
