import java.util.Scanner;

public class Bracket {
    //    go the Youtube and search for that problem Bracket on codechef
    //f(A) is the maximum length of the '(' or ")"  in the given string
    //we we have to find the string which is lexicographically small and maxLength of F(A) == to the
    //maximum length of the Your answer
    //Note always lexicographically small string always lie in the patter bellow where the number of the
    //"(" or ")" is equal to the maximum length
    //for example we have to find the lexicographically small string of paranthesis with maxlength =3
    //((())) where the number of the length = "(" ==  number of the length = ")"
    public static int findMaximumnumber(String str) {
        int maximumlength = 0;
        int numberofbracket = 0;
        str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                numberofbracket++;
            } else if (str.charAt(i) == ')') {
                numberofbracket--;
            }
            if (numberofbracket > maximumlength) {
                maximumlength = numberofbracket;
            }
        }
        return maximumlength;
    }

    public static void main(String[] args) {
        {
            Scanner s = new Scanner(System.in);
            int T = s.nextInt();
            StringBuilder stringbuilder = new StringBuilder("");
            for (int k = 0; k < T; k++) {
                String newstring = s.next();
                int b = 0;
                int a = 0;
                for (int i = 0; i < newstring.length(); i++) {
                    if (newstring.charAt(i) == '(') {
                        a++;
                    } else {
                        a--;
                    }
                    if (a > b) {
                        b = a;
                    }
                }
                for (int l = 0; l < b; l++) {
                    stringbuilder.append('(');
                }
                for (int m = 0; m < b; m++) {
                    stringbuilder.append(')');
                }
                //as compare to cancating the string stringBuffer take less memory
                System.out.println(stringbuilder);
                stringbuilder.delete(0,stringbuilder.length());
            }
        }
    }
}




