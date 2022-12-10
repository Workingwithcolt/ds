public class MinimumCharactersTobeaddedfronttomakestringpalindrom {
    public  static boolean isPalindrome(String s){
        int i,j = s.length()-1;
        for(i=0;i<s.length();i++){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
    public static void main(String[] args){
        String s= "ABC";
        int cnt = 0;
        int flag= 0;
        while(s.length() > 0){
            if (isPalindrome(s)) {
                flag = 1;
                break;
            }else{
                cnt++;
                s = s.substring(0,s.length()-1);
            }
        }
        if(flag == 1){
            System.out.println(cnt);
        }
    }
}
