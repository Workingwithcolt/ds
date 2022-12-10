import java.util.Arrays;

public class SortMatrix {
    static int SIZE = 10;
    static void SortMat(int[][] mat,int n){
        int[] temp = new int[mat.length*mat[0].length];
        int k=0;
        for(int i=0;i< mat.length;i++){
            for(int j=0;j< mat[0].length;j++) {
                temp[k] = mat[i][j];
                k++;
            }
        }
        Arrays.sort(temp);
        k = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j< mat[0].length;j++){
                mat[i][j] =temp[k];
                k++;
            }
        }
    }
    static void printArray(int[][] mat,int n){
        for(int i=0;i< mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat = {{4,3,2,1},
                       {8,7,6,44},
                       {12,11,10,23}};
        int n = mat[0].length;
        System.out.println("n"+n+"column"+mat.length);
        System.out.println("Original matrix:");
        printArray(mat,n);
        System.out.println("sorted");
        SortMat(mat,n);
        printArray(mat,n);
    }
}
