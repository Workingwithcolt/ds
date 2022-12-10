package Tim;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private  String name;
    private int hitPoints;
    private int strength;
    public Player(String name,int hitPoints,int strength){
        this.name =name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    public List<String> write(){
        List<String> values = new ArrayList<String>();
        values.add(0,this.name);
        values.add(1,""+this.hitPoints);
        values.add(2,""+this.strength);
        return values;
    }
    public void read(List<String> solvedValues){
        if(solvedValues != null && solvedValues.size()>0){
            this.name = solvedValues.get(0);
            this.hitPoints = Integer.parseInt(solvedValues.get(1));
            this.strength = Integer.parseInt(solvedValues.get(2));
        }
    }
}
