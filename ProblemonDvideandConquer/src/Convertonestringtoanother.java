public class Convertonestringtoanother {
    private int findMinoperation(String s1,String s2,int i1,int i2){
        System.out.println(s1);
        System.out.println(s2);
        if(i1 == s1.length()){
            return s2.length() -i2;
        }
        if(i2 == s2.length()){
            return s1.length() - i1;
        }
        if(s1.charAt(i1) == s2.charAt(i2)){
            return findMinoperation(s1,s2,i1+1,i2+1);
        }
        int deletOp = 1+findMinoperation(s1,s2,i1+1,i2);
        int insertOp = 1+findMinoperation(s1,s2,i1,i2+1);
        int replaceOp = 1+findMinoperation(s1,s2,i1+1,i2+1);
        return Math.min(deletOp,Math.min(insertOp,replaceOp));
    }
    public int findMinoperation(String s1,String s2){
        return findMinoperation(s1,s2,0,0);
    }

    public static void main(String[] args) {
        Convertonestringtoanother converTo = new Convertonestringtoanother();
        System.out.println(converTo.findMinoperation("Table","chetan"));
    }
}
