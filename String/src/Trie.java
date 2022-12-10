public class Trie {
    private Trienode root;
    public Trie(){
        root = new Trienode();
    }
    public  void   insert(String word) {
        Trienode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            Trienode node = current.children.get(ch);
            if (node == null) {
                node = new Trienode();
                node.repeat = 0;
                current.children.put(ch, node);
            } else {
                node.repeat += 1;
            }
            current = node;
        }
        current.endofString = true;
    }
    public void print(String[] arr){
        String smallstring =" ";
        int minlength = Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i].length()<minlength){
                minlength = arr[i].length();
                smallstring =arr[i];
            }
        }
        Trienode current = root.children.get(smallstring.charAt(0));
        String finalstring = "";
        int value = current.repeat;
        finalstring += smallstring.charAt(0);
        int currentsecond = 0;
        for(int i=1;i<minlength;i++) {
            try {
                currentsecond = current.children.get(smallstring.charAt(i)).repeat;
            } catch (NullPointerException e) {

            }
            if (currentsecond == value) {
                finalstring += smallstring.charAt(i);
            } else {
                return;
            }
//            }
//            if(current.children.get(smallstring.charAt(i)) == null){
//                System.out.println(finalstring+"f");
//                return;
//            }else {
//                current = current.children.get(smallstring.charAt(i));
//            }
            current = current.children.get(smallstring.charAt(i));
        }
        System.out.println(finalstring);
    }
    public static void main(String[] args) {
        String[] arr = {"Cheatan","Ch","Che"};
        Trie t =new Trie();
        t.insert("Cheatan");
        t.insert("Ch");
        t.insert("Che");
       t.print(arr);
    }
}
