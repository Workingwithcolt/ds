
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SimpleSmallestWindowthatcotainallcharacterofstring {
    public  static String CreateWindow(String s){
        Set<Character> distinct =new HashSet<>();
        for(int i=0;i<s.length();i++){
            distinct.add(s.charAt(i));
        }
        int sizeofdistinct = distinct.size();
        boolean istrue = true;
        Set<Character> counter =new HashSet<>();
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0,j;
        for( j = 0;j<s.length();j++){
            if(map.containsKey(s.charAt(j))){
                int count  = map.get(s.charAt(j));
                count+=1;
                map.put(s.charAt(j),count);
            }else{
                map.put(s.charAt(j),1);
            }
            counter.add(s.charAt(j));
            if(counter.size() == sizeofdistinct){
                while(istrue && counter.size() == sizeofdistinct){
                    if(map.containsKey(s.charAt(i))){
                        int decrease = map.get(s.charAt(i));
                        decrease = decrease-1 ;
                        map.put(s.charAt(i),decrease);
                        if(decrease == 0){
                            counter.remove(s.charAt(i));
                            i+=1;
                            System.out.println(counter.size()+"countersizewhile");
                            break;
                        }
                    }
                    i++;
                }
            }
            System.out.println(counter.size());
        }
        return s.substring(i-1,j);
    }

    public static void main(String[] args) {
        System.out.println(CreateWindow(""));
    }
}
