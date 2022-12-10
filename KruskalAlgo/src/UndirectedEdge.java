public class UndirectedEdge {
    public WeightedNode first;
    public  WeightedNode second;
    public int weight;
    public UndirectedEdge(WeightedNode first,WeightedNode second,int weight){
        this.first = first;
        this.second = second;
        this.weight = weight;
    }

    @Override
    //for letting know the nodes that contain in the edge
    public String toString() {
        return "UndirectedEdge{" +
                "first=" + first +
                ", second=" + second +
                ", weight=" + weight +
                '}';
    }
}
