public class Smallest_Number {
    //please the see that problem in the geeks for geeks`
    public static String FindSmallestValue(int s,int d){
        if((9*d) < s) return "-1";
        String ans = " ";
        //please watch the vedio of the Codelibrary
        //here we have the example bellow
        //d = 3
        //s = 9
        //firstly at the 0th condition we check s>9 that leads to the false;
        //then we go the else condition then we check the i =0 or i >0
        //then we go to the else
        //here we are substracting the 9-1= 8 then add to the ans = 8
        //i = 1
        //at first iteration we add the 0
        //ans = 08
        //then we add the 1
        //then You can calculate the sum of the digit  is 9

        //d = 4
        //s = 18
        //firstly we check s>9 that is true
        //then we substract the 9 from the s
        //s = 9 ans = _ _ _ 9
        //then in the next interation we go the else
        //then we first substract the one from the 9 we got the 8
        //_ _ 8 9
        //then we put the 0
        //then that position we are reach the i = 0;
        //then we add the 1
-            //0
            if (s > 9) {
                ans = '9' + ans;
                s -= 9;
            } else {
                //1
                if (i == 0) {
                    ans = ans + " " + s;
                } else {
                    //2
                    ans = ans+" "+(s-1);
                    i--;
                    while(i>0){
                        ans = '0'+ans;
                        i--;
                    }
                    ans = '1'+ans;
                    break;
                }
            }
        }
    }
    public static void main(String[] args){

    }
}
