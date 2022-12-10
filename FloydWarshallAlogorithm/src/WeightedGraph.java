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
    void floydWarshall(){
        int size =nodelist.size();
        int[][] V = new int[size][size];
        for(int i=0;i<size;i++){
            WeightedNode first = nodelist.get(i);
            for(int j=0;j<size;j++){
                WeightedNode second = nodelist.get(j);
                if(i == j){
                    V[i][j] = 0;//here it is the Self loop
                }else if(first.weightMap.containsKey(second)){
                    V[i][j] = first.weightMap.get(second);//here we check particular node is contain or not
                }else{
                    V[i][j] = Integer.MAX_VALUE/10;//here we assign the INFINITY to the node which does not have
                    //the direct connection here we divide by 10 for avoiding the Arithmatic Exception
                }
            }
        }//In above loop we are initializing the Matrix with value of 0 for the loop itself
        //and INFINITY for the element which has not connection
        //and value which shows the  direct link between two nodes

        for(int k=0;k<nodelist.size();k++){
            //here K is used as the Via node
            for(int i=0;i<nodelist.size();i++){
                for(int j = 0;j<nodelist.size();j++){
                    System.out.println("i ="+i+"j ="+j+"k ="+k);
                    System.out.println("v["+i+"]["+j+"] = "+ V[i][j]);
                    System.out.println("v["+i+"]["+k+"] = "+ V[i][k]);
                    System.out.println("v["+k+"]["+j+"] = "+ V[i][j]);
                    System.out.println("v[i][k]" +V[i][k]);
                    System.out.println("v[j][k] ="+V[j][k]);
                    if(V[i][j] > V[i][k]+V[k][j]){
                        System.out.println("Execute");
                        V[i][j] = V[i][k]+V[k][j];
                        System.out.println("v["+i+"]["+j+"] = "+ V[i][j]);
                    }
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.println("Printing the distance list for node:"+nodelist.get(i)+"i");
            for(int j=0;j<size;j++){
                System.out.print(V[i][j]+" ");
            }
            System.out.println();
        }
    }

}
