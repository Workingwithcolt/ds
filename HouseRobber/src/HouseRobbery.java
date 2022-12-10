public class HouseRobbery {
    private int maxMoneyRecursion(int[] HouseNetWorth,int currentIndex){
        if(currentIndex >= HouseNetWorth.length){
            return 0;
        }
        int stealcurrentHouse = HouseNetWorth[currentIndex] + maxMoneyRecursion(HouseNetWorth,currentIndex+2);
        int skipCurrenthouse = maxMoneyRecursion(HouseNetWorth,currentIndex+1);
        int m = Math.max(skipCurrenthouse,stealcurrentHouse);
        System.out.println(m);
        return m;
    }
    public int maxMoney(int[] HouseNetWorth){
        return  maxMoneyRecursion(HouseNetWorth,0);
    }
}
