import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Kruskal {
    ArrayList<WeightedNode> nodeList = new ArrayList<WeightedNode>();
    ArrayList<UndirectedEdge> edgelist = new ArrayList<UndirectedEdge>();
    public Kruskal(ArrayList<WeightedNode> nodeList){
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

    void Kruskal(){
        Disjoint.makeSet(nodeList);
        Comparator<UndirectedEdge> comparator =new Comparator<UndirectedEdge>() {
            @Override
            public int compare(UndirectedEdge o1, UndirectedEdge o2) {
                return o1.weight - o2.weight;
            }
        };
        Collections.sort(edgelist,comparator);
        int cost = 0;
        for(UndirectedEdge edge:edgelist){
            WeightedNode first = edge.first;
            System.out.println(first.name+" s name");
            first.set.printAllnodesThisset();
            WeightedNode second = edge.second;
            System.out.println("f name "+second.name);
            second.set.printAllnodesThisset();
            boolean v = (!Disjoint.findset(first).equals(Disjoint.findset(second)));
            System.out.println("valueL : "+v);
            System.out.println("Disjoint.findset(second):"+Disjoint.findset(second));
            if(!Disjoint.findset(first).equals(Disjoint.findset(second))){
                //here both are not equal that is for eg A and B which does not equal that mean A is not present in the
                //set of B there for we Union them to get disjoint set
                Disjoint.union(first,second);
                cost += edge.weight;
                System.out.println("Taken "+edge);
            }
        }
        System.out.println("Total cost of Minimum Spanning Tree"+cost);
    }
}
