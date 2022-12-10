import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SmallestWindowthatcotainallcharacterofstring {
    public static boolean distinct(String st){
        Set<Character> s =new HashSet<>();
        for(int i=0;i<st.length();i++){
            s.add(st.charAt(i));
        }
        if(s.size() == st.length()){
            return true;
        }else{
            return false;
        }
    }
    public static void  dfs(String s,HashMap<String,Integer> map,int len){
        if(s.equals(" ")){
            return;
        }
        if(s.length() < len){
            return;
        }
        for(int i=1;i<=s.length();i++) {
            dfs(s.substring(i, s.length()), map, len);
            if (s.substring(0, i).length() == len) {
                if (distinct(s.substring(0, i))) {
                    map.put(s.substring(0, i), s.substring(0, i).length());
                }
            }
        }
    }
    public static void main(String[] args) {
        String s = "aaab";
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        HashMap<String,Integer> str = new HashMap<>();
        dfs(s,str,set.size());
        for(Map.Entry<String,Integer> el:str.entrySet()){
            System.out.println(el.getKey());
        }
    }
}
