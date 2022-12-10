import java.util.ArrayList;
import java.util.List;

public class allsubsquenceString {
    static List<String> al =new ArrayList<>();
    private static void findSubsequence(String s,String ans){
        if(s.length() == 0){
            al.add(ans);
            return;
        }
        findSubsequence(s.substring(1),ans+s.charAt(0));
        findSubsequence(s.substring(1),ans);//ab
        //find(a,b)//find(0,ab)
        //find()
    }
    public static void main(String[] args) {

    }
}
