import java.util.*;

public class MinimumnumberofCoin {
    public static void main(String[] args){
        String lexigographyString = "ccab";
        Set<Character> set =new HashSet<>();
       for(int i=0;i<lexigographyString.length();i++){
           set.add(lexigographyString.charAt(i));
       }
       Queue<Character> unique = new LinkedList<>();
       int current = 0;
       for(Character e:set){
        unique.add(e);
       }
       char[] c = lexigographyString.toCharArray();
       for(int i=0;i<c.length;i++){
           if(unique.isEmpty()){
               System.out.println("executte"+i);
               break;
           }
           char ch = unique.remove();//less value from the set

           if(ch < c[i]){//adcba  abcd
               char ch2 = c[i];//d
               for(int j=0;j<c.length;j++){
                   if(c[j] == ch2){
                       c[j] = ch;
                   }else if(lexigographyString.charAt(j) == ch){
                       c[j] = ch2;
                   }
               }
           }//ccba  abc
       }
        for (char e:c) {
            System.out.println(e);
        }
    }

}
