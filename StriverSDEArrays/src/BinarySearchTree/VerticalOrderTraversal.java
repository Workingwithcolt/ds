package BinarySearchTree;

import com.sun.source.tree.Tree;

import javax.management.Query;
import java.util.*;

public class VerticalOrderTraversal {
    static class Treenode{
        Treenode left,right;
        int data;
        Treenode(int data){
            this.data =data;
        }
    }
    static class Tuple{
        Treenode node;
        int row;
        int col;
        public Tuple(int row,int col,Treenode node){
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }
    public static List<List<Integer>> findVertical(Treenode root){
        TreeMap<Integer,TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<>();
        q.offer(new Tuple(0,0,root));
        while(!q.isEmpty()){
            Tuple tuple = q.poll();
            Treenode node = tuple.node;
            int x = tuple.row;
            int y = tuple.col;
            if(!map.containsKey(x)){
                map.put(x,new TreeMap<>());
            }//if the element is not present in the map of rows
            if(!map.get(x).containsKey(y)){
                map.get(x).put(y,new PriorityQueue<>());
            }
            map.get(x).get(y).offer(node.data);
            if(node.left != null){
                q.offer(new Tuple(x-1,y+1,node.left));
            }
            if(node.right != null){
                q.offer(new Tuple(x+1,y+1,node.right));
            }
        }

        List<List<Integer>> list =new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> ys:map.values()) {
            list.add(new ArrayList<>());
            for(PriorityQueue<Integer> nodes:ys.values()){
                while(!nodes.isEmpty()){
                    list.get(list.size()-1).add(nodes.poll());
                }
            }
        }///here we first access the TreeMap<Integer,...>/
        //then we access <Integer,PriorityQueue<Integer>> by the variable which traverse the TreeMap><Integer,..>
        //then we access the nodes of PriorityQueue and push nodes to the list
        return list;
    }

}
