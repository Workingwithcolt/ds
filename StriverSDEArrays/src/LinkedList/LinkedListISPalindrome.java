package LinkedList;

public class LinkedListISPalindrome {
    public static boolean Palindrome(LinkedListNode h1){
        LinkedListNode first  = h1;
        LinkedListNode second = h1;

        while(second != null){
            first = first.next;
            second = second.next.next;
        }
        //for getting the middle
        first.next = ReverseLinkedList.reverse(first.next);//first.next is the head of the second half
        //here above we assign the head to the first.next becoz we dont want to bread the linkedlist
        first = first.next;

        while(first != null){
            if(h1.value != first.value){
                return false;
            }
            first = first.next;
            h1  = h1.next;
        }
        return  true;
    }
    public static void main(String [] args){

    }
}
