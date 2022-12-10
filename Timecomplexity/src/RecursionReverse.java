public class RecursionReverse {
     static  int temp;
    //1 2 3 4  = arr
    //Recursion(arr,arr.len,int i)
    //if(i == 5){
    //   return arr; }
    // temp = arr[i]
    // arr[i] = arr[arr.len];
    //arr[arr.len]  =temp
       // Recursion(arr,arr.len-1,int i+1)
    public static int[] Recursion(int[] arr,int high,int i){
        if(i == (arr.length)/2){
            return arr;
        }
        temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return Recursion(arr, high-1, i+1);
    }

    public static void main(String[] args) {
        int[] arr  ={1,2,3,4};
        int high = arr.length-1;
        int i=0;
        Recursion(arr,high,i);
        for(int j=0;j< arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}
