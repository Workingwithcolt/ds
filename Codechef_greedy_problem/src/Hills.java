import java.util.Scanner;

public class Hills {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        int testCases = s.nextInt();
        for(int i=0;i<testCases;i++){
            int N = s.nextInt();
            int[] arr =new int[N];
            boolean parashuteconuter = true;
            int up = s.nextInt();
            int Down =s.nextInt();
            int counter = 1;
            for(int m=0;m<N;m++){
                arr[m] = s.nextInt();
            }
            for (int j=0;j<N-1;j++){
                if(arr[j] < arr[j+1]){
                   //up
                    int temp = arr[j+1] - arr[j];
                    if(temp <= up) {
                        counter++;
                        //You dont Use parashut because it is up
                    }else {
                        break;
                    }
                }else if(arr[j]>arr[j+1]){
                    //down it can be negative
                    int temp = arr[j] - arr[j+1];
                    if(temp <= Math.abs(Down)){
                        counter++;
                    }else if(parashuteconuter){
                        counter++;
                        parashuteconuter = false;
                    }else{
                        break;
                    }
                }else{
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }
}
