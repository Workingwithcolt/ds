public  class CanSum{
    public static boolean sums(int start,int sum,int[] arr,int value){
        for(int i=start+1;i<arr.length;i++){
            sum = arr[start]+arr[i];
            if(sum == value){
                return true;
            }
            sum = 0;
        }
        sums(start+1,0,arr,value);
        if(start == arr.length)
            return false;
        return true;
    }

    public static boolean sumB(int targetsum,int[] number){
        if(targetsum == 0){
            return true;
        }
        if(targetsum < 0){
            return false;
        }
        for(int el:number){
            int remainder = targetsum - el;
            if(sumB(remainder,number) == true){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {5,3,7,4};
        System.out.println(sumB(300,arr));
    }
}