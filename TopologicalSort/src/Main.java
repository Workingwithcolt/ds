import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Graphnode> nodelist = new ArrayList<>();
        nodelist.add(new Graphnode("A",0));
        nodelist.add(new Graphnode("B",1));
        nodelist.add(new Graphnode("C",2));
        nodelist.add(new Graphnode("D",3));
        nodelist.add(new Graphnode("E",4));
        nodelist.add(new Graphnode("F",5));
        nodelist.add(new Graphnode("G",6));
        nodelist.add(new Graphnode("H",7));
        Graph g = new Graph(nodelist);
        g.addDirectedEdge(0,2);
        g.addDirectedEdge(2,4);
        g.addDirectedEdge(4,7);
        g.addDirectedEdge(4,5);
        g.addDirectedEdge(5,6);
        g.addDirectedEdge(1,2);
        g.addDirectedEdge(1,3);
        g.addDirectedEdge(3,5);
        System.out.println(g.toString());
        g.topologicalSort();


    }
}

