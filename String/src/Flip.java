public class Flip {
    public static char flip(char ch){
        return  (ch == '0') ? '1' : '0';
    }
    public static int getFlightWithStartingCharacter(String str,char expected){
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != expected){
                count++;
            }
            expected = flip(expected);
        }
        return count;
    }
    public static void main(String[] args) {
        String s ="0001010111";
    }
}
