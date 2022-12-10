public class Sayandcount {
    //1
    //11
    //21
    //1211
    //111221
    //
    public static String say(int n){
        if(n == 1){return "1";}
        if(n == 2){ return "11";}
        String currentword = "11";
        String newword = " ";
        int count = 0;
        for(int l = 2;l<=n;l++){
        for(int j = 0;j<currentword.length();j++) {
            for (int i = 0; i < currentword.length(); i++) {
                if (currentword.charAt(j) == currentword.charAt(i)) {
                    count += 1;
                }                if (currentword.charAt(j) != currentword.charAt(i + 1)) {
                    newword += String.valueOf(count);
                    newword += String.valueOf(currentword.charAt(j));
                    System.out.println(newword);
                    break;
                }
            }
        }
        currentword = newword;
        }
        return currentword;
    }
    public static void main(String[] args) {
        System.out.println(say(2));
    }
}
