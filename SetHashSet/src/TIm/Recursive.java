package TIm;

public class Recursive {
    public  int recursiveMethod(int n){
        if(n <= 0){
            return 1;
        }else{
        System.out.println(n);
        return recursiveMethod(n-1);
    }
    }
    public static void main(String[] args) {
        Recursive r = new Recursive();
        System.out.println("0");
        System.out.println("1");
        System.out.println(r.recursiveMethod(5));
    }
}
