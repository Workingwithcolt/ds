package BinarySearchTree;
import java.util.ArrayList;
import java.util.List;

public class LeftAndRightView {
    public List<Integer> rightSideView(node root){
        List<Integer> result = new ArrayList<>();
        rightView(root,result,0);
        return result;
    }
    public void rightView(node curr,List<Integer> result,int currDepth){
        if(curr == null){
            return;
        }
        if(result.size() == currDepth){
            result.add(curr.value);
        }
        rightView(curr.right,result,currDepth+1);
        rightView(curr.left,result,currDepth+1);
    }
    public static List<Integer> LeftSideView(node root){
        List<Integer> result = new ArrayList<>();
        LeftView(root,result,0);
        return result;
    }
    public static  void LeftView(node curr,List<Integer> result,int currDepth){
        if(curr == null){
            return;
        }
        if(currDepth == result.size()){
            result.add(curr.value);
        }
        LeftView(curr.left,result,currDepth+1);
        LeftView(curr.right,result,currDepth+1);
    }
}
