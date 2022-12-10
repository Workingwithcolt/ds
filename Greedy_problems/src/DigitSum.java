import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        int value =0;
        int pointer = 0;
        int TotalTestCase = s.nextInt();
        for(int i=0;i<TotalTestCase;i++){
            String numberstring = s.next();
            for(int j = 0;j<numberstring.length();j++) {
                value += Integer.parseInt(numberstring.substring(j, j + 1));
            }
            if(value%2 == 0){
                pointer = 1;
            }else{
                pointer = 0;
            }
            System.out.println(pointer+"pointer");
            int secondnumberstring = Integer.parseInt(numberstring);
            for(int k =0;k>=0;k++){
                secondnumberstring+=1;
                numberstring = String.valueOf(secondnumberstring);
                System.out.println("secondnumber"+secondnumberstring);
                value = 0;
                for(int m = 0;m<numberstring.length();m++) {
                     value += Integer.parseInt(numberstring.substring(m, m + 1));
                }
                System.out.println(value+"is the value");
                if(value%2 > 0 && pointer == 1){
                    System.out.println(numberstring);
                    break;
                }else if(value%2 == 0 && pointer == 0){
                    System.out.println(numberstring);
                    break;
                }
                System.out.println(numberstring);
            }
            pointer =0;
            value = 0;

        }
    }
}
