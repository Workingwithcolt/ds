public class TransformoneStringtoAnotherusingminimumoperation {
    //A = EACBD B = EABCD
    //BEACD//BCEAD
    //BEACD = EABCD
    //ABECD = EABCD
    //EABCD = EABCD
    public static void clockwisemovefromn(Character[] s, int n,Character last) {
        for (int i = n ; i > 0; i--) {
            s[i] = s[i - 1];
        }
        s[0] = last;
      for(int i=0;i<s.length;i++){
          System.out.print(s[i]+" ");
      }
        System.out.println();
    }
    public static int Transforms(Character[] s1,Character[] s2){
        int counts1= s2.length-1;
        int counts2 = s2.length-1;
        int count = 0;
        int number = 0;
        for(int i = s2.length-1;i>=0;i--){
            if(s1[counts1] == s2[counts2]){
                counts1--;
                counts2--;
                count++;
                number++;

            }else{
                if(s1[counts1] != s2[counts2]){
                    for(int j=0;j<s1.length-count;j++){
                        Character last =  s1[counts1];
                        clockwisemovefromn(s1, counts1, last);
                        if(s1[counts1] == s2[counts2]){
                            break;
                        }
                    }
                }
            }
        }
        return number;
    }
    public static void main(String[] args) {
        Character[] s1 = {'A','B','D'};//
        //B E A C D
        //A B E C D
        //E A B C D

        Character[] s2 = {'B','A','D'};
        System.out.println(Transforms(s1,s2));

    }
}
