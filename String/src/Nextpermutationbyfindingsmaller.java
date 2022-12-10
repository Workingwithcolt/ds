import java.util.Arrays;

public class Nextpermutationbyfindingsmaller {
    static void swap(char a[],int i,int j){
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    static void findNext(char a[],int n){
        int i,min = 0;
        for(i = n-1;i>0;i--){
            if(a[i]> a[i-1]) {
                break;
            }
        }
        if(i == 0){
            System.out.println("Not possible");
        }else{
            int x = a[i-1];
            min = i;//x = 4 min = 9 i = 9
            for(int j = i+1;j<n;j++){
                min =j;
            }
        }
        swap(a,i-1,min);
        Arrays.sort(a,i,n);
        System.out.println("Next number with same "+"set of digit is");
        for(i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
