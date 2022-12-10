import java.lang.reflect.Array;
import java.util.Arrays;

public class CoinChanageProblem {
    static void coinchangeProblem(int[] coins,int N){
        Arrays.sort(coins);
        int index = coins.length-1;
        while(true){
            int coinValue = coins[index];
            index--;
            int maxAmount = (N/coinValue)*coinValue;//2035/1000 = 2*1000  = 2000
            if (maxAmount > 0) {
                System.out.println("Coin value "+coinValue+"take countL:"+(N/coinValue));
                N = N-maxAmount;
            }
            if(N == 0){
                break;
            }
        }
    }
}
