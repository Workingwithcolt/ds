import java.util.HashMap;
import java.util.Map;

public class DuplicateB {
    static HashMap<Character,Integer> map = new HashMap<>();
    public  static void Duplicate(String str){
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        for(Map.Entry el:map.entrySet()){
            int val = map.get(el.getKey());
            System.out.println("val"+val);
            System.out.println("el"+el);
            if(val > 1){
                System.out.println("Character:"+el);
            }
        }
    }

    public static void main(String[] args) {
        String str = "aab";
        Duplicate(str);
    }
}
