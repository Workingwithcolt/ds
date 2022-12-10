import java.util.ArrayList;
public class QuadraticProbing {
        String[] hashtable;
        int usedcellnumber;
        QuadraticProbing(int size){
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
        public void inserthashtable(String word){
            double loadfactor = getLoadFactor();
            if(loadfactor >= 0.75){
                rehashkeys(word);

            }else{
                int index = modASCIL(word,hashtable.length);
                int counter = 0;
                for(int i= index;i<index+hashtable.length;i++){
                    int newIndex = (index + (counter*counter)) % hashtable.length;
                    if(hashtable[newIndex] == null){
                        hashtable[newIndex] = word;
                        System.out.println(word+"has been inserted");
                        break;
                    }else{
                        System.out.println(newIndex+"is already occupied.Trying next one..");
                    }
                    counter++;
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
}
