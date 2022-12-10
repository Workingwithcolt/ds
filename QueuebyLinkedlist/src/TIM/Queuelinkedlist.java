

package TIM;

public class Queuelinkedlist {
    public Node head = null;
    public Node tail = null;
    int size;

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public Node createfirst(int value) {
        if (head == null) {
            Node newnode = new Node();
            head = newnode;
            newnode.value = value;
            newnode.next = null;
            tail = newnode;
            size = 0;
        }
        return head;
    }

    public Node enQueue(int value) {
        if (isEmpty()) {
            createfirst(value);
        } else {
            //insert at the last
            //after creating the first node
            //U have to insert the node after the head node
            Node newnode = new Node();
            tail.next = newnode;
            tail = newnode;
            newnode.value = value;
            newnode.next = null;
            size++;
        }
        return head;
    }

    public void traverse() {
        Node tempnode = head;
        for (int i = 0; i <= size; i++) {
            System.out.print(tempnode.value);
            if (i != size) {
                System.out.print(" <-");
            }
            tempnode = tempnode.next;
        }
    }

    public void deQueue() {
        if (head == null) {
            System.out.println("The Queue is empty");
        } else {
            if(head.next == null){
                System.out.println("it is last element");
            }
            head = head.next;
            size--;
        }
    }
    public int Peek(){
        int result = head.value;
        return result;
    }

}