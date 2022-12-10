public class Rotate90 {
    static int N = 4;
    static void rotate90A(int[][] arr){
        for(int i=0;i<N;i++){
            for(int j = N-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
static void rotate(int[][] arr){
        int n = arr.length;
        for(int i=0;i<n;++i){
            for(int j=0;j<i;++j){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }//rotate about the diagonal
        for(int i=0;i<n;++i){
            for(int j=0;j<n/2;++j){
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-j-1];
                arr[i][n-i-1] = temp;
            }
        }
}
    public static void main(String[] args) {
        int arr[][] ={{1,2,3,4},
                      {5,6,7,8},
                      {9,10,11,12},
                {13,14,15,16}};
        rotate90A(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
