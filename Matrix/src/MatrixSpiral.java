import java.util.ArrayList;
import java.util.List;

public class MatrixSpiral {
    static void print(int [][] arr,int i,int j,int m,int n){
        //here the m = number of column
        //here n = number of rows
        if(i>= m || j>= n){
            return;
        }
        for(int p = i;p<n;p++){
            System.out.println(arr[i][p]+" ");
        }
        for(int p = i+1;p<m;p++){
            System.out.println(arr[p][n-1]+" ");
        }
        if((m-1) != i){
            for(int p = n-2;p>=j;p--) {
                System.out.println(arr[m-1][p]+" ");
            }
        }
        if((n-1) != j){
            for(int p =m-2;p>i;p--){
                System.out.println(arr[p][j]+" ");
            }
        }
        print(arr,i+1,j+1,m-1,n-1);
    }

    public static void main(String[] args) {
        int[][] s = {{1,2,3,4,},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        print(s,0,0,4,4);
    }
}
