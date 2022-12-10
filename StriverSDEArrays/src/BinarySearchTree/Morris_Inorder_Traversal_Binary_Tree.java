package BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class Morris_Inorder_Traversal_Binary_Tree {
    static class  Node{
        public Node left;
        Node right;
        int value;
        Node(String name){
            this.value = value;
        }
    }
    public List<Integer> InorderTraversal(Node root){
        List<Integer> inorder = new ArrayList<>();
        Node current = root;
        while(current != null){
            if(current.left == null){
                inorder.add(current.name);
                current = current.right;
            }else{
                Node prev = current.left;
                while(prev.right != null && prev.right != current){
                    prev = prev.right;
                }
                if(prev.right == null){
                    prev.right = current;
                    current = current.left;
                }else{
                    prev.right = null;
                    inorder.add(current.value);
                    current = current.right;
                }
            }
        }
        return inorder;
    }
}
