import java.util.Arrays;

public class Minimum_cost_to_cut_a_board {
    //here in this problem we are firstly arranging the both array in the descending order because we
    //are firstly use the elements whose price value is greater because the elements has large value Our aim to make money
//less for that we are firsly selecting with high cost  element with less count of that element
    public static void MinimumCost(int[] arr1,int arr2[]){
        int vertical = 1;
        int horizontal = 1;
        int first =0;
        int second = 0;
        int totalCost = 0;
        Arrays.sort(arr1);
        int N = arr1.length-1;
        int M= arr2.length-1;
        Arrays.sort(arr2);
        for(int i= 0;i<N/2;i++){
            int temp = arr1[i];
            arr1[i] = arr1[N-i];
            arr1[N-i] = temp;
        }
        for(int i= 0;i<M/2;i++){
            int temp = arr2[i];
            arr2[i] = arr2[M-i];
            arr2[M-i] = temp;
        }
        while(true){
            if(second==arr2.length || first == arr1.length){
                break;
            }
            System.out.println("it is executed");
            if(arr1[first] >= arr2[second]){
                totalCost =totalCost+arr1[first]*vertical;
                System.out.println("it is at vertical");
                System.out.println(totalCost);
                horizontal++;
                first++;
            }else  if(arr1[first]<= arr2[second]){
                totalCost = totalCost+arr2[second]*horizontal;
                System.out.println(totalCost);
                System.out.println("it is horizontal");
                vertical++;
                second++;
            }
        }
        System.out.println(first+"it is the first");
        System.out.println(second+"it is the second");
        if(first != arr1.length){
            for(int i=first;i<arr1.length;i++){
                totalCost =totalCost+arr1[first]*vertical;
            }
        }else if(second != arr2.length){
            for (int j =second;j< arr2.length;j++){
                totalCost = totalCost+arr2[second]*horizontal;

            }
        }
        System.out.println(totalCost+"it is the totalValue");
    }
    public static void main(String[] args) {
        int[] arr1 = {3, 2, 4, 2, 5};
        int[] arr2 = {5, 2, 3};
        MinimumCost(arr1,arr2);
    }

}