public class SpecificPairB {
    static int findMaxValue(int N,int mat[][]){
        int maxValue = Integer.MIN_VALUE;
        int maxArr[][] = new int[N][N];
        maxArr[N-1][N-1] = mat[N-1][N-1];
        System.out.println("maxArr[N-1][N-1]"+maxArr[N-1][N-1]);
        int maxv = mat[N-1][N-1];
        for(int j=N-2;j>=0;j--){
            System.out.println("mat[N-1][j]"+mat[N-1][j]);
            if(mat[N-1][j] > maxv){
                maxv = mat[N-1][j];
            }
            System.out.println("in else mat[N-1][j]"+mat[N-1][j]);
            maxArr[N-1][j] = maxv;
        }
        maxv = mat[N-1][N-1];
        for(int i=N-2;i>=0;i--){
            if(mat[i][N-1] > maxv){
                maxv =mat[i][N-1];
            }
            maxArr[i][N-1] = maxv;
        }
        for(int i=N-2;i>=0;i--) {
            for (int j = N - 2; j >= 0; j--) {
                if (maxArr[i + 1][j + 1] - mat[i][j] > maxValue) {
                    maxValue = maxArr[i + 1][j + 1] - mat[i][j];
                }
                maxArr[i][j] = Math.max(mat[i][j], Math.max(maxArr[i][j + 1],maxArr[i+1][j]));
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int N =3;
        int[][] arr ={{1,2,3},
                {4,5,6},
                {7,8,9}};
        System.out.println("maximum value"+findMaxValue(N,arr));

    }
}
