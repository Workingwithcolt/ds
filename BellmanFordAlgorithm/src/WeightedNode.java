import java.util.ArrayList;
import java.util.HashMap;

public class WeightedNode implements Comparable<WeightedNode>{
    public String name;
    public ArrayList<WeightedNode> neighbors = new ArrayList<>();
    public HashMap<WeightedNode,Integer> weightMap = new HashMap<>();//it is created for cost of edge
    public boolean isVisited = false;
    public WeightedNode parent;
    public int distance;
    public int index;
    public WeightedNode(String name,int index){
        this.name = name;
        distance = Integer.MAX_VALUE;
        this.index = index;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(WeightedNode o) {//Comparable is implemented for Priority Queue
        return this.distance- o.distance;
    }
}
