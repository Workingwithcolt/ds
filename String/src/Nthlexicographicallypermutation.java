public class Nthlexicographicallypermutation {
//    final static int Max_CHAR = 26;
//    final static int MAX_FACT = 20;
//    static long fact[] = new long[MAX_FACT];
//    static void precomputeFactorial(){
//        fact[0] = 1;
//        for(int i=1;i<MAX_FACT;i++){
//            fact[i] = fact[i-1]*i;//factorial
//            System.out.print(fact[i]);
//        }
//        System.out.println();
//    }
//    static void nPermuation(String str,int n){
//        precomputeFactorial();
//        int len = str.length();
//        int freq[] = new int[Max_CHAR];
//
//        for(int i=0;i<len;i++){
//            freq[str.charAt(i) - 'a']++;
//            System.out.println(freq[str.charAt(i)-'a']);
//        }
//        String out = " ";
//        int sum = 10;
//        int k = 0;
//        int i = 0;
//        while(sum >= n) {
//            for (i = 0; i < Max_CHAR; i++) {
//                if (freq[i] == 0)
//                    continue;
//                freq[i]--;
//                System.out.println("else is executed");
//                sum = 0;
//                int xsum = (int) fact[len - 1 - k];
//                System.out.println("xsum"+xsum);
//                System.out.println("k:"+k);
//                for (int j = 0; j < Max_CHAR; j++) {
//                    System.out.println("before"+freq[j]);
//                    System.out.println("fact[freq[j]]"+fact[freq[j]]);
//                    xsum /= fact[freq[j]];
//                    System.out.println("freq[j]"+freq[j]);
//                    System.out.println(" xsum /= fact[freq[j]]"+xsum);
//                }
//                sum += xsum;
//                if(sum >= n){
//                    out += (char)(i+'a');
//                    k++;
//                    n -= (sum - xsum);
//                    break;
//                }
//                if(sum < n){
//                    freq[i]++;
//                }
//            }
//        }
//        for(int t=Max_CHAR-1;k<len && t>= 0;t--){
//            if(freq[t] != 0){
//                System.out.println(t);
//                out+= (char)(t+'a');
//                int  c = freq[t++]--;
//                System.out.println("freq[t++]--"+c);
//                System.out.println(out+" that is the output");
//            }
//        }
//        System.out.println(out);
//    }
    public static  String swap(String a,int i,int j){
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    public static void  permute(String str,int l,int r){

        if(l == r){
            System.out.println(str);
        }else{
            for(int i=l;i<=r;i++){
                str = swap(str,l,i);
                permute(str,l+1,r);
                str = swap(str,l,i);
            }
        }
    }
    public static void main(String[] args) {
        int n = 2;
        String str = "abc";
        permute(str,0,str.length()-1);
    }
}
