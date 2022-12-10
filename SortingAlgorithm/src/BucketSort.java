import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    int arr[];
    public BucketSort(int arr[]) {
        this.arr = arr;
    }
    void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //Prints the Buckets
    public void printBucket(ArrayList<Integer>[] bucket){
        for(int i=0;i<bucket.length;i++){
            System.out.println("\n Bucket "+ i +":");
            for(int j=0;j<bucket[i].size();j++){
                System.out.println(bucket[i].get(j)+" ");
            }
        }
    }
    //Bucket Sort
    public void bucketSort(){
        int numberofbucket = (int)Math.ceil(Math.sqrt(arr.length));
        int maxValue = Integer.MIN_VALUE;
        for(int value:arr){
            if(value > maxValue){
                maxValue = value;//o(n)
            }
        }

        ArrayList<Integer>[] bucket = new ArrayList[numberofbucket];
        for(int i=0;i<bucket.length;i++){
            bucket[i] = new ArrayList<Integer>();//here we intializing each bucket by arraylist
        }
        for(int value:arr){
            int bucketnumber = (int)Math.ceil((float)value*numberofbucket/(float)maxValue);
            bucket[bucketnumber-1].add(value);
        }//insetion in the bucket sort
        System.out.println("\n Printing the bucket before sorting ...");
        printBucket(bucket);
        for(ArrayList<Integer> buckets:bucket){
            Collections.sort(buckets);//here we sort each bucket
        }
        System.out.println("\n\n Printing bucket after sorting...");
        printBucket(bucket);
        int index  = 0;
        for(ArrayList<Integer> buckets:bucket){
            for(int value:buckets){
                arr[index] = value;
                index++;//Mergeing the value of sorted from the above code
            }
        }
    }
}
