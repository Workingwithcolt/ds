import java.util.Scanner;

public class ADA_CRAV {
    public static int craveConvert(char[] arr) {
        int startD = 0;
        int startU = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i] && arr[i] == 'U') {
                startU++;
            }
            if (arr[i - 1] != arr[i] && arr[i] == 'D') {
                startD++;
            }
        }
        if (arr[0] == 'U') {
            startU++;
        } else {
            startD++;
        }
        return (Math.min(startD, startU));
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int testCase = s.nextInt();
        for (int i = 0; i < testCase; i++) {
            String newstring = s.next();
            char[] arr = newstring.toCharArray();
            System.out.println(craveConvert(arr));
        }
    }

}