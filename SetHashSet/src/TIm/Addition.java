package TIm;

public class Addition {
    static int sum = 0;
    public int  Recursionadd(int number){
        if(number == 0){
            return 0;
        }else{
            //123 1 2 3
            //123%10 3
            //123/10 12
            //12%10 2
            //12/10 1
            //sum = number % 10             1 1 + function(0)
            //number = number/10            2 2 + function(1)
            // sum+ function(number)        3 3 + function(12)
            sum = number%10;
            return sum + Recursionadd(number/10);
            //3+3
            //   2 +1
            //       1 + 0
        }
    }

    public static void main(String[] args) {
        Addition a = new Addition();
        System.out.println(a.Recursionadd(123));
    }
}
