public class Knapsack01 {
    private int knapsack(int[] profits,int[] weights,int capacity,int currentIndex) {
        if(capacity <= 0 || currentIndex < 0 || currentIndex>= profits.length){
            return 0;
        }
        int profit1 = 0;
        if(weights[currentIndex] <= capacity){
            profit1 = profits[currentIndex]+ knapsack(profits,weights,capacity-weights[currentIndex],currentIndex+1);
        }
        int profit2 = knapsack(profits,weights,capacity,currentIndex+1);
        return Math.max(profit1,profit2);
    }
    public int Knapsack(int[] profits,int[] weights,int capacity){
        return this.knapsack(profits,weights,capacity,0);
    }
    public static void main(String[] args) {
        Knapsack01 zok = new Knapsack01();
        int[] profit = {31,26,17,72};
        int[] weight = {3,1,2,5};
        int maxProfit = zok.Knapsack(profit,weight,7);
        System.out.println(maxProfit);
    }
}
