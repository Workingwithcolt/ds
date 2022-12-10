import java.util.ArrayList;

public class doublehash {
        String[] hashtable;
        int usedcellnumber;
        doublehash(int size){
            hashtable = new String[size];
            usedcellnumber = 0;
        }
        public int modASCIL(String word,int M){
            int total = 0;
            for(int i=0;i<word.length();i++) {
                char ch = word.charAt(i);
                total+=ch;
            }
            return total%M;
        }
        public double getLoadFactor(){
            double loadfactor = usedcellnumber * 1.0/hashtable.length;
            return  loadfactor;
        }
        public void rehashkeys(String word) {
            usedcellnumber = 0;
            ArrayList<String> data = new ArrayList<String>();
            for(String s:hashtable){
                if(s != null){
                    data.add(s);
                }
                data.add(word);
                hashtable = new String[hashtable.length*2];
                for(String sp:data){
                    //insert in hash table
                    inserthashtable(sp);
                }
            }
        }


        public void displayHashTable(){
            if(hashtable == null){
                System.out.println("\nHashtable does not exists");
                return;
            }else{
                System.out.println("\n---------------HashTable-------------------");
                for(int i=0;i<hashtable.length;i++){
                    System.out.println("Index "+i+",key"+hashtable[i]);
                }
            }
        }

    private int addAlldigittogether(int sum){//addition of two values return by the two hashfunction
    int value = 0;
    while(sum > 0){
        value = sum % 10;
        sum = sum/10;
    }
    return value;
    }

    public int secondHashfunction(String x,int M){
    char ch[];
    ch = x.toCharArray();
    int i,sum;
    for(sum = 0,i=0;i<x.length();i++){
        sum += ch[i];
    }
        System.out.println(sum);
    while(sum > hashtable.length){
        System.out.println(sum);
        sum = addAlldigittogether(sum);
        System.out.println(sum);
    }
    return sum % M;
    }

    public void inserthashtable(String value){
            double loadfactor = getLoadFactor();
            if(loadfactor >= 0.75){
                rehashkeys(value);
            }else{
                int x = modASCIL(value,hashtable.length);
                int y = secondHashfunction(value,hashtable.length);
                for(int i=0;i<hashtable.length;i++){
                    int newIndex = (x+i*y) % hashtable.length;
                    if(hashtable[newIndex] == null){
                        hashtable[newIndex] = value;
                        System.out.println(value+"inserted at location "+newIndex);
                        break;
                    }else{
                        System.out.println(newIndex+"is occupied .Trying next empty cell...");
                    }
                }
            }
    }
}

