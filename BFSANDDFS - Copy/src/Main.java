import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Graphnode> nodeList = new ArrayList<Graphnode>();
        nodeList.add(new Graphnode("A",0));
        nodeList.add(new Graphnode("B",1));
        nodeList.add(new Graphnode("C",2));
        nodeList.add(new Graphnode("D",3));
        nodeList.add(new Graphnode("E",4));
        Graph g= new Graph(nodeList);
        g.addUndirectedEdge(0,1);
        g.addUndirectedEdge(0,2);
        g.addUndirectedEdge(0,3);
        g.addUndirectedEdge(1,4);
        g.addUndirectedEdge(2,3);
        g.addUndirectedEdge(3,4);
        g.print();
        g.dfs();
    }

}
