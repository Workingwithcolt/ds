package GraphAdjacencyList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Graphnode> nodelist = new ArrayList<Graphnode>();
        nodelist.add(new Graphnode("A",0));
        nodelist.add(new Graphnode("B",1));
        nodelist.add(new Graphnode("C",2));
        nodelist.add(new Graphnode("D",3));
        nodelist.add(new Graphnode("E",4));
        Graph g = new Graph(nodelist);
        g.addUndirectedEdge(0,1);
        g.addUndirectedEdge(0,2);
        g.addUndirectedEdge(0,3);
        g.addUndirectedEdge(1,4);
        g.addUndirectedEdge(2,3);
        g.addUndirectedEdge(3,4);
        System.out.println(g.toString());

    }
}
