public class SortMatrixYoungTablue {
    static final int INF = Integer.MAX_VALUE;
    static final int N = 4;
    static void youngify(int mat[][],int i,int j){
        int downVal;
        if(i+1<N){
            downVal =  mat[i+1][j];
            System.out.println("i+1<N"+downVal);
        }else{
            downVal =  INF;
            System.out.println("else i+1<N"+downVal);
        }
        int rightVal;
        if(j+1 < N){
            rightVal = mat[i][j+1];
            System.out.println("rightValue"+mat[i][j+1]);
        }else{
            rightVal = INF;
            System.out.println("else rightval"+rightVal);
        }
        if(downVal == INF && rightVal == INF){
            System.out.println("downVal == INF && rightVal == INF");
            return ;
        }
        if(downVal < rightVal){
            System.out.println("downVal<rightValue");
            System.out.println("i"+i+"j"+j);
            mat[i][j] = downVal;
            mat[i+1][j] = INF;
            youngify(mat,i+1,j);
        }else{
            System.out.println("downValue<rightValue of else");
            System.out.println("i"+i+"j"+j);
            System.out.println("rightValue"+rightVal);
            mat[i][j] = rightVal;
            mat[i][j+1] = INF;
            youngify(mat,i,j+1);
        }
    }
    static int extractMin(int[][] mat){
        int ret = mat[0][0];
        System.out.println("mat[0][0]"+ret);
        mat[0][0] =INF;
        System.out.println("mat[0][0]"+mat[0][0]);
        youngify(mat,0,0);
        return ret;
    }
    static void printSorted(int mat[][]){
        System.out.println("Element of matrix in sorted order");
        for(int i=0;i<N*N;i++){
            System.out.println(extractMin(mat)+" ");
        }
    }

    public static void main(String[] args) {
        int[][] mat ={{10,20,30,40}
                      ,{15,25,35,45},
                       {27,29,37,48},
                       {32,33,39,50}};
        printSorted(mat);
        for(int i=0;i< mat[0].length;i++){
            for(int j=0;j<mat.length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
