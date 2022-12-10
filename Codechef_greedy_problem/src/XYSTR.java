import java.util.Scanner;

public class XYSTR {
    public static int functiongirlboy(char[] arr){
        int count =0;
        int i =0;
        while(i<arr.length-1){
            if(arr[i]  == 'x'){
                if(arr[i+1] == 'y'){
                    count = count+1;
                    i = i+2;
                    continue;
                }else if(arr[i] == 'x'){
                    i++;
                }
            }else if(arr[i] == 'y'){
                if(arr[i+1] == 'x'){
                    count = count+1;
                    i = i+2;
                    continue;
                }else if(arr[i] == 'y'){
                    i++;
                }
            }
        }
        return count;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();
        for(int i=0;i<test;i++){
            String a = s.next();
            char[] arr;
            arr = a.toCharArray();
            System.out.println(functiongirlboy(arr));
        }
    }
}

