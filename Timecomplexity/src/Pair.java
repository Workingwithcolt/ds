public class Pair {
    public static void paircurrent(int n,int[] array){//...o(1)
        for(int i=0;i<array.length;i++){//............o(n)
            System.out.print(n+""+array[i]+" ");//.....o(1)
        }
    }
    public static void main(String[] args) {
        //Create the Arrry
        //Making the pair
        //the pair include the itself also
        //for pairing we make the  iterative for loop were the we can access each element with all element of array
        //another way we take we make function that will take the whole array and the one element of array
        int[] arr = {1,2,3,4,5};//....o(1)
        for(int i=0;i<arr.length;i++){//....o(n)....|_
            paircurrent(arr[i],arr);//.....0(n).....|_o(n)
            System.out.println();//....
        }
    }
}
