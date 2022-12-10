package GraphAdjacencyMatrix;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Grapphnode> nodeList = new ArrayList<Grapphnode>();
        nodeList.add(new Grapphnode("A",0));
        nodeList.add(new Grapphnode("B",1));
        nodeList.add(new Grapphnode("C",2));
        nodeList.add(new Grapphnode("D",3));
        nodeList.add(new Grapphnode("E",4));
        Graph g= new Graph(nodeList);
        g.addUndirectedEdge(0,1);
        g.addUndirectedEdge(0,2);
        g.addUndirectedEdge(0,3);
        g.addUndirectedEdge(2,3);
        g.addUndirectedEdge(2,0);
        g.addUndirectedEdge(3,0);
        g.addUndirectedEdge(3,2);
        g.addUndirectedEdge(3,4);
        g.addUndirectedEdge(4,1);
        g.addUndirectedEdge(4,3);
        g.addUndirectedEdge(1,4);
        g.addUndirectedEdge(1,3);
        g.print();

    }
}
