public class FindLongestsamePrefixandSuffix {
    static int longestprefixsuffix(String s){
        int n = s.length();
        if(n<2){
            return 0;
        }
        int startfromfirst = 0;
        int startfrommid = (n+1)/2;
        while(startfrommid < n) {
            if (s.charAt(startfrommid) == s.charAt(startfromfirst)) {
                ++startfromfirst;
                ++startfrommid;
            } else {
                System.out.println("startfirst"+startfromfirst);
                System.out.println("startmid"+startfrommid);
                startfrommid = startfrommid - startfromfirst + 1;
                System.out.println(startfromfirst);
                startfromfirst = 0;
            }
        }
        return startfrommid;
    }
    public static void simple(String s){
        int n = s.length();
        int arr[] = new int[n];
        arr[0] = 0;
        int i=1;
        int len = 0;
        while(i<n){
            if(s.charAt(len) == s.charAt(i)){
                len++;
                arr[i] = len;
                i++;
            }else {
                if (len != 0) {
                    len = 0;
                } else {
                    arr[i] = 0;
                    i++;
                }
            }
        }
        int res = arr[n-1];
        System.out.println(res);
    }

    public static void main(String[] args) {
        String s = "caca";
        System.out.println(s.charAt(1)-'a');
        simple(s);
    }
}
