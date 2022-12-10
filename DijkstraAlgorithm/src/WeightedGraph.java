import java.util.ArrayList;
import java.util.PriorityQueue;
public class WeightedGraph {
    public ArrayList<WeightedNode> nodelist = new ArrayList<WeightedNode>();
    public WeightedGraph(ArrayList<WeightedNode> nodelist){
        this.nodelist = nodelist;
    }
    public static void pathPrint(WeightedNode node){
        if(node.parent != null){
            pathPrint(node.parent);
        }
        System.out.println(node.name+" ");
    }
    void dijakstra(WeightedNode node){
        PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
        node.distance = 0;
        queue.addAll(nodelist);
        while(!queue.isEmpty()){
            WeightedNode currentNode = queue.remove();
            for(WeightedNode neighbor:currentNode.neighbors){
                if(queue.contains(neighbor)){
                    //if the neighbor is present in the queue then that neighbor is not Visited
                    if(neighbor.distance > currentNode.distance+currentNode.weightMap.get(neighbor)){
                        //if the distance at the neighbor node is greater than the calculated distance from the
                        //current distance then update that  neighbor distance
                        neighbor.distance = ( currentNode.distance+currentNode.weightMap.get(neighbor));
                        neighbor.parent = currentNode;
                        queue.remove(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }
        for(WeightedNode nodeTocheck:nodelist){
            System.out.println("Node "+nodeTocheck+",distance :"+nodeTocheck.distance+",Path");
            pathPrint(nodeTocheck);
            System.out.println();
        }
    }

    public void addWeightedEdge(int i,int j,int d){
        WeightedNode first = nodelist.get(i);
        WeightedNode second = nodelist.get(j) ;
        first.neighbors.add(second);
        first.weightMap.put(second,d);
    }
}
