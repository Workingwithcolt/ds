import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarytreeL {
    Binarynode root;
    public BinarytreeL(){
        this.root = null;
    }
    //Preorder traversal
    //in preorder traversal we have to reach the nodes in the order of Root->left->Right
    void preOrder(Binarynode node){
        if(node == null){
            return;
        }
        System.out.print(node.value+" ");
        preOrder(node.left);//...........................o(n/2) Time complexity _____  o(N) space and time complexity
        preOrder(node.right);//1 2 3 4 //.................o(n/2) Time complexity -----7
    }
    void InOrder(Binarynode node){
        if(node == null){
            return;
        }
        InOrder(node.left);
        System.out.print(node.value+" ");
        InOrder(node.right);
    }
    void postOrder(Binarynode node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+" ");
    }
    void levelOrder() {
        if (root == null) {
            System.out.println("IT is empty");
        }else{
            Queue<Binarynode> queue = new LinkedList<Binarynode>();//here we create the linked list
            queue.add(root);
            while (!queue.isEmpty()) {
                Binarynode presentNode = queue.remove();//here the first element in the queue
                System.out.println(presentNode.value + " ");
                if (presentNode.left != null) {
                    queue.add(presentNode.left);
                }
                if (presentNode.right != null) {
                    queue.add(presentNode.right);
                }
            }
        }
    }
    public void search(String value){
        Queue<Binarynode> queue = new LinkedList<Binarynode>();
        queue.add(root);
        while(!queue.isEmpty()) {
            Binarynode node = queue.remove();
            if (node.value == value) {
                System.out.println("The value is present");
                return;
            } else {
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
    }
    void insert(String value) {
        Binarynode newnode = new Binarynode();
        newnode.value = value;
        if (root == null) {
            root = newnode;//here like the linked list we just assign that means we make the newnode to the root
            System.out.println("Inserted new node at the root node");
            return;

        }
        Queue<Binarynode> queue = new LinkedList<Binarynode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Binarynode presentNode = queue.remove();
            if (presentNode.left == null) {
                presentNode.left = newnode;
                System.out.println("Successfully inserted");
                break;
            } else if (presentNode.right == null) {
                presentNode.right = newnode;
                System.out.println("Successfully inserted R");
                break;
            } else {
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }
    public Binarynode getDeepestNode(){
        Queue<Binarynode> queue  = new LinkedList<Binarynode>();
        queue.add(root);
        Binarynode presentNode = null;
        while(!queue.isEmpty()){
            presentNode = queue.remove();
            if(presentNode.left != null){
                queue.add(presentNode.left);
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
        return presentNode;//that is the last node;
    }
    //
    //Delete Depest noe
    public void deleteDeepestNode(){
        Queue<Binarynode> queue  = new LinkedList<Binarynode>();
        queue.add(root);
        Binarynode previousnode,presentnode = null;
        while(!queue.isEmpty()){
            previousnode = presentnode;
            presentnode = queue.remove();
            if(presentnode.left == null){
                previousnode.right = null;
            }else if(presentnode.right == null){
                presentnode.left = null;
                return;
            }
            if(presentnode.left != null){
                queue.add(presentnode.left);
            }
            if(presentnode.right != null){
                queue.add(presentnode.right);
            }
        }
    }
    void deletenode(String value){
        Queue<Binarynode> queue  = new LinkedList<Binarynode>();
        queue.add(root);
        while(!queue.isEmpty()){
            Binarynode presentnode = queue.remove();
            if(presentnode.value == value){
                presentnode.value = getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("the node is deleted");
                return;
            }else {
                if(presentnode.left != null){
                    queue.add(presentnode.left);
                }
                if(presentnode.right != null){
                    queue.add(presentnode.right);
                }
            }
        }
        System.out.println("The node does not exist in this BinaryTree");
    }
    void delete(){
        root = null;
        System.out.println("BT is successfully deleted");
    }
}
