import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<WeightedNode> nodeList = new ArrayList<>();
        nodeList.add(new WeightedNode("A",0));
        nodeList.add(new WeightedNode("B",1));
        nodeList.add(new WeightedNode("C",2));
        nodeList.add(new WeightedNode("D",3));
        WeightedGraph g = new WeightedGraph(nodeList);
        g.addWeightedEdge(0,3,1);
        g.addWeightedEdge(0,1,8);
        g.addWeightedEdge(1,2,1);
        g.addWeightedEdge(2,0,4);
        g.addWeightedEdge(3,1,2);
        g.addWeightedEdge(3,2,9);
        System.out.println("the Floyd Warsah");
        g.floydWarshall();
    }
}
