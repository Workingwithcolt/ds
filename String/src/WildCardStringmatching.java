public class WildCardStringmatching {
    public static void Stringmatching(String s,String exactstring){
        int j = 0;
        int store = 0;
        int i = 0;
        while(j < exactstring.length()){
            if(exactstring.charAt(j) == s.charAt(i)){
                if(store != 0) {
                    System.out.println(exactstring.substring(store ,j));
                }
                store =0;
                i++;
                j++;
            }else if(s.charAt(i) == '?' || s.charAt(i) == '*'){
                store = i;
                if(i+1 == s.length()){
                    System.out.println(exactstring.substring(i,exactstring.length()));
                    break;
                }
                i++;
            }else{

                j++;
            }
        }
    }

    public static void main(String[] args) {
        String s = "ge?ks*";
        String exact = "geeksforgeeks";
       Stringmatching(s,exact);
    }
}
