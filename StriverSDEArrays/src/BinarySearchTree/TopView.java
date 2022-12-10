package BinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;
import java.util.*;

public class TopView {
    static class Node{
        int value;
        Node left;
        Node right;
        int hd;
        Node(int value){
            this.value = value;
        }
    }
    public static List<Integer> Topview_Tree(Node root){
        if(root == null) return null;
        List<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> map =new TreeMap<>();
        Queue<Node> q = new LinkedList<>();
        root.hd = 0;
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.remove();
            if(map.get(temp.hd) == null){
                map.put(temp.hd,temp.value);
            }
            if(temp.left != null){
                temp.left.hd = temp.hd-1;
                q.add(temp.left);
            }else if(temp.right != null){
                temp.right.hd = temp.hd+1;
                q.add(temp.right);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}
