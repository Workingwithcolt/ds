import java.util.ArrayList;

public class Linearprob {
    String[] hashtable;
    int usedcellnumber;
    Linearprob(int size){
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
                data.add(s);//here we add all element to the arrayList
            }
            //if any index is null in the array
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
            rehashkeys(word);//here we rehash the hashtable
        }else{
            int index = modASCIL(word,hashtable.length);
            System.out.println(index);
            for(int i=index;i<index+hashtable.length;i++){
                int newIndex = i % hashtable.length;
                System.out.println(newIndex);
                if(hashtable[newIndex] ==null){
                    hashtable[newIndex] = word;
                    System.out.println("The "+word+"successfully inserted "+newIndex);
                    break;
                }else{
                    System.out.println(index+"is already occupied.Trying next empty cell");
                }
            }
        }
        usedcellnumber++;
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

    public boolean searchhashtable(String word){
        int index = modASCIL(word,hashtable.length);
        for(int i=index;i< index+hashtable.length;i++){
            int newIndex = i % hashtable.length;
            if(hashtable[newIndex] != null && hashtable[newIndex].equals(word)){
                System.out.println(word+"found at location "+newIndex);
                return true;
            }
        }
        System.out.println("The word does not found");
        return false;
    }
    public void deletekeyhashtable(String word){
        int index = modASCIL(word,hashtable.length);
        System.out.println(index);
        for(int i = index;i<index+hashtable.length;i++){
            int newIndex = i % hashtable.length;
            System.out.println(newIndex);
            if(hashtable[newIndex] != null && hashtable[newIndex].equals(word)){
                hashtable[newIndex] = null;
                System.out.println(word+" has been deleted from HashTable");
                return;
            }
        }
        System.out.println(word+" not found in Hashtable");
    }
}
