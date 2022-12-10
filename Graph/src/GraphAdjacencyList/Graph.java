package GraphAdjacencyList;
import java.util.ArrayList;
public class Graph {
    ArrayList<Graphnode> nodelist ;
    public Graph(ArrayList<Graphnode> nodeList){
        this.nodelist = nodeList;
    }

    public void addUndirectedEdge(int i,int j){
        Graphnode first = nodelist.get(i);
        Graphnode second = nodelist.get(j);
        first.neighbors.add(second);
        second.neighbors.add(first);
    }
    public String toString(){
        StringBuilder s = new StringBuilder();
        for(int i=0;i<nodelist.size();i++){
            s.append(nodelist.get(i).name+":");
            for(int j=0;j<nodelist.get(i).neighbors.size();j++){
                if(j == nodelist.get(i).neighbors.size()-1) {
                    s.append((nodelist.get(i).neighbors.get(j).name));
                }else{
                    s.append((nodelist.get(i).neighbors.get(j).name)+" ->");
                }
            }
            s.append("\n");
        }
        return s.toString();
    }

}
