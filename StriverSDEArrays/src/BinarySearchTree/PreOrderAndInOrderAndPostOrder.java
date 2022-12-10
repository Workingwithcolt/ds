package BinarySearchTree;

import java.util.List;
import java.util.Stack;

public class PreOrderAndInOrderAndPostOrder {
    public class Treenode{
        int value;
        Treenode left;
        Treenode right;
        Treenode(int value){
            this.value = value;
        }
    }

    static class Pair{
        Treenode node;
        int num;
        Pair(Treenode node,int num){
            this.num = num;
            this.node = node;
        }
    }
    public static void Alltraversal(Treenode root, List<Integer> pre, List<Integer> In, List<Integer> Po){
        Stack<Pair> stack = new Stack<>();
        if(root == null) return;
        stack.push(new Pair(root,1));
        while(!stack.isEmpty()){
            Pair element = stack.pop();
            if(element.num == 1){
                pre.add(element.node.value);
                stack.add(new Pair(element.node, element.num+1));
                if(element.node.left != null) {
                    stack.add(new Pair(element.node.left, 1));
                }
            }else if(element.num == 2){
                In.add(element.num);
                stack.push(new Pair(element.node,element.num+1));
                if(element.node.right != null) {
                    stack.add(new Pair(element.node.right, 1));
                }
            }else{
                Po.add(element.node.value);
            }
        }
    }
}
