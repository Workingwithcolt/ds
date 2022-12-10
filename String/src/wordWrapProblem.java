public class wordWrapProblem {
    static void solveWordWrap(int arr[],int n,int k){
        int i,j;
        int currentlen;
        int cost;
        int dp[]  = new int[n];
        int[] ans = new int[n];
        dp[n-1] = 0;
        ans[n-1] = n-1;
        System.out.println("n:"+n);
        for(int c=n-2;c>=0;c--){
            currentlen = -1;
            dp[c] = Integer.MAX_VALUE;
            for(int d=c;d<n;d++) {
                System.out.println("At c="+c+"d="+d);
                currentlen += arr[d]+1;
                System.out.println("currentlength:"+currentlen);
                if(currentlen > k){
                    break;
                }
                if(d == n-1){
                    cost =0;
                    System.out.println("At d="+d);
                }else{
                    cost = (k-currentlen)*(k-currentlen)+dp[d+1];
                    System.out.println("cost = "+cost);
                    System.out.println("dp["+d+"] = "+dp[d+1]);
                }
                if(cost < dp[c]){
                    System.out.println("cost = "+cost);
                    dp[c] = cost;
                    System.out.println("dp[c],c = "+c);
                    ans[c] =d;
                    System.out.println("ans[c] ,d = "+d);
                }
            }
            for(int f=0;f< dp.length;f++){
                System.out.print(dp[f]+" ");
            }
            System.out.println();
        }
        for(int b = 0;b< ans.length;b++){
            System.out.print(ans[b]+" ");
        }
        System.out.println(" ........................");
        i=0;
        while(i<n){
            System.out.println((i+1)+" "+(ans[i]+1)+" ");
            i= ans[i]+1;
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,2,2};
        int n = arr.length;
        int M = 3;
        solveWordWrap(arr,n,M);
    }

}
