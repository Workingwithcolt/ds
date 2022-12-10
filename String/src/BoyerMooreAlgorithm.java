import java.util.HashMap;
import java.util.Map;

public class BoyerMooreAlgorithm {
    public static boolean check(int start,int end,String word1,String word2){
        String s = word2.substring(0,end);
        if(s.contains(word1)){
            return true;
        }else{
            return false;
        }
    }
    //pattern Searching in the Sentence
    public static  boolean Search(String patter,String Searchingsentence){
        Map<Character,Integer> map =new HashMap<>();
        int[] arr = new int[patter.length()];
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(patter.charAt(i))){
                int count = patter.length()-i-1;
                if(i == arr.length-1){
                    count = arr.length;
                }
                map.put(patter.charAt(i),count);
            }else{
                int count = patter.length()-i-1;
                if(i == arr.length-1){
                    count = arr.length;
                }
                map.put(patter.charAt(i),count);
            }
        }
        for(int i=0;i<patter.length();i++){
            if(map.containsKey(patter.charAt(i))){
                int value = map.get(patter.charAt(i));
                arr[i] =value;
            }
        }
        int start = 0;
        int end = Searchingsentence.length();
        System.out.println(end);
        int i=patter.length()-1;
        int start_second = i;
        int store = 0;
        for(int j=0;j<Searchingsentence.length();j++){
            System.out.println(patter.charAt(i)+"pattern"+i);
            System.out.println(Searchingsentence.charAt(start+start_second)+"Searchingsentence"+(start+start_second));
            if(patter.charAt(i) == Searchingsentence.charAt(start+start_second)
                    && check(i,start+start_second+1,patter,Searchingsentence)){
//                if(check(i,start+start_second,patter,Searchingsentence)) {
//                    return true;
//                }else{
//                    continue;
//                }
                return true;
            }else {
                if(map.get(Searchingsentence.charAt(start+start_second)) == null){
                    store = start;
                    start = map.get(patter.charAt(patter.length()-1));
                    System.out.println("start"+start);
                }else{
                    store = start;
                    start = map.get(Searchingsentence.charAt(start+start_second));
                    System.out.println("else start"+start);
                }
            }
            start_second += store;
        }
        return false;
        }


    public static void main(String[] args) {
        String p = "SUNIL";
        System.out.println(p.charAt(p.length()-1));
        String sentence ="CHETANSUNILMOHITE";
        System.out.println(Search(p,sentence));
    }
}
