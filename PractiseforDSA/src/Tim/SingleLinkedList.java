package Tim;

public class SingleLinkedList {
    public Node head = null;
    public Node tail = null;
    public int size =0;
    public Node createNode(int value){
        Node node =new Node();
        node.value = value;
        node.next =null;
        head = node;
        tail = node;
        size =1;
        return node;
    }
    public Node insertNode(int location,int value){
        if(head == null){
            createNode(value);
            return head;
        }else{
            Node node =new Node();
            if(location == 0){
                node.value = value;
                node.next = head;
                head = node;
                size++;
                tail = node;
                return node;
            }else if(location >=size){
                node.value = value;
                node.next = null;
                tail.next = node;
                size++;
                return node;
            }else{
                Node temp = null;
                temp = head;
                int index = 0;
                while(index<location){
                    index++;
                    temp = temp.next;
                }
                node.value = value;
                node.next = temp.next;
                temp.next = node;
                size++;
                return head;
            }
        }
    }

    public void deleteNode(int location){
        Node tempnode =head;
        if(tempnode == null){
            System.out.println("There is no any linked list is present ");
        }else if(location == 0){
            tempnode = tempnode.next;
            size--;
            if(size == 0){
                head = tail = null;
            }
        }else if(location >= size){
            for(int i=0;i<size;i++){
                tempnode = tempnode.next;
            }//here we at second last position
            if(tempnode == head){//that means there is only one element is present in the linkedlist
                head= tail = null;
                size--;
                return;
            }
            tempnode.next = null;
            size--;
            tail = tempnode;
            return;
        }
    }
    public void deleteSingleLinkedList(){
        head = null;
        return;
    }
}
