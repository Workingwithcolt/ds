public class countansSay
{
    String say(String s){
        StringBuilder sb = new StringBuilder(s);
        char c = s.charAt(0);
        int count = 1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == c){
                count++;
            }else{
                sb.append(count);
                sb.append(c);
                c = s.charAt(i);
                count = 1;
            }
        }
        sb.append(count);
        sb.append(c);
        return sb.toString();
    }
    public String countAndSay(int n){
        if(n == 1) {
            return "1";
        }else{
            return say(countAndSay(n-1));
        }
    }

    public static void main(String[] args) {
        System.out.println(new  countansSay().countAndSay(2));
    }
}
