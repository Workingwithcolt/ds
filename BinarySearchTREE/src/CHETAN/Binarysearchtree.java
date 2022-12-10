package CHETAN;
import java.util.LinkedList;
import java.util.Queue;

public class Binarysearchtree {
    Binarynode root;
    Binarysearchtree(){
        root = null;
    }
//insert method
    private Binarynode insert(Binarynode currentNode,int value){
        if(currentNode == null){
            Binarynode newnode = new Binarynode();
            newnode.value = value;
            System.out.println("The value successfuly inserted");
            return newnode;
        }else if(value <= currentNode.value){
            currentNode.left = insert(currentNode.left, value);
            return currentNode;
        }else{
            currentNode.right = insert(currentNode.right, value);
            return currentNode;
        }
    }
    void insert(int value){
        root = insert(root,value);
    }
    public void preOrder(Binarynode node) {
        System.out.println("preorder is executed");
        if (node == null) {
            return;
        } else {
            System.out.println(node.value + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    public void InOrder(Binarynode node){
        if(node == null){
            return;
        }else{
            InOrder(node.left);
            System.out.println(node.value+" ");
            InOrder(node.right);
        }
    }
    public void postOrder(Binarynode node){
        if(node == null){
            return;
        }else{
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.value+" ");
        }
    }
    public void levelOrder(){
        Queue<Binarynode> queue = new LinkedList<Binarynode>();
        queue.add(root);
        while(!queue.isEmpty()){
            Binarynode presentNode = queue.remove();
            System.out.println(presentNode.value+" ");
            if(presentNode.left != null){
                queue.add(presentNode.left);
            }
            if(presentNode.right != null ){
                queue.add(presentNode.right);
            }
        }
    }
    public Binarynode search(Binarynode node,int value) {
        if (node == null) {
            System.out.println("value " + value + "not found is BST");
            return null;
        } else if (node.value == value) {
            System.out.println("value " + value + "is found in BST");
            return node;
        } else if (value < node.value) {
            return search(node.left, value);
        } else {
            return search(node.right, value);
        }
    }
}