package BinarySearchTree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;

public class PrintRootToNodePath {
    static class Treenode{
        Treenode left;
        Treenode right;
        int data;
        Treenode(int data){
            this.data =data;
        }
    }
    public boolean getPath(Treenode root, ArrayList<Integer> arr, int x){
        if(root == null){
            return false;
        }
        arr.add(root.data);
        if(root.data == x){
            return true;
        }
        if(getPath(root.left,arr,x) ||  getPath(root.right,arr,x)){
            return true;
        }
        return false;
    }
    public ArrayList<Integer> solver(Treenode A,int B){
        ArrayList<Integer> arr =new ArrayList<>();
        if(A == null) return arr;
        getPath(A,arr,B);
        return arr;
    }
}
