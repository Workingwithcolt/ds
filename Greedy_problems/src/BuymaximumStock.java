public class BuymaximumStock {
    public static void main(String[] args){
        int i = 0;
        int k ;
        int totalStock = 0;
        int[] arr = {100,180,160,310,40,535,695};
        int temp = 1;
        for(k = 1;k<arr.length;k++){
            if(arr[temp] < arr[k]){
                temp = k;
            }else if(arr[k] < arr[i]){
                totalStock = Math.abs(arr[i]-arr[temp])+totalStock;
                i = k;
                temp = k;
            }
        }
        System.out.println(totalStock);
        totalStock = Math.abs(arr[i]-arr[temp])+totalStock;
        System.out.println(totalStock);
    }
}
