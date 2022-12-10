package Arrays;

public class StockAndBuySell {
    public static int  BUYANDSELL(int[] arr){
        int MAXPRO = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    MAXPRO = Math.max(arr[j]-arr[i],MAXPRO);
                }
            }
        }
        return MAXPRO;
    }
    public static int SecondApproach(int[] arr){
        int MaxProfit = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(Min>arr[i]){
                Min = arr[i];
            }
            if((arr[i]-Min)>MaxProfit){
                MaxProfit = arr[i]-Min;
            }
        }
        System.out.println(MaxProfit);
        return MaxProfit;
    }
    public static void main(String[] args){
        int[] arr = {7,1,3,4,6};
        SecondApproach(arr);
    }
}
