import java.util.ArrayList;
public class Team<S extends Player>{//here the T stand for any Class
    private String name;
    int win = 0;
    int lost = 0;
    int tied = 0;
    public ArrayList<S> members = new ArrayList();

    public Team(String name) {
        this.name = name;
    }
    public boolean addPlayer(S player){
        if(members.contains(player)){
            System.out.println(player.getName()+"is already present in the list");

            return false;
        }else{
            members.add(player);
            System.out.println(player.getName()+"picked for team"+this.name);
            return true;
        }
    }
    public int numberPlayer(ArrayList<S> members){
        return members.size();
    }
}