import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Fib {
    static class Container{
        int a;
        int b;
        public Container(int a,int b){
            this.a = a;
            this.b = b;
        }
    }
    static int fib(int n, HashMap<Integer,Integer> mat){
        if(mat.containsKey(n)){
            return mat.get(n);
        }
        if(n<=2){
            return 1;
        }
        int value = fib(n-1,mat) + fib(n-2,mat);
        mat.put(n,value);
        return mat.get(n);
    }
    public static int Grid(int m, int n, Map<Container,Integer> mat){
        Container c = new Container(m,n);
        if((mat.containsKey(c.a))&& mat.containsKey(c.b)){
            return mat.get(c);
        }
        if(n < 0 || m < 0){
            return 0;
        }
        if(m == 1 && n == 1) {return 1;}
        if(n == 0 && m== 0)  {return 0;}
        if( n == 1 && m == 0) {return 0;}
        if(m == 1 && n== 0) {return 0;}
        int v = Grid(m-1,n,mat)+Grid(m,n-1,mat);
        mat.put(c,v);
        return v;
    }
    public static void main(String[] args) {
        HashMap<Integer,Integer> mat = new HashMap<>();
        System.out.println(Fibmemo(6,mat));
    }
    public static int  Fibmemo(int n,HashMap<Integer,Integer> memo){
        if(n == 1){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        if(!memo.containsKey(n)){
            memo.put(n,(Fibmemo(n-1,memo)+Fibmemo(n-2,memo)));
        }
        return memo.get(n);
    }
}
