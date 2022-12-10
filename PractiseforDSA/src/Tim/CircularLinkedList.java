package Tim;

public class CircularLinkedList {
    public Node head = null;
    public Node tail = null;
    int size = 0;
    public Node createSingleList(int value){
        Node newnode = new Node();
        newnode.value = value;
        head = newnode;
        tail = newnode;
        newnode.next = head;
        size = 1;
        return head;
    }//for creating the first node if head is equal to the null
    public void insertNode(int value,int location){
        Node newnode =new Node();
        if(head == null){
            createSingleList(value);
            return;
        }else if(location == 0) {
            newnode.value = value;
            newnode.next = head;
            head = newnode;
            size++;
            return;
        }else if(location>=size){
            newnode.value = value;
            tail.next = newnode;
            tail =newnode;
            newnode.next = head;
            size++;
            return;
        }else{
            int index  = 0;
            Node tempnode =head;
            while(index<=location-2){
                tempnode =tempnode.next;
                index++;
            }
            newnode.value = value;
            newnode.next = tempnode.next;
            tempnode.next = newnode;
            size++;
            return;
        }
    }
}
