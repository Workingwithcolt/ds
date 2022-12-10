package Arrays;

public class ROTATEIMAGEBY90 {
    public static void RotateImage(int[][] arr,int[][] newarray){
        int row = arr.length;
        int column = arr[0].length;

        if(row == column){//here we are checking the matrix is square matrix
            for(int i=0;i<row;i++){
                for(int j=0;j<column;j++){
                    newarray[j][column-1-i] = arr[i][j];//here we are assigning the value of row to the
                    //column of the another new array
                }
            }
        }
    }
    public static void SecondApproch(int[][] arr){
        int row = arr.length;
        int column = arr[0].length;
        for(int i=0;i<row;i++){
            for(int j=i;j<column;j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }//here we start j from i because when we start j from 0 it will again reachnge the element
            //which we already change
        }
        for (int i=0;i<row;i++){
            for(int j=0;j<=column/2;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][column-1-j];
                arr[i][column-1-j]= temp;
            }
        }
        for (int[] el:arr) {
            for(int e:el){
                System.out.print(e);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] newarray = new int[arr.length][arr[0].length];
        RotateImage(arr,newarray);
        SecondApproch(arr);
    }
}
