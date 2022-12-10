import java.util.Scanner;

public class Chef_and_Bored_game {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int testcase = s.nextInt();
        for(int i=0;i<testcase;i++){
            int N = s.nextInt();
            int oddnumber =1;
            int sum  = 0;
            //here we use the formula
            while(oddnumber<=N){
                if(oddnumber%2 > 0){
                    sum+=(N-oddnumber+1)*(N-oddnumber+1);
                }
                oddnumber++;
            }
            System.out.println(sum);
            oddnumber = 1;
            sum = 0;
        }
    }
}
