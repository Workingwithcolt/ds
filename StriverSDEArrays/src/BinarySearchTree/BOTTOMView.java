package BinarySearchTree;
import java.util.*;

public class BOTTOMView {
    static  class Node{
        Node left;
        Node right;
        int hd;
        int value;
        Node(int height,int value){
            this.hd = height;
            this.value = value;
        }
    }
    public ArrayList<Integer> bottomView(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Map<Integer,Integer> map =new TreeMap<>();
        Queue<Node> q = new LinkedList<>();
        root.hd= 0;//here hd means the vertical position
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.remove();
            int hd = temp.hd;
            map.put(hd,temp.value);
            if(temp.left != null){
                temp.left.hd = hd-1;
                q.add(temp.left);
            }
            if(temp.right != null){
                temp.right.hd = hd+1;
                q.add(temp.right);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}
