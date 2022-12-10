public class ValidShuffle {
    public static  String[] shuffle(String word1,String word2){
        //a b c ,1 2 3 = 1a2b3c,a1b2c3
        int total = word1.length()+word2.length();
        String word =" ";
        String[] shuffle = new String[2];
        int lenwor1 = 0,lenwor2 = 0;
        int i=0;
        while(i<total){
            if(i%2 == 0 && lenwor1 < word1.length()){
                word += word1.charAt(lenwor1++);
            }else{
                word+=word2.charAt(lenwor2++);
            }
            i++;
        }
        i= 0;
        lenwor1 = 0;
        lenwor2 =0;
        String words =" ";
        while(i<total){
            if(i%2 == 0 && lenwor2 < word2.length()){
                words += word2.charAt(lenwor2++);
            }else{
                words+=word1.charAt(lenwor1++);
            }
            i++;
        }
        shuffle[0] = word;
        shuffle[1] = words;
        return shuffle;
    }

    public static void main(String[] args) {
        String str1 = "123",str2 = "abcf";
        String[]  l = shuffle(str1,str2);
        System.out.println(l[0]);
        System.out.println(l[1]);
    }
}
