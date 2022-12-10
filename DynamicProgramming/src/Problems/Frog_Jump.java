package Problems;

public class Frog_Jump {
    public static int Method(int index,int[] arr,int[] dp){
        if(index > arr.length-1){
            return arr[index-2];
        }
        if(index == arr.length-1){
            return arr[index];
        }
        if(dp[index] != 0){
            return dp[index];
        }
        for(int i=index;i<arr.length;i++){
            int sum = arr[i] + Method(2+i,arr,dp);
            System.out.println(sum);
            return  dp[i] = sum;      +   }
        return dp[arr.length-1];
    }

    public static void main(String[] args) {
        int[] arrr = {4,3,5,6,7};
        int[] dp = new int[arrr.length+1];
        System.out.println(Method(0,arrr,dp));

    }
}
