import java.util.Scanner;

public class BRKNLIFE {
    public static void main(String[] args){
        {
            Scanner s = new Scanner(System.in);
            int testCases = s. nextInt();
            char[] checker = {'a', 'b', 'c', 'd', 'e'};
            for(int i=0;i<testCases;i++){
                int N = s.nextInt();
                int M = s.nextInt();
                String fillquestionmarkstring = s.next();
                String subsequencestring =s.next();
                char[] fillquestionmark = fillquestionmarkstring.toCharArray();
                char[] subsequence = subsequencestring.toCharArray();
                int counter = 0;
                boolean istrue = false;
                for(int m= 0;m<fillquestionmark.length;m++){
                    if(fillquestionmark[m] == subsequence[counter]){
                        counter +=1;
                    }
                    if(counter == subsequence.length){
                        System.out.println("-1");
                        istrue = true;
                    }
                }
                if(istrue){
                    continue;
                }
                counter = 0;//?
                for(int j=0;j<fillquestionmark.length;j++){
                    if(fillquestionmark[j] == '?'){
                        for(int n = 0;n<checker.length;n++){
                            if(checker[n] != subsequence[counter]){
                                fillquestionmark[j] = checker[n];
                            }
                            continue;
                        }
                    }
                    if(subsequence[counter]  == fillquestionmark[j]){
                        counter+=1;
                    }
                    if(counter == subsequence.length){
                        System.out.println("-1");
                        break;
                    }
                }
                for(int k = 0;k<fillquestionmark.length;k++){
                    System.out.print(fillquestionmark[k]);
                }
                System.out.println();
            }
        }
    }
}
