import java.util.*;

public class WordBreak {

    public static boolean dfs(String s, Set<String> set, HashMap<String,Boolean> map){
        if(map.containsKey(s)){
            return map.get(s);
        }
        if(s.equals(" ")){
            return true;
        }
        for(int i=1;i<=s.length();i++){
            if(set.contains(s.substring(0,i)) && dfs(s.substring(i,s.length()),set,map)){
                map.put(s.substring(i),true);
                return true;
            }
        }
        return false;
    }
    static boolean wb(String s, List<String> list){
        Set<String> set = new HashSet<>();
        for(String l:list){
            set.add(l);
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "achj";
        List<String> list = new ArrayList<>();
        list.add("mobile");
        list.add("samsung");
        list.add("sam");
        list.add("mango");
        list.add("i");
        list.add("like");
        list.add("ice");
        list.add("creame");
        list.add("and");
        list.add("man");
        System.out.println(wb("ilikesamsung",list));
    }
}
