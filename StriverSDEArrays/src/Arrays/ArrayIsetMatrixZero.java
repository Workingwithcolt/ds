package Arrays;

public class ArrayIsetMatrixZero {
    public static void SetMAtrixZero(int[][] arr){
        int row = arr.length,column= arr[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(arr[i][j] == 0){
                    //firstly we are making to row to zero
                    for(int m=0;m<row;m++){
                        arr[m][j] = -1;
                    }
                    for(int n = 0;n<column;n++){
                        arr[i][n] = -1;
                    }
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(arr[i][j] == -1){
                    arr[i][j] = 0;
                }
            }
        }
    }
    public static void secondapproach(int[][] arr){
        int row  = arr.length;
        int column = arr[0].length;
        int[] dummy1 = new int[row];
        int[] dummy2 = new int[column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(arr[i][j] == 0){
                    dummy1[i] = 0;
                    dummy2[j] = 0;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(dummy1[i] == 0 || dummy2[j] == 0) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
        SetMAtrixZero(arr);
        int row = arr.length;
        int column = arr[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
