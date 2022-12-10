public class RecursivelyPrintAllsentencethatformedfromlistofwordlist {
    public static void printallpossible(String [] word1,String [] word2,String[] word3){
        int firstincrement = 0,secondincrement = 0,thirdincrement =0;

        while (firstincrement<word1.length) {
            System.out.println(word1[firstincrement]+" "+word2[secondincrement]+" "+word3[thirdincrement]);
            if (firstincrement == word1.length) {
            break;
            }else if (secondincrement+1 == word2.length && thirdincrement+1 == word3.length) {
                firstincrement++;
                secondincrement =0;
                thirdincrement= 0;
            }else if (thirdincrement+1 == word3.length) {
                thirdincrement = 0;
                secondincrement ++;
            }else{
                thirdincrement++;
            }
        }
    }

    public static void main(String[] args) {
        String word1[] = {"you","we"};
        String word2[] = {"have","are"};
        String word3[]= {"Sleep","eat","drive"};
        printallpossible(word1,word2,word3);
    }
}
