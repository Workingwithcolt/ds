import java.util.HashMap;
import java.util.Map;

public class Trienode {
    boolean endofString;
    public Map<Character,Trienode> children;
    public int repeat =0;
    public Trienode(){
        this.children = new HashMap<>();
        this.endofString = false;
    }
}
