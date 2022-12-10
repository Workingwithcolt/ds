public class SpecificPair {
    static int findMAxValue (int N,int mat[][]){
        int maxValue = Integer.MIN_VALUE;
        for(int a = 0;a<N-1;a++){
            for(int b= 0;b<N-1;b++){
                for(int d = a+1;d<N;d++){
                    for(int e = b+1;b<N;b++){
                        if(maxValue < (mat[d][e] - mat[a][b])){
                            maxValue = mat[d][e] - mat[a][b];
                        }
                    }
                }
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int N = 2;
        int mat[][] = {{4,2},
                       {3,1}};
        System.out.println("Maximum value is+"+findMAxValue(N,mat));
    }
}
