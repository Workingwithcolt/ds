import java.util.Arrays;
import java.util.Scanner;

public class CHNGIT {
    public static int Chnit(int[] arr,int n){
        int c ,e;
        c = e = 0;
        for(int i=0;i<n;i++)
        {
            e=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j]){
                    e++;
                    if(c<e) {
                        c=e;
                    }
                }
            }
        }
       return c-e;
    }
//    public static void main(String[] args){
//        Scanner s = new Scanner(System.in);
//        int TestCase = s.nextInt();
//        for(int i=0;i<TestCase;i++){
//            int N =(int) (Math.random()*50)+1;
//            int[] arr = new int[N];
//            for(int j =0;j<N;j++){
//                arr[j] =(int) Math.round((Math.random()*100)+1);
//            }
//            System.out.println();
//            for (int e:arr) {
//                System.out.print(e+" ");
//            }
//            System.out.println(Chnit(arr,N));
//        }
//    }


    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int a=sc.nextInt();
            int arr[] = new int[a];
            for(int i=0;i<a;i++){
                arr[i] = sc.nextInt();
            }
            int c=0;
            for(int i=0;i<a;i++){
                int b=0;
                for(int j=0;j<a;j++){
                    if(arr[i]==arr[j]){
                        b++;
                        if(b>c){
                            c++;
                        }
                    }
                }
            }
            System.out.println(a-c);
        }
    }
    }

