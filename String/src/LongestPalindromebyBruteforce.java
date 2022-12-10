public class LongestPalindromebyBruteforce {
    static void printSubstr(String str,int low,int high){
        for(int i = low ;i<=high;i++){
            System.out.println(str.charAt(i));
        }
    }
    static int longestPalindrom(String str){
        int n = str.length();
        int maxlength = 1,start = 0;
        for(int i=0;i<str.length();i++){
            for(int j =i;j<str.length();j++){
                int flag = 1;
                for(int k = 0;k<(j-i+1)/2;k++){
                    if(str.charAt(i+k) != str.charAt(j-k)) {
                        flag = 0;
                    }
                }
                if(flag != 0 && (j-i+1)>maxlength){
                    start =i;
                    maxlength = j-i+1;
                }
            }
        }
        System.out.println("Longest Palindrome substring is");
        printSubstr(str,start,start+maxlength-1);
        return maxlength;
    }

    public static void main(String[] args) {
        String str = "geek";
        longestPalindrom(str);
    }
}
