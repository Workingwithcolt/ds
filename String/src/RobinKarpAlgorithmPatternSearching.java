public class RobinKarpAlgorithmPatternSearching {
    public  static int modASCIL(String word,int M){
        int total = 0;
        for(int i=0;i<word.length();i++){
            int ch = word.charAt(i);
            total += ch;
        }
        return total%M;
    }
    public static int patternSearching(String pat,String word){
        int numberofpatternrepeat = 0;
        int pattern = modASCIL(pat,256);
        for(int i=0;i<word.length()-1;i++){
        int c = modASCIL(word.substring(i,i+2),256);
        if(c == pattern){
            numberofpatternrepeat++;
        }
        c = 0;
        }
        return numberofpatternrepeat;
    }

    public static void main(String[] args) {
        String e = "MynameMynameMyname";
        String pat = "My";
        System.out.println(modASCIL("eee",256));
        System.out.println(patternSearching(pat,e));
    }
}
