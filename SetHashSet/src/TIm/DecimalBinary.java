package TIm;

public class DecimalBinary {
    static int[] binary  = new int[5];
    static int count = 0;
    //12 12/2 = rem = 0 divider = 6
    //6/2 = rem = 0 divider = 3
    //3/2 = rem = 1 divider = 1
    //1/2 = rem = 1 divider = 1
    //13/2 = 1
    //6/2 = 0
    //3/2 = 1
    //1/2 = 1
    public static int DecitoBi(int number){
        count +=1;
        if(number == 0){
            return 0;
        }else{
            //12 12/2 = 6(12%2 = 0) 6/2 = 3(6%2 = 0) 3/2 = 1(3%2 = 1) 1/2 = 0(1%2 = 1)
            binary[count] = number%2;
//            System.out.println(binary[count]);
            return DecitoBi(number/2);
            //Decimal(12/2) 1 Decimal(1/2) = 0
            //Decimal(6/2) 2  Decimal(3/2)  =0
            //Decimal(3/2) 3 Decimal(6/2)  =1
            //Decimal(1/2) 4 Decimal(12/2)  =1
        }

    }

    public static void main(String[] args) {
        DecitoBi(12);
        for(int j=4;j>=0;j--){
            System.out.println(binary[j]);
        }
    }
}
