import java.util.ArrayList;
import java.util.List;

public class GeneralallpossibleValidIP {

    public static List<String> GenarateALLPossibleIPaddress(String ValidIpaddress) {
        int n = ValidIpaddress.length();
        System.out.println(n);
        int j = 0;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i += 3) {
            j = 0;
            int count = 0;
            String completestring = "";
            while (j < n) {
                if (i == j) {
                    if (ValidIpaddress.charAt(i) == '0') {
                        break;
                    }
                    completestring += ValidIpaddress.charAt(i) + "" + ValidIpaddress.charAt(i + 1) + ".";
//                System.out.println(ValidIpaddress.charAt(i)+" "+ValidIpaddress.charAt(i+1));


                    j = i + 2;
                } else if (j == i + 1) {
                    if (ValidIpaddress.charAt(j + 1) == '0' || Integer.parseInt(ValidIpaddress.substring(j + 1, j + 3 + 1)) >= 256) {
                        break;
                    }
                    completestring += ValidIpaddress.charAt(j + 1) + "" + ValidIpaddress.charAt(j + 2) + "" + ValidIpaddress.charAt(j + 3) + ".";
//                System.out.println(ValidIpaddress.charAt(j+1)+""+
//                        ValidIpaddress.charAt(j+2)+""+ValidIpaddress.charAt(j+3));
                    j = j + 1;
                    j += 2;
                } else {
                    if (ValidIpaddress.charAt(j) == '0' || Integer.parseInt(ValidIpaddress.substring(j, j + 2 + 1)) > 256) {
                        break;
                    }
                    completestring += ValidIpaddress.charAt(j) + "" + ValidIpaddress.charAt(j + 1) + "" + ValidIpaddress.charAt(j + 2) + ".";
//                System.out.println(ValidIpaddress.charAt(j)+""+ValidIpaddress.charAt(j+1)+
//                        ""+ValidIpaddress.charAt(j+2));
                    j += 3;
                }
            }
            if (completestring.length() == ValidIpaddress.length() + 4) {
                list.add(completestring);
            }
            completestring = "";
        }
        return list;
    }


    public static void main(String[] args) {
        List<String> list;
        list = GenarateALLPossibleIPaddress("2555");
        for (String el : list) {
            System.out.println(el);
        }
    }
}










































































































































































































































































































































































































































































































































































































































































































