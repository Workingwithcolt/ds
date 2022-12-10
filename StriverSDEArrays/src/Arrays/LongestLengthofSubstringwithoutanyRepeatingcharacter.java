package Arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestLengthofSubstringwithoutanyRepeatingcharacter {
    public static int  LongestSubstring(String str){
        Set<Character> set =new HashSet<>();
        int counter = 0;
        int maximumlength = Integer.MIN_VALUE;
        for(int i=0;i<str.length();i++){
            if(!set.contains(str.charAt(i))){
                set.add(str.charAt(i));
                counter++;
                if(maximumlength<counter){
                    maximumlength = counter;
                }
            }else{
                counter =0;
                set = new HashSet<>();
            }
        }
        return maximumlength;
    }

    public static void main(String[] args) {
        String s = "";
        System.out.println(LongestSubstring(s));
    }
}
