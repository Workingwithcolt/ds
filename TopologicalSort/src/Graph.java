import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;

public class Graph {
    ArrayList<Graphnode> nodelist;

    public Graph(ArrayList<Graphnode> nodeList) {
        this.nodelist = nodeList;
    }

    public void addUndirectedEdge(int i, int j) {
        Graphnode first = nodelist.get(i);
        Graphnode second = nodelist.get(j);
        first.neighbors.add(second);
        second.neighbors.add(first);
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < nodelist.size(); i++) {
            s.append(nodelist.get(i).name + ":");
            for (int j = 0; j < nodelist.get(i).neighbors.size(); j++) {
                if (j == nodelist.get(i).neighbors.size() - 1) {
                    s.append((nodelist.get(i).neighbors.get(j).name));
                } else {
                    s.append((nodelist.get(i).neighbors.get(j).name) + " ->");
                }
            }
            s.append("\n");
        }
        return s.toString();
    }
    void bfsVisit(Graphnode node){
        LinkedList<Graphnode> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            Graphnode currentNode = queue.remove(0);
            currentNode.isVisite = true;
            System.out.println(currentNode.name+" ");
            for(Graphnode neighbor: currentNode.neighbors){
                if(!neighbor.isVisite){
                    queue.add(neighbor);
                    neighbor.isVisite = true;
                }

            }
        }
    }
    public void bfs(){
        for(Graphnode node:nodelist){
            if(!node.isVisite){
                bfsVisit(node);
            }
        }
    }

    void dfsVisite(Graphnode node){
        Stack<Graphnode> stack =new Stack<Graphnode>() ;
        stack.push(node);
        while(!stack.isEmpty()){
            Graphnode currentnode = stack.pop();//here the pop method remove the top element from the stack
            currentnode.isVisite = true;
            System.out.print(currentnode.name+" ");
            for(Graphnode neighbor: currentnode.neighbors){
                if(!neighbor.isVisite){
                    stack.push(neighbor);
                    neighbor.isVisite = true;
                }
            }
        }
    }

    void dfs(){
        for(Graphnode node: nodelist){
            if(!node.isVisite){
                dfsVisite(node);
            }
        }
    }
    public void addDirectedEdge(int i,int j){
        Graphnode first =  nodelist.get(i);
        Graphnode second = nodelist.get(j);
        first.neighbors.add(second);
    }
    void topologicalVisit(Graphnode node,Stack<Graphnode> stack){
        for(Graphnode  neighbor:node.neighbors){
            if(!neighbor.isVisite){
                topologicalVisit(neighbor,stack);
            }
        }
        node.isVisite = true;
        stack.push(node);
    }
    void topologicalSort(){
        Stack<Graphnode> stack = new Stack<>();
        for(Graphnode node:nodelist){
            if(!node.isVisite){
                topologicalVisit(node,stack);
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop().name+" ");
        }
    }
}

