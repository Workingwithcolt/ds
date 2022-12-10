public class RemoveCosecutiveCharacterwhichappearmorethanonce {
    public static void consecutiveappear(String s,int i,Character store,String news){
        if(i == s.length()){
            news += store;
            System.out.println(news);
            return;
        }
        if(store != s.charAt(i) && store != ' '){
            news+=store;
        }
        store = s.charAt(i);
        consecutiveappear(s,i+1,store,news);
    }
    public static void main(String[] args) {
        String s ="aaaabbbbccdd";
        Character newstring = ' ';
        String newstrings = " ";
        consecutiveappear(s,0,newstring,newstrings);
    }
}
