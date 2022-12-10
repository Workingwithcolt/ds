import java.util.Scanner;

public class MaximumProductSubsetArray {
    public static long  MaximumProduc(int[] arr,int N){
        int largenegativevalue = 0;
        int negativecount = 0;
        for(int j=0;j<N;j++){
            if(arr[j]<0){
                negativecount++;
                largenegativevalue = j;
            }
        }
        long multiply = 1;
        if(negativecount % 2 == 0){
            multiply = 1;
            for(int c = 0;c<N;c++) {
                if (arr[c] == 0) {
                    continue;
                } else {
                    multiply *= arr[c];
                }
            }
        }else{
            //odd count then we want to remove the large element in negative form
            for (int m = 0;m<N;m++){
                if(arr[m] < 0){
//                    -8 -1
                    if(arr[largenegativevalue] < arr[m]){
                        largenegativevalue = m;
                    }
                }
            }
            multiply = 1;
            for(int k = 0;k<N;k++){
                if(arr[k] == arr[largenegativevalue]){
                    continue;
                }else if(arr[k] == 0){
                    continue;
                }else{
                    multiply *=arr[k];
                }
            }
        }
        return multiply;
    }
    public static void main(String[] args) {
        int arr[];
        for(int i=0;i<10;i++){
            int N =(int)(Math.random()*(10-1+1)+1);
            arr = new int[N];
            for(int j=0;j<N;j++){
                arr[j] = (int)(Math.random()*(100+100)-100);
            }
            for(int m =0;m<N;m++){
                System.out.print(arr[m]+" ");
            }
            System.out.println();
            System.out.println(MaximumProduc(arr,N));
        }
    }
}
