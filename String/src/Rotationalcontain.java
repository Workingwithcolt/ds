import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Rotationalcontain {
    static boolean areRotations(String str1,String str2){
        return (str1.length() == str2.length() && (str1+str1).indexOf(str2) != -1);
    }
    static boolean check_rotation(String s,String goal){
        if(s.length() != goal.length()){
            return false;
        }else{
            Queue<Character> q1 = new LinkedList<>();
            for(int i=0;i<s.length();i++){
                q1.offer(s.charAt(i));
            }
            Queue<Character> q2 = new LinkedList<>();
            for(int i=0;i<goal.length();i++){
                q2.offer(goal.charAt(i));
            }
            int k = goal.length();
            while(k>0){
                char ch = q2.peek();
                q2.poll();
                q2.offer(ch);
                System.out.println(q1);
                System.out.println(q2);
                if(q1.equals(q2)){
                    return true;
                }
                k--;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        String str1 = "AACD";
        String str2 = "ACDA";
        System.out.println(check_rotation(str1,str2));
    }
}
