public class Trie {
    private TrieNode root;
    public Trie(){
        root = new TrieNode();
        System.out.println("The Trie has been created ");
    }
    public void insert(String word){
        TrieNode current = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            //here if the element or character which is present in the Map then we take that character from the map or if the
            //it is not character present in the Map then it return the null
            if(node == null){
                node = new TrieNode();
                current.children.put(ch,node);
            }
            current = node;
        }
        current.endofString = true;
        System.out.println("Successsfully inserted");
    }
    public boolean search(String word){
        TrieNode currentNode = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            TrieNode node = currentNode.children.get(ch);
            if(node == null){
                System.out.println("This String does not exist in Trie");
                return false;
            }
            currentNode = node;
        }
        if(currentNode.endofString == true){
            System.out.println("Word is exist in trie");
        }else{
            System.out.println("Word does not exist in trie");
        }
        return currentNode.endofString;
    }

    private boolean delete(TrieNode parentNode,String word,int index){
        char ch = word.charAt(index);
        TrieNode current = parentNode.children.get(ch);
        boolean canthisnodebedeleted;
        if(current.children.size() > 1){
            //first case is the same prefix is common between two word like apple and app here app is common
            delete(current,word,index++);
            return false;
        }
        //we are reach to last character of word but this word is the prefix of another word
        if(index  == word.length()-1)//here we reach at last of string
        {
            System.out.println("it is the second condition ");
            if (current.children.size() >= 1) {
                //the String which we want to delete is the prefix of another String
                current.endofString = false;
                return false;
            } else {
                //here when we reach to the last letter of that word then we check there is no any letter that depend on this
                //here we delete that letter
                System.out.println("it is second of the second condition");
                parentNode.children.remove(ch);
                return true;
            }
        }
        if(current.endofString == true){
            //3 rd case
            //here we want to delete the String which contain the another String there for here we recursive call to the
            //deleter method here we just change the value of String of to false
            boolean ty = delete(current,word,index+1);
            System.out.println(ty);
            System.out.println("it is third condition");
            return false;
        }
        //here we use this veriable canthisnodebedeleted to check wether any word is depend on this word
//        if we reach the condition at which there we reach at the end of the String where the String that
//        we are finding is not that but
        canthisnodebedeleted = delete(current,word,index+1);
        if(canthisnodebedeleted == true){
            System.out.println("the canthisnodedeleted");
            //No any word is depend on this word
            System.out.println(ch+"it is the current character");
            parentNode.children.remove(ch);
            System.out.println("fd");
            return true;
        }else{
            return false;
        }
    }
    public void delete(String word){
        if(search(word) == true){
          boolean t =   delete(root,word,0);
            System.out.println(t);
        }
    }
}

//here when firstly when the element has the size greater than one that is then it recursively go to the
//further chracter of the string
//if the character  reaches at the end of the string then at first condition  if it has the further character
//then we simply assign the false of the end of String else if there is no any character then we delete that
// lets say the string which i want to delete that contain the another string suddenly i encoounter
//that endofString = false then we further go into deep by recursivly calling the delete method
//then last condition is that letsay we want to delete the super from the trie
//then  firsly r get deleted then it return true that goes to the canthisnodedeleted then in the same way
//all nodes get deleted