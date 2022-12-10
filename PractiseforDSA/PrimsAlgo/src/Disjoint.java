import java.util.ArrayList;

public class Disjoint {
    private ArrayList<WeightedNode> nodeList = new ArrayList<>();
    public static void makeSet(ArrayList<WeightedNode> nodeList){
        for(WeightedNode node :nodeList){
            Disjoint set = new Disjoint();//here we  add the Disjoint set to each node of nodelist
            set.nodeList.add(node);
            node.set = set;//here we are just assigning the refrerence of the new disjoint set to the
            //new node in the interation of set property here node is refernce of the WeightNode class this class
            //has the property of set here we add the new disjoint set
        }
    }
    public static Disjoint findset(WeightedNode node){
        return node.set;
    }//here we are return the set propertyo of
    //Weighnode
    public static Disjoint union(WeightedNode node1,WeightedNode node2){
        if(node1.set.equals(node2.set)){//if the two element is present in the same set then return the null
            System.out.println("null");
            return null;
        }else{
            Disjoint set1 = node1.set;//first.set which has the value A
            Disjoint set2 = node2.set;//here we assign the set property of the Disjoint Class
            //second.set which has the value B
            if(set1.nodeList.size() > set2.nodeList.size()){
                ArrayList<WeightedNode> nodeset2 = set2.nodeList;
                for(WeightedNode node: nodeset2){
                    System.out.println("set1:");
                    set1.printAllnodesThisset();
                    System.out.println("node.set");
                    node.set.printAllnodesThisset();
                    node.set = set1;//here we add each node of set property to the set1 becaouse we are initialize
                    //each node parent to the set1
                    set1.nodeList.add(node);//then we add the node to the set1
                }
                return set1;
            }else{
                ArrayList<WeightedNode> nodeset1 =  set1.nodeList;
                for(WeightedNode node:nodeset1){

                    node.set = set2;///here by assigning the set2 for each node of set property we set the parent
                    set2.nodeList.add(node);
                }
                return set2;

            }
        }
    }
    public void printAllnodesThisset(){
        System.out.println("Printing all nodes of set");
        for(WeightedNode node: nodeList){
            System.out.println(node+" ");
        }
        System.out.println();
    }
}
