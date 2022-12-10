import java.util.ArrayList;
import java.util.List;

public class WordwrapB {
    public static boolean wordwrap(String s, List<String> list){
        boolean[] dp =new boolean[s.length()];
        int n = dp.length;
        dp[0] = true;//base condition we say that is the true
        for(int len = 0;len<s.length();len++){
            for(int i=0;i<len;i++){
                if(dp[i] && list.contains(s.substring(i,len))){
                    dp[len] = true;
                    break;
                }
            }
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("c");
        list.add("od");
        list.add("e");
        list.add("x");
        System.out.println(wordwrap("code",list));
    }
}
