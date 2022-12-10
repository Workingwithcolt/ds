package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearch {
    public static node root;
    public BinarySearch(){
        root = null;
    }
    public node insert(node currentNode,int value){
        if(currentNode == null){
            node newnode = new node();
            newnode.value = value;
            return newnode;
        }else if(currentNode.value  <= value){
            currentNode.left = insert(currentNode.left, value);
            return currentNode;
        }else{
            currentNode.right = insert(currentNode.right,value);
            return currentNode;
        }
    }
    public void  insert(int value){
        root = insert(root,value);
    }
    public void preOrder(node newnode) {
        if (newnode == null) {
            return;
        } else {
            preOrder(newnode.left);
            System.out.println(newnode.value);
            preOrder(newnode.right);
        }
    }
    public void Inorder(node newnode){
        if(newnode == null){
            return;
        }else{
            Inorder(newnode.left);
            System.out.println(newnode.value);
            Inorder(newnode.right);
        }
    }
    public void postOrder(node newnode){
        if(newnode ==null){
            return;
        }else{
            postOrder(newnode.left);
            postOrder(newnode.right);
            System.out.println(newnode.value);
        }
    }
    public static void LevelOrder(){
        Queue<node> queue = new LinkedList<node>();
        queue.add(root);
        while(!queue.isEmpty()){
            node presentNode = queue.remove();
            System.out.println(presentNode.value+" ");
            if(presentNode.left != null){
                queue.add(presentNode.left);
            }else if(presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
    }
    public node Search(node newnode,int value){
        if(newnode == null){
            return null;
        }else if(newnode.value == value){
            System.out.println(newnode.value+" ");
            return  newnode;
        }else if(value < newnode.value){
            return Search(newnode.left, value);
        }else if(value > newnode.value){
           return  Search(newnode.right,value);
        }
        return null;
    }
}
