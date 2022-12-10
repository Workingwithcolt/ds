import java.util.HashMap;
import java.util.HashSet;

public class allsequenceB {
    static HashSet<String> s1 = new HashSet<>();
    static void subsequence(String str){
        for(int i=0;i<str.length();i++){
            for(int j=str.length();j>i;j--){

                String sub_str = str.substring(i,j);//(0,4)
                if(!s1.contains(sub_str)){
                    s1.add(sub_str);//[aabb,]
                }//k = 1 k<=2
                for(int k = 1;k<sub_str.length()-1;k++){
                    StringBuilder sb =new StringBuilder(sub_str);
                    sb.deleteCharAt(k);//aabb = ab
                    System.out.println(sb.toString());
                    if(!s1.contains(sb));
                    subsequence(sb.toString());
                }
            }
        }
    }

    public static void main(String[] args) {
        subsequence("aabb");
        System.out.println(s1);
    }
}
