import java.util.ArrayList;
import java.util.Iterator;

public class IterableL {
    public static void main(String[] args) {
        ArrayList<String> name =new ArrayList<>();
        name.add("chetan");
        name.add("sakshi");
        name.add("manisha");
        name.add("manisha");
        Iterator<String> it = name.iterator();
        for(int i=0;i<name.size();i++){
            if(it.hasNext()){
                System.out.println(it.next());
            }
        }
    }
}
