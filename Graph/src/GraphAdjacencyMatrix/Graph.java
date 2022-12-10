package GraphAdjacencyMatrix;

import java.util.ArrayList;

public class Graph {
    ArrayList<Grapphnode> nodeList;
    int[][] AdjacencyMatrix;
    int p = 0;
    public Graph(ArrayList<Grapphnode> nodeList){
        this.nodeList = nodeList;
        AdjacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }
    public void addUndirectedEdge(int i,int j){
        AdjacencyMatrix[i][j] = 1;//here we set the Adjacency matrix = 1 that represent the edge when we represent
        //it by one we are creating the egde from the i to j and j to i
        AdjacencyMatrix[j][i] = 1;
        }
    void print(){
        for(int i=0;i<=5;i++){
            for(int j=0;j<=5;j++){
                System.out.println(AdjacencyMatrix[i][j]+" ");
            }
            System.out.println();
        }

    }

}
