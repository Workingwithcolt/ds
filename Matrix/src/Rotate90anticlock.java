public class Rotate90anticlock {
    static void rotateMatrix(int N,int[][] mat){
        for(int x=0;x<N/2;x++){
            for(int y = x;y<N-x-1;y++){
                int temp = mat[x][y];
                mat[x][y] = mat[y][N-1-x];
                mat[y][N-1-x] = mat[N-1-x][N-1-y];
                mat[N-1-x][N-1-y] = mat[N-1-y][x];
                mat[N-1-y][x] =temp;
            }
        }
    }
}
