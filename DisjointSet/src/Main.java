import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<WeightedNode> nodeList= new ArrayList<>();
        nodeList.add(new WeightedNode("A"));
        nodeList.add(new WeightedNode("B"));
        nodeList.add(new WeightedNode("C"));
        nodeList.add(new WeightedNode("D"));

        Disjoint.makeSet(nodeList);
        WeightedNode first = nodeList.get(0);
        WeightedNode second = nodeList.get(1);
        Disjoint output = Disjoint.findset(second);
        output.printAllnodesThisset();

        Disjoint.union(first,second);
        output = Disjoint.findset(second);
        output.printAllnodesThisset();
    }
}
