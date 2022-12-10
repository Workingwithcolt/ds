import java.util.Scanner;

public class S {
    /* package codechef; // don't place package name! */


    /* Name of the class has to be "Main" only if the class is public. */
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner s= new Scanner(System.in);
            int totalCase = s.nextInt();
            Integer value = 5;
            for(int i=0;i<totalCase;i++){
                Integer numberofdigit = s.nextInt();
                char a ;
                String digitstring ;
                digitstring= s.next();
                for(int j = 0;j<numberofdigit;j++){
                    value = Integer.parseInt(digitstring.substring(j,j+1));
                    System.out.println(value);
                    if(value%5 == 0){
                        System.out.println("yes");
                        break;
                    }
                    if(j == digitstring.length()-1){
                        System.out.println("No");
                    }
                }
            }
        }
    }
