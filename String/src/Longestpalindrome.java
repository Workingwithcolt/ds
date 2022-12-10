public class Longestpalindrome {
    static void printSubstr(String str,int low,int high){
        System.out.println(str.substring(low,high+1));
    }
    static void longestPalSubstr(String str){
        int n = str.length();
        boolean[][] table = new boolean[str.length()][str.length()];
        int maxlength = 1;
        for(int i=0;i<n;++i){
            table[i][i] = true;
        }//here we fill the diagonal element to the 1 is true
        int start = 0;
        for(int i=0;i<n-1;i++){
            if(str.charAt(i) == str.charAt(i+1)){
                table[i][i+1] = true;
                start= i;
                System.out.println("start:"+i);
                maxlength =2;
            }
        }//string of length of 2
        for(int s = 0;s<table.length;s++){
            for(int m = 0;m<table[0].length;m++){
                System.out.print(table[s][m]);
            }
            System.out.println();
        }
        for(int k = 3;k<=n;++k){
            for(int i=0;i<n-k+1;++i){
                System.out.println("n-k+1:"+(n-k+1));
                int j = i+k-1;
                System.out.println("j:"+j);
                if(table[i+1][j-1]  == true && str.charAt(i) == str.charAt(j)){
                    System.out.println("[i+1]:"+i+1+"[j-1]:"+(j-1));
                    System.out.println("i;"+i+"j;"+j);
                    table[i][j] = true;
                    if(k > maxlength){
                        start = i;
                        maxlength = k;
                    }
                }
            }
        }
        System.out.println("Longest Palindrome substring is :");
        printSubstr(str,start,start+maxlength-1);
    }

    public static void main(String[] args) {
        String str = "geek";
        longestPalSubstr(str);
    }
}