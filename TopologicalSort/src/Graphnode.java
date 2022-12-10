import java.util.ArrayList;

    import java.util.ArrayList;

public class Graphnode {
    public String name;
    public int index;
    public boolean isVisite = false;

    public ArrayList<Graphnode> neighbors =new ArrayList<>();
    public Graphnode(String name,int index){
        this.name = name;
        this.index = index;
    }

}

