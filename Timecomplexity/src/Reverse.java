public class Reverse {
    public static void main(String[] args) {
        int [] array = {1,2,3,4};
        //reversing
        //1 swaping
           // 1 swap with particular index
        //1 2 3 4
        //4 3 2 1
        //for above reversing it required only two iteration
        //temp = arr[1]
        //arr[len-i] =temp
        int high =array.length;
        int mid = high/2;
        int temp;
        for(int i=0;i<mid;i++){
            temp = array[i];
            array[i] = array[(high-1)-i];
            array[(high-1)-i] = temp;

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
