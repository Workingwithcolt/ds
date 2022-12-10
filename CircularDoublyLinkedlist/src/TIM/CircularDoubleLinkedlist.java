package TIM;

public class CircularDoubleLinkedlist {
    Doublenode head;
    Doublenode tail;
    public int size;

    Doublenode createCDLL(int nodevalue) {
        Doublenode node = new Doublenode();
        head = node;
        node.value = nodevalue;
        node.next = node;
        node.prev = node;
        tail = node;
        size = 1;
        return head;
    }

    void insertNode(int nodeValue, int location) {
        Doublenode newnode = new Doublenode();
        newnode.value = nodeValue;
        if (head == null) {
            createCDLL(nodeValue);
            return;
        } else if (location == 0) {
            newnode.prev = tail;
            newnode.next = head;//
            head.prev = newnode;
            tail.next = newnode;//link the last node to the newnode
            head = newnode;//make the newnode to head
        } else if (location >= size) {
//            Doublenode tempnode = head;
//            for(int i=0;i<=size;i++){
//                tempnode = tempnode.next;
//            }
//            newnode.prev = tempnode;
//            tempnode.next = newnode;
//            newnode.next = head;
//            tail = newnode;
//            head.prev = newnode;
            tail.next = newnode;
            newnode.prev = tail;
            newnode.next = head;
            head.prev = newnode;
            tail = newnode;
        } else {
            Doublenode tempnode = head;
            for (int i = 0; i < location - 1; i++) {
                tempnode = tempnode.next;
            }
            newnode.prev = tempnode;
            newnode.next = tempnode.next;
            tempnode.next = newnode;
            newnode.next.prev = newnode;
        }
        size++;
    }

    void Traversal() {
        if (head != null) {
            Doublenode tempnode =head;
            for(int i=0;i<size;i+=1){
                System.out.print(tempnode.value);
                if(i != size-1){
                    System.out.print("->");
                }
                tempnode =tempnode.next;
            }
        }else{
            System.out.println("Doubly linked list does not exist");
        }
    }
    void Reverse(){
        if(tail != null){
            Doublenode tempnode = tail;
            for(int i=0;i<size;i++){
                System.out.print(tempnode.value);
                if(i != size-1){
                    System.out.print("<-");
                }
                tempnode = tempnode.next;
            }
        }else {
            System.out.println("Doubly linked list does not exist");
        }
    }

}