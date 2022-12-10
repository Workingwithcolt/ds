public class CircularLinkedLISt {
    //we have to create the circular linked list
    public Node head;
    public Node tail;
    public int size;
    public Node createCSLL(int nodevalue){
        Node node= new Node();
        head = node;
        node.value = nodevalue;
        node.next = node;//In a circular linklist the last node points to the first node but here it is the first node
        tail = head;
        size+=1;
        return head;
    }
    public Node InsertCSLL(int nodevalue,int location){
        //before inserting the element in the linkedlist we have to check the linked list is empty or not
        //we have to insert the node at the first for that we have take the address of the head to the newnode next
        //then we have make the head = newnode
        //then we have to update the last node to the new node
        //for inserting at the last
        //we have to make the currentlast node next = newnode
        //before assigning the newnode we have to make the newnode next to the current node next
        //then we have to make the newnode to the tail
        Node node=  new Node();
        node.value = nodevalue;
        if(head == null){
            createCSLL(nodevalue);
        }else if(location == 0){
            node.next = head;
            head = node;
//            tail.next =node;
        }else if(location >=size){
            tail.next = node;//here we assing the address of the last previous node of next to the address
            //of the inserting node
            tail = node;
            tail.next = head;
            //here we assign the address of the last node to the head
        }else{
            Node tempnode =head;
            for(int i=0;i<location-1;i++){
                tempnode = tempnode.next;
            }
            node.next = tempnode.next;
            tempnode.next = node;
        }
        size++;
        return head;
    }
    public void traversalCSLL() {
        //we have go from head to last node if address of last node is equal to the address of the head then
        //stop or we can implement it by other way by doing with the size parameter
        Node tempnode = head;
        for(int i=0;i<size;i++){
            System.out.print(tempnode.value+"<-");
            tempnode = tempnode.next;
            if(head == tempnode){
                break;
            }
        }
    }
    public boolean SearchCSLL(int nodevalue){
        Node tempNode = head;
     for(int i=0;i<size;i++){
         if(nodevalue == tempNode.value){
             System.out.println(nodevalue+" that find at the "+i);
             return true;
         }
         tempNode = tempNode.next;
     }
     return  false;
    }
    public Node DeleteNoode(int location){
     //first we have to delete the we have to check we the linklist contain the one or more element
        //when one then make the head = null and tail =null
        //multiple for first
        //head.next assign to the new head
        if(location == 0){
            head = head.next;
            tail.next = head;//for making the last node to point the first node
            size--;
            if(size == 0){
                tail = null;
                head.next = null;
                head = null;
            }
        }else if(location >= size){
            Node tempnode =  head;
            for(int i=0;i<=size;i++){
                tempnode = tempnode.next;
            }
            tempnode.next = head;
            tail = tempnode;
            return head;
        }else{//1 2 3 4 5//here location-2 one minus for location to be started from 1 and another 1 for we
            // have to stop at the one position before and equal to for stoping at that positon
            Node tempnode = head;
            for(int i=0;i<=location-2;i++){
                tempnode = tempnode.next;
            }
            tempnode.next = tempnode.next.next;
            return head;
        }
        return head;
    }
    public void deleteCSLL(){
        if(head == null){
            System.out.println("Circular linked list does not exits");
        }else{
            head = null;
            tail.next = null;
            tail = null;
            System.out.println("The CSLL has been deleted");
        }
    }
}
