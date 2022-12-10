import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class CountPalindromingSubsequence {
    public static boolean check(String a){
        int n = a.length()-1;
        for(int i =0;i<a.length()/2;i++){
            if(a.charAt(i) == a.charAt(n)){
                n--;
            }else{
               return false;
            }
        }
        return true;
    }
    public static String Divide(String word, Set<String> map, Map<String,String> check){
        if(check.containsKey(word)){
            return check.get(word);
        }
        if(word == " "){
            return " ";
        }
        for(int i=1;i<word.length();i++) {
            System.out.println(word.substring(0,i));
            if(check(word.substring(0,i))) {
                map.add(word.substring(0,i));
                System.out.println("done");
            }
            check.put(word.substring(0,i),word.substring(0,i));
            Divide(word.substring(i, word.length()),map,check);
        }
        return null;
    }
    public static void main(String[] args) {
        String a = "aaa ";
        Set<String> map = new HashSet<>();
        Map<String ,String> check = new HashMap<>();
        Divide(a,map,check);
        for(String el:map){
            System.out.println(el);
        }
        System.out.println("......................");
        for(String el:map){
            System.out.println(el);
        }
        System.out.println("------------");
        for(Map.Entry el:check.entrySet()){
            System.out.println(el.getKey());
        }
    }
}