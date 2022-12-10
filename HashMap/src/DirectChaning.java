import java.util.LinkedList;

public class DirectChaning {
    LinkedList<String>[] hashtable;
    int maxChainsize = 5;
    DirectChaning(int size){
        hashtable = new LinkedList[size];
    }
    public int modASCIL(String word,int M){
        int total = 0;
        for(int i=0;i<word.length();i++){
            int ch = word.charAt(i);
            total += ch;
        }
        return total%M;
    }
    public void inserthashtable(String word){
        int newIndex = modASCIL(word,hashtable.length);
        if(hashtable[newIndex] == null){
         hashtable[newIndex] = new LinkedList<String>();
         hashtable[newIndex].add(word);
        } else{
          hashtable[newIndex].add(word);
        }
    }
    public void displayHashTable(){
        if(hashtable == null){
            System.out.println("hash table does not exist");
        }else{
            System.out.println("\n----------hash table----------\n");
            for(int i=0;i<hashtable.length;i++){
                System.out.println("index "+ i +", key "+hashtable[i]);
            }
        }
    }
    public boolean searchHashtable(String word){
        int newIndex = modASCIL(word,hashtable.length);
        if(hashtable[newIndex] != null && hashtable[newIndex].contains(word)){
            System.out.println("\n "+"\""+word+"\""+"found in Hashtable at location "+newIndex);
            return true;
        }
        else{
            return false;
        }
    }
    public void deletekeyhashtable(String word){
        int newIndex = modASCIL(word,hashtable.length);
        boolean result = searchHashtable(word);
        if(result == true){
            hashtable[newIndex].remove(word);
            System.out.println("\n "+"\""+word+"\""+" successfully deleted from the hashtable "+newIndex);
        }
    }
}
