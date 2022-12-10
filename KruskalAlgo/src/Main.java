import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<WeightedNode> nodeList= new ArrayList<>();
        nodeList.add(new WeightedNode("A"));
        nodeList.add(new WeightedNode("B"));
        nodeList.add(new WeightedNode("C"));
        nodeList.add(new WeightedNode("D"));
        nodeList.add(new WeightedNode("E"));
        Kruskal graph = new Kruskal(nodeList);
        graph.addWeightedUndirected(0,1,5);
        graph.addWeightedUndirected(0,2,13);
        graph.addWeightedUndirected(0,4,15);
        graph.addWeightedUndirected(1,2,10);
        graph.addWeightedUndirected(1,3,8);
        graph.addWeightedUndirected(2,3,6);
        graph.addWeightedUndirected(2,4,20);
        System.out.println("Running the Kruskal algo");
        graph.Kruskal();
    }
}
