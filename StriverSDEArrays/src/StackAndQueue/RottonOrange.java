package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
public class RottonOrange {
    static class Pair{
        int row;
        int col;
        int tm;
        Pair(int row,int col,int tm){
            this.row = row;
            this.col= col;
            this.tm = tm;
        }
    }
    public static int  MinimumTimetoRottenOrange(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        int[][] vts = new int[n][m];
        int cntFresh = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 2){
                    q.add(new Pair(i,j,0));
                    vts[i][j] = 2;
                }else{
                    vts[i][j]= 0;//here we are taking the initial value i.e 0
                }
                if(grid[i][j] == 1){
                    cntFresh++;
                }
            }
        }
        int tn =   0;
        int[] drow = {-1,0,1,0};//here we are taking the four direction in the row
        int[] dcol = {0,1,0,-1};//here we are taking the four direction in the column
        while(!q.isEmpty()){
            int row = q.peek().row;
            int col = q.peek().col;
            int t = q.peek().tm;
            tn = Math.max(tn,t);
            q.remove();
            for(int i=0;i<4;i++){
                int nrow = row+drow[i];
                int ncol = col+dcol[i];
                if(nrow>=0 && nrow < n && ncol >= 0 && ncol < m
                        && vts[nrow][ncol] != 2 && grid[nrow][ncol] == 1){
                    q.add(new Pair(nrow,ncol,tn+1));
                    vts[nrow][ncol] = 2;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vts[i][j] != 2 && grid[i][j] == 1){
                    return -1;
                }
            }
        }
        return tn;
    }
    public static void main(String[] args){
//        int[][] arr = {{1,1,1},{1,1,0},{1,1,1}};
//        System.out.println(MinimumTimetoRottenOrange(arr,0,0,0));

    }
}
