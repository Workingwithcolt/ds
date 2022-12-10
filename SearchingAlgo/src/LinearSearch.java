public class LinearSearch {
    public int Linear(int value,int[] arr) {
        for (int i = 0; i < arr.length;i++){
            if(arr[i] == value){
                return i;
            }
        }
        System.out.println("The element is not found");
        return 0;
    }
    public static int binarySearch(int arr[],int value){
        int start = 0;
        int counter = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        System.out.println("start:"+start+"end:"+end+"mid:"+mid);
        while(arr[mid] != value && start<= end){
            if(value < arr[mid]){
                end = mid-1;
            }else{//1,2,3,4,5,6,7,8
                start = mid+1;
            }
            mid = (start+end)/2;
            System.out.println(start+" "+ mid +" "+ end);
        }
        if(arr[mid] == value){
            System.out.println("The element is found at the index "+mid);
        return mid;
        }else {
            System.out.println("The element "+value+"not found.");
            return -1;
        }
    }
}
