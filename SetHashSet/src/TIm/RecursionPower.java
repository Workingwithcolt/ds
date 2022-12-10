package TIm;

public class RecursionPower {
    static int mul ;
    //2
    // 2*2  = 4
    //2*2*2 = 8
    //  return function(number ,power)
    // function(2,3)
    //
    // return sum*function(2,n-1){function(2,2)}
    // sum = 2
    //2*function(2,2)      2*function(2,0) 2*1      2*function(2,0)
    //  2*function(2,1)    2*function(2,1)         2*function(2,1) 2*2
    //     2*function(2,0) 2*function(2,2)         2*function(2,2) 2*4
    public int Recursionp(int number,int power){
        if(power == 0){
            return 1;
        }else{
            mul = number;
            return mul*Recursionp(number,power-1);
        }
    }

    public static void main(String[] args) {
        RecursionPower p  = new RecursionPower();
        System.out.println(p.Recursionp(2,3));
    }
}
