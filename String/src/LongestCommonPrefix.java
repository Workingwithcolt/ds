public class LongestCommonPrefix {
    public static String  commonprefix(String[] arr){
        int minlength = Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i].length()<minlength){
                minlength = arr[i].length();
            }
        }
        System.out.println("minlength"+minlength);
        System.out.println("Arr.length/2"+arr.length/2);
        int count = 0;
        String v = " ";
        for(int i=0;i<minlength;i++){
            for(int j =0;j<=arr.length/2;j++){
                if(arr[j].charAt(i) == arr[j+1].charAt(i)){
                        count += 1;
                }else{
                    v = arr[j].substring(0,i);
                    return v;
                }
            }
        }
       return v;
    }

    public static void main(String[] args) {
        String[] words = {"dog", "cheta", "s"};
        System.out.println(commonprefix(words));

    }
}
