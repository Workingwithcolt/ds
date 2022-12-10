import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] coins = {1,2,5,10,20,50,100,1000};
        int amount =  2035;
        System.out.println("coins available :"+ Arrays.toString(coins));
        System.out.println("Target available "+amount);
        CoinChanageProblem.coinchangeProblem(coins,amount);
    }
}
