import java.util.ArrayList;

public class TREENODE {
    String data;
    ArrayList<TREENODE> children;
    public TREENODE(String data){
        this.data = data;
        this.children = new ArrayList<TREENODE>();
    }

    //adding the children
    public void addchild(TREENODE node){
        this.children.add(node);
    }
    //when I initialize  the root node that time for eg..TREENODE root = new TREENODE(0);
    // here root node is created having the data and Node part
    //TREENODE first = new TREENODE("first")
//root.addchild(first)//here we have already created the first node then we add that node to the root node as a child
//node by add method
public String print(int level){
        String ret;
        ret = " ".repeat(level)+data+"\n";
        for(TREENODE node:this.children){
            ret += node.print(level+1);
        }
        return ret;
        //firstly when i enter the print(0)
    //that time
}
public void printtree(){
    System.out.println(data);
        for(TREENODE node:this.children){
            System.out.print(" ");
            System.out.println(node.data);
        }//we have to iterate from each element of arraylist
    //then we have to print the content which is present in the element of arraylist
    //then we have to check wether the node has a children or not
}
//A
// B
// c
    //
//
}
