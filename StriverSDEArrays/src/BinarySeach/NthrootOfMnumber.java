package BinarySeach;

public class NthrootOfMnumber {
    public static double multiply(double number,int n){
        double ans = 1.0;
        for (int i=1;i<=n;i++){
            ans*=number;
        }
        return  ans;
    }
    public static void getNthroot(int N,int M){
        double low = 1;
        double high = M;
        double eps = 1e-6;//here we take large negative  power because the Binary Search
        //will that value till the 6 decimal number
        while((high-low) < eps){//here we want the value which should be greater than 0.0000001
            //here we write (high- low )  in while becoz we are shrinking the high by low till eps
            double mid = (high+low)/2;
            if(multiply(mid,N) == M){
                System.out.println(mid+"it is mid");
                System.out.println("we got");
                break;
            }else if(multiply(mid,N) < M){
                low = mid;
            }else{
                high = mid;
            }
        }
        //here we dont right the condition of mid == ans because after the 5 decimal low and high is equal
        System.out.println("low:"+low+",high:"+high);
    }

    public static void main(String[] args) {
        getNthroot(5,27);
    }
}
