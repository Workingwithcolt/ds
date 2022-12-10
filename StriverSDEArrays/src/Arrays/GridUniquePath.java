package Arrays;

public class GridUniquePath {
    public static int GridPath(int i,int j,int n ,int m,int[][] dp){
        if(i>=n || j>= m){
            return 0;
        }
        if(dp[i][j] != 0 ){
            System.out.println("executed");
            return dp[i][j];
        }
        if(i == n-1 && j == m-1){
            return 1;
        }
        return dp[i][j] = GridPath(i+1,j,n,m,dp)+GridPath(i,j+1,n,m,dp);
    }


    public static void main(String[] args) {
        int n = 4,m = 4;
        int[][] dp = new int[n+1][m+1];
        System.out.println(GridPath(0,0,n,m,dp));
        for (int[] e:dp) {
            for (int el:e) {
                System.out.print(el+" ");
            }
            System.out.println();
        }
    }
}
