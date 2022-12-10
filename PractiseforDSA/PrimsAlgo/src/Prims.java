import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prims {
    ArrayList<WeightedNode> nodeList = new ArrayList<WeightedNode>();
    ArrayList<UndirectedEdge> edgelist = new ArrayList<UndirectedEdge>();
    public Prims(ArrayList<WeightedNode> nodeList){
        this.nodeList = nodeList;
    }
    //here we are implement the method that are used for adding the Undirected weighted edges in the Kruskal Graph
    public void addWeightedUndirected(int firstIndex,int secondIndex,int weight){
        UndirectedEdge edge = new UndirectedEdge(nodeList.get(firstIndex),nodeList.get(secondIndex),weight);
        WeightedNode first =edge.first;
        WeightedNode second = edge.second;
        first.neighbors.add(second);
        second.neighbors.add(first);
        first.weightMap.put(second,weight);
        second.weightMap.put(first,weight);
        edgelist.add(edge);
    }
    //prims algoritm
    void prims(WeightedNode node){
        for(int i=0;i<nodeList.size();i++){
            nodeList.get(i).distance = Integer.MAX_VALUE;//here we are set the othere node except the source node to infinity
        }
        node.distance = 0;//here we assign the source to 0
        PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
        queue.addAll(nodeList);
        while(!queue.isEmpty()){
            WeightedNode currenetnode =queue.remove();
            for(WeightedNode neighbhor: currenetnode.neighbors){
                if(queue.contains(neighbhor)){
                   queue.contains(neighbhor);
                   if(neighbhor.distance > currenetnode.weightMap.get(neighbhor)){
                       neighbhor.distance = currenetnode.weightMap.get(neighbhor);
                       neighbhor.parent = currenetnode;
                       queue.remove(neighbhor);
                       queue.add(neighbhor);
                   }
                }
            }
        }
        int cost = 0;
        for(WeightedNode nodeTocheck:nodeList){
            System.out.println("Node "+nodeTocheck+",key"+nodeTocheck.distance+",parent"+nodeTocheck.parent);
            cost = cost+nodeTocheck.distance;
        }
        System.out.println("\n Total cost of minimum cost is"+cost);
    }
}
