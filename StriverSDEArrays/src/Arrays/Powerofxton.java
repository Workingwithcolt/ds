package Arrays;

public class Powerofxton {
    public static double power(double x,int n){
        double ans = 1.0;
        long nn = n;
    //here we take double accoding to the question
        if(nn<0){
            nn = -1*nn;
        }//here we already multiply because -1 -1 become + for avoiding that
        while(nn>0){
            if(nn %2 == 0){
                x = x*x;
                nn = nn/2;
            }else{
                ans = ans*x;
                nn = nn-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(power(2,11));
    }
}
