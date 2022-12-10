package Arrays;

public class MejorityNby2 {
    public static void Mejority(int[] arr){
        //brute force approach
        boolean[] visitedarray = new boolean[arr.length];
        int count = 1;
        int nby2 = arr.length/2;
        for(int i=0;i<arr.length;i++){
            if(!visitedarray[i]){
            for(int j=i+1;j<arr.length;j++) {
                if (arr[i] == arr[j]  && !visitedarray[j]) {
                    visitedarray[j] = true;
                    visitedarray[i] = true;
                    count++;
                }
            }
                if(count>nby2){
                    System.out.println(arr[i]);
                }
            }
            count = 1;
        }
    }//Time Complexit = O(N^2)
    //Space Complexity = o(N)
    public static int MoorevotingAlgorithm(int[] arr){
        int element = arr[0];
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == element){
                count++;
            }else if(count == 0){
                element = arr[i];
            }else{
                count--;
            }
        }
        return element;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        Mejority(arr);
        System.out.println(MoorevotingAlgorithm(arr));
    }
}
