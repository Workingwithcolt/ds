public class Dublicate {
    static final int NO_OF_CHAR = 256;
    static void fillCharCounts(String str,int[] count){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
            count[str.charAt(i)]++;
            System.out.println(count[str.charAt(i)]);
        }
    }
    static void printDups(String str){
        int count[] = new int[NO_OF_CHAR];
        fillCharCounts(str,count);
        for(int i=0;i<NO_OF_CHAR;i++){
            if(count[i] > 1){
                System.out.println((char)(i) +",count"+count[i]);
            }
        }
    }

    public static void main(String[] args) {
        String s = "peek";
        printDups(s);
    }
}
