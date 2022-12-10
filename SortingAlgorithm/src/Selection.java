public class Selection {
    //first we find the minimum element from the list
    //then we replace it with the first element
   public  int[] Selection(int[] arr){
       for(int j=0;j<arr.length;j++ ){
           int minimumIndex = j;
           for(int i=j+1;i<arr.length;i++){
               if(arr[i] < arr[minimumIndex]){//5 2 1 3
                   minimumIndex =i;
               }
           }
           if(minimumIndex != j){
              int temp = arr[j];
              arr[j] = arr[minimumIndex];
              arr[minimumIndex] = temp;
           }
       }
       return arr;
   }
    void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
