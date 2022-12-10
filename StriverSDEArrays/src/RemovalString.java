import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemovalString {
    //remove the repetation of Character repeated character length is greater then 2
    public static void minimum(String str) {
        int redu = 0;
        int min = 0;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == str.charAt(i-1)){
                redu++;
            }else if(str.charAt(i) != str.charAt(i-1) && redu+1 >2){
                min +=(redu-2+1);
                redu =0;
            }else{
                redu =0;
            }
        }
        if(redu+1>2){
            min +=(redu-2+1);
            redu =0;
        }
        System.out.println(min);
    }
    //the problem of maximising smallest value by k
    public static void search(int[] arr,int m){
        Arrays.sort(arr);
        boolean istrue =false;
        for(int i=1;i<arr.length;i++){
            for(int j =0;j<i;j++){
                if(arr[j]<arr[i]){
                    if((m-(arr[i]-arr[j])) > 0 && (arr[i]-arr[j])*i <= m ) {
                        int temp = arr[i]-arr[j];
                        arr[j] += temp;
                        m -=temp;
                    }else{
                        int t = 0;
                        while(true){
                            arr[t] +=1;
                            m--;
                            t++;
                            if(t == i){
                                t =0;
                            }
                            if(m == 0){
                                istrue = true;
                                break;
                            }
                        }
                    }
                }
                if(m ==0){
                    istrue =true;
                    break;
                }
            }
            if(istrue == true){
                break;
            }
        }
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(smallest > arr[i]){
               smallest = arr[i];
            }
        }
        System.out.println(smallest+"it is smallest");
    }
    public static void main(String[] args) {
        int[] arr = {1,8,10,19,17,15};
        search(arr,20);
    }
}
