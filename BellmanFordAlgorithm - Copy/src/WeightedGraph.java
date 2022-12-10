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
        System.out.print(node.name+" ");
    }
    void dijakstra(WeightedNode node){
        PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
        node.distance =0;
        queue.addAll(nodelist);
        while(!queue.isEmpty()){
            WeightedNode currentNode = queue.remove();
            for(WeightedNode neighbor:currentNode.neighbors){
                if(queue.contains(neighbor)){
                    //if the neighbor is present in the queue then that neighbor is not Visited
                    if(neighbor.distance > currentNode.distance+currentNode.weightMap.get(neighbor)){
                        //if the distance at the neighbor node is greater than the calculated distance from the
                        //current distance then update that  neighbor distance
                        neighbor.distance =( currentNode.distance+currentNode.weightMap.get(neighbor));
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
    //Ballman Algorithm
    void ballmanford(WeightedNode sourcenode){
        sourcenode.distance = 0;//here we are setting the starting vertex to zero
        for(int i=0;i<nodelist.size();i++){
            for(WeightedNode currentnode:nodelist){
                for(WeightedNode neighbor:currentnode.neighbors){
                    if(neighbor.distance > currentnode.distance+ currentnode.weightMap.get(neighbor)){
                        neighbor.distance = currentnode.distance+ currentnode.weightMap.get(neighbor);
                        neighbor.parent =currentnode;
                    }
                }
            }
        }
        System.out.println("checking for  the negative Cycle");
        for(WeightedNode currentnode:nodelist){
            for(WeightedNode neighbor:currentnode.neighbors){
                if(neighbor.distance>currentnode.distance + currentnode.weightMap.get(neighbor)){
                    System.out.println("Negative cycle found..");
                    System.out.println("vertex name:"+neighbor.name);
                    System.out.println("Old cost:"+neighbor.distance);
                    int newDistance = currentnode.distance + currentnode.weightMap.get(neighbor);
                    System.out.println("new cost:"+newDistance);
                    return;
                }
            }
        }
        System.out.println("Negative cycle is not found...");
        for(WeightedNode nodeTocheck:nodelist){
            System.out.println("Node:"+nodeTocheck+",distance"+nodeTocheck.distance+",Path:");
            pathPrint(nodeTocheck);
            System.out.println();
        }
    }
}
