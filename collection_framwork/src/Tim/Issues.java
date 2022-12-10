package Tim;

import java.util.Scanner;
public class Issues {
    int min;
    String[] cause = new String[100];
    private static int[][] rate = new int[40][40];
    private static Scanner s = new Scanner(System.in);

    public int  great(int[] sum,int value) {
        if (value == 1) {
            for (int i = 1; i < 5; i++) {
                if (sum[0] < sum[i]) {
                    sum[0] = sum[i];
                    min = sum[0];
                }
            }
            return min;
        } else if(value == 2){
            for(int j=0;j<4;j++){
                if(sum[0]>sum[j]){
                    sum[0]= sum[j];
                    min = sum[0];//4 3 2 1
                }
            }
            return min;
        }
        return 0;
    }
    public static void main(String[] args) {
        Issues obj = new Issues();
        String[] cause = new String[100];
        int[] sum = new int[10];
        cause[0] = "Stop The violence Don't Drink And Drive            ";
        cause[1] = "Deforestation Continues With The Turn Of A page    ";
        cause[2] = "Save Paper Save The Planet                         ";
        cause[3] = "Air pollution Kills 60.000 People A year           ";
        cause[4] = "Linking Isn't Helping.Be A Volunteer. Change A Life";
        int n;
        System.out.println("how much member U want to rate the Social Consciousness issues ");
        n = s.nextInt();
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.println("candidate " + (i + 1));
                System.out.println(cause[i]);
                System.out.println("Enter the rating out 10:");
                int rating = s.nextInt();
                rate[j][i] = rating;
            }
        }
        for (int j = 0; j < n; j++) {
            System.out.println("Candidate  |Cause No |Rating");
            for (int i = 0; i < 4; i++) {
                System.out.println( (j + 1) + "          |" + (i + 1) + "        |" + rate[j][i]);
            }
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < 4; i++) {
                if (cause[i] == cause[0]) {
                    sum[0] = sum[0] + rate[j][0];
                } else if (cause[i] == cause[1]) {
                    sum[1] = sum[1] + rate[j][1];
                } else if (cause[i] == cause[2]) {
                    sum[2] = sum[2] + rate[j][2];
                } else if (cause[i] == cause[3]) {
                    sum[3] = sum[3] + rate[j][3];
                } else if (cause[i] == cause[4]) {
                    sum[4] = sum[4] + rate[j][4];
                }
            }
        }
                System.out.println("                     causes                         |Total Rating| Average|");
            for (int i = 0; i < 4; i++) {
                System.out.println("  "+cause[i]+"|"+sum[i]+"            |"+(sum[i]));
        }
        int minimum =  obj.great(sum,2);
        int maximum = obj.great(sum,1);
        System.out.println("======================================================");
        System.out.println("cause having the highest rate is "+maximum);
        System.out.println("cause having the lowest rate is "+minimum);
    }
}