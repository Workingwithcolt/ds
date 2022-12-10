public class EditDistance {
    static int min(int x, int y, int z) {
        if (x <= y && x <= z) {
            return x;
        }
        if (y <= x && y <= z) {
            return y;
        }else{
        return z;
    }
}
static int editDistance(String str1,String str2,int m,int n){
        if( m == 0){
            return n;
        }
        if(n == 0){
            return m;
        }
        if(str1.charAt(m-1) == str2.charAt(n-1)){
            return editDistance(str1,str2,m-1,n-1);
        }
        return 1 +
                min(editDistance(str1,str2,m,n-1),
                        editDistance(str1,str2,m-1,n)
                        ,editDistance(str1,str2,m-1,n-1));
}
public static void EditDistanceB(String str1,String str2){
        int len1 = str1.length();
        int len2 = str2.length();
        int[][] Dp = new int[2][len1+1];
        for(int i=0;i<=len1;i++){
            Dp[0][i] = i;
        }
        for(int i=1;i<=len2;i++){
            for(int j=0;j<=len1;j++){
                if(j == 0){
                    Dp[i%2][j] = i;
                }else if(str1.charAt(j-1) == str2.charAt(i-1)){
                    Dp[i%2][j] = Dp[(i-1)%2][j-1];
                }else{
                    Dp[i%2][j] = 1+Math.min(Dp[(i-1)%2][j],Math.min(Dp[i%2][j-1],Dp[(i-1)%2][j-1]));
                }
                System.out.print(Dp[len2%2][len1]+"\n");
            }
        }
}
public static void main(String[] args){
        String str1 ="abc";
        String str2 = "aa";
    System.out.println(editDistance(str1,str2,str1.length(),str2.length()));
    System.out.println(1%2);
    EditDistanceB("ab","aa");
}
}
