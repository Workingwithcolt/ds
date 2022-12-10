public class Simple{
    static int countPs(String str){
        int N = str.length();
        int[][] cps = new int[N][N];
        for(int i=0;i<N;i++){
            cps[i][i] = 1;
        }
        for(int l = 2;l<=N;l++){
            for(int i=0;i<=N-l;i++){
                int k = l+i-1;
                if(str.charAt(i) == str.charAt(k)){
                    cps[i][k] = cps[i][k-1]+cps[i+1][k] + 1 ;

                }else{
                    cps[i][k] = cps[i][k-1]+cps[i+1][k]-cps[i+1][k-1];
                }
            }
        }
        return cps[0][N-1];
    }

    public static void main(String[] args) {
        String s = "abcb";
        System.out.println(countPs(s));
    }
}
