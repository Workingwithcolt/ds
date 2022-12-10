public class Longestcommonsubsequence {
    private int findLongestcommon(String s1,String s2,int i1,int i2){
        if(i1 == s1.length() || i2 == s2.length()){
            return 0;
        }
        int c1= 0;
        if(s1.charAt(i1) == s2.charAt(i2) ){
            c1 = 1+ findLongestcommon(s1,s2,i1+1,i2+1);
        }
            int op1 = findLongestcommon(s1,s2,i1,i2+1);
            int op2 = findLongestcommon(s1,s2,i1+1,i2);
            return Math.max(c1,Math.max(op1,op2));
    }
    public int findLCS(String s1,String s2){
        return findLongestcommon(s1,s2,0,0);
    }

    public static void main(String[] args) {
        Longestcommonsubsequence l = new Longestcommonsubsequence();

        System.out.println(l.findLCS("BDCABA","ABCBDAB"));
    }
}
