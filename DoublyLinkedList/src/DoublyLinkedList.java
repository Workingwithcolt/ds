public class DoublyLinkedList {
    Doublynode head;
    Doublynode tail;
    int size = 0;
    public Doublynode createDLL(int nodevalue){
        Doublynode node = new Doublynode();
        node.value = nodevalue;
        node.next = null;
        node.prev =null;
        head =node;
        tail = node;
        size++;
        return head;
    }
    public void insertDLL(int nodevalue,int location){
        Doublynode node =new Doublynode();
        node.value = nodevalue;
        if(head == null){
            createDLL(nodevalue);
            return;
        }else if(location == 0){
            node.prev= null;//here we make the first node prev to the null
            node.next = head;//here we make the node of next to the current node
            head.prev =node;//here make the current node of previous to the node
            head = node;//make the head to the node
        }else if(location >= size){
            node.prev = tail;//here we make the the inserting node prev to the tail node
            tail.next = node;//here we make the tail node next = to the node
            tail = node;//here we make  the node to tail
            node.next = null;//here we make the the node next to the null
        }else{
            Doublynode tempnode = head;
            for(int i=0;i<location-1;i++){
                tempnode = tempnode.next;
            }
            node.next = tempnode.next ;//here we make assign the address of currenct node next to the node next
            node.prev = tempnode;//here we have assign the current to the previous of the node
            tempnode.next = node;//here we assign the address of the node to current node next
            tempnode.next.prev = node;//here we assign the current node next of node previous to the node
        }
        size++;
    }
    public void TraversalDLL(){
        if(head != null){
            Doublynode tempnode = head;
            for(int i=0;i<size;i++){
                System.out.print(tempnode.value);
                if(i != size-1){
                    System.out.print(" -> ");
                }
                tempnode = tempnode.next;
            }
        }else{
            System.out.println("The DLL does not exist");
        }
        System.out.println("\n");
    }
    public void SearchDLL(int nodevalue){
        if(head == null){
            System.out.println("Double linked list does not exist");
        }else{
            for (int i=0;i<size;i++){
                if(head.value == nodevalue){
                    System.out.println(nodevalue+" it is located at the "+(i+1));
                    break;
                }else{
                    head = head.next;
                    if(head.next == null){
                        System.out.println("The element is not located inside the linked list");
                        break;
                    }
                }
            }
        }
    }
    public void reverseTraversal() {
        if (head != null) {
            Doublynode tempnode = tail;
            for(int i=0;i<size;i++){
                System.out.print(tempnode.value);
                if(i != size-1){
                    System.out.print(" <- ");
                }
                tempnode = tempnode.prev;
            }
        }else{
            System.out.println("The DLL does not exist!");
        }
        System.out.println(" \n ");
    }
    public boolean searchNode(int nodevalue){
        if(head != null){
            Doublynode tempnode = head;
            for(int i=0;i<size;i++){
                if(tempnode.value == nodevalue){
                    System.out.println("The node is found at the location "+i);
                    return true;
                }else{
                    tempnode = tempnode.next;
                }
            }
        }
        System.out.println("Node is not  found");
        return false;
    }
    public void deleteNodeDLL(int location){
        if(head == null){
            System.out.println("Double does not exist");
            return;
        }else if(location == 0){
            if(size == 1) {
                head = null;
                tail = null;
                size--;
            }else{
                head = head.next;
                head.prev = null;
                size--;
            }
        }else if (location >= size){
            Doublynode tempnode = tail.prev;
            if(size == 1) {
                head = null;
                tail = null;
                size--;
                return ;
            }else{
                tempnode.next = null;
                tail = tempnode;
                size--;
            }
        }else{
            Doublynode tempnode = head;
            for(int i=0;i<location-1;i++){
                tempnode  = tempnode.next;
            }
            tempnode.next = tempnode.next.next;
            tempnode.next.prev = tempnode;
        }
    }
    public void deleteEntire(){
        Doublynode tempnode =head;
        for(int i=0;i<size;i++){
            tempnode.prev = null;
            tempnode = tempnode.next;
        }
        head = null;
        tail = null;
        System.out.println("Doubly link is deleted");
    }

}
