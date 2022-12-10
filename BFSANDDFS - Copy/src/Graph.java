import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {
    ArrayList<Graphnode> nodelist ;
    int[][] AdjacencyMatrix ;
    public Graph(ArrayList<Graphnode> nodelist){
        this.nodelist = new ArrayList<>();
        this.AdjacencyMatrix = new int[nodelist.size()][nodelist.size()];
    }
    public void addUndirectedEdge(int i,int j){
        AdjacencyMatrix[i][j] = 1;
        AdjacencyMatrix[j][i] = 1;
    }
    public ArrayList<Graphnode> getNeighbors(Graphnode node){//the node which we are going to find the neighbors
        ArrayList<Graphnode> neighbors = new ArrayList<>();
        int newindex = node.index;
        for(int i=0;i<AdjacencyMatrix.length;i++){
            if(AdjacencyMatrix[newindex][i] == 1){
                neighbors.add(nodelist.get(i));
            }
        }
        return neighbors;
    }
    public void BFSVisited(Graphnode node){
        ArrayList<Graphnode> queue = new ArrayList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            Graphnode currentnode = queue.remove(0);
            currentnode.isVisited = true;
            ArrayList<Graphnode> neighbors =getNeighbors(currentnode);
            for(Graphnode neighbor:neighbors){
                if(!neighbor.isVisited){
                    queue.add(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }
    public void bfs(){
        for(Graphnode node:nodelist){
            if(!node.isVisited){
                BFSVisited(node);
            }

        }
    }
    public void DFSVisited(Graphnode node){
        Stack<Graphnode> stack = new Stack<>();
        stack.push(node);
        while (!stack.empty()){
            Graphnode currentnode = stack.pop();
            currentnode.isVisited = true;
            System.out.println(currentnode.name+" ");
            ArrayList<Graphnode> neighbors = getNeighbors(currentnode);
            for(Graphnode neighbor:neighbors){
                if(!neighbor.isVisited){
                    stack.push(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }
    public void dfs(){
        for(Graphnode node:nodelist){
            if(!node.isVisited){
                DFSVisited(node);
            }
        }

    }
    public void print(){
        for(int i=0;i<AdjacencyMatrix.length;i++){
            for(int j=0;j<AdjacencyMatrix[0].length;j++){
                System.out.println(AdjacencyMatrix[i][j]+" ");
            }

        }
    }
}
