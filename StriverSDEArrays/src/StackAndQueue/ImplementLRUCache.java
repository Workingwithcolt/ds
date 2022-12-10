package StackAndQueue;
import java.util.*;
import java.util.HashMap;

public class ImplementLRUCache {
    static class Node{
        Node prev,next;
        int value;
        int key;
        public Node(int value,int key){
            this.value = value;
            this.key = key;
        }
    }
    public static int capacity =0;
    public static Node head = new Node(0,0);
    public  static  Node tail = new Node(0,0);
    public static  int size=0;
    static Map<Integer,Node> map =new HashMap<>();
    public static  void  insert(Node node){
        head.next.prev = node;
        node.next = head.next;
        head.next = node;
        node.prev = head.next;
        map.put(node.key,node);
        System.out.println("It is inserted");
        size++;
    }
    public static  void  remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
        node.next =null;
        node.prev = null;
        size--;
    }
    public static void get(int key){
        if(map.containsKey(key)){
            int value = map.get(key).value;
            remove(map.get(key));
            insert(new Node(value,key));
            System.out.println("node is inserted successfully");
        }else{
            System.out.println("the node is not present ");
        }
    }
    public static void put(int key,int value){
        Node node = new Node(value,key);
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(size == capacity){
            remove(tail.prev);
        }
        insert(node);
    }
    public static void print(){
        Node temp = head.next;
        while(temp.next != null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        capacity = 3;
        head.prev =null;
        head.next = tail;
        tail.prev = head;
        tail.next= null;
        put(1,100);
        put(2,1200);
        put(3,230);
        print();
        put(4,120);
        print();

    }
}
