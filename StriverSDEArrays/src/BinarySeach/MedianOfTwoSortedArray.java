package BinarySeach;

public class MedianOfTwoSortedArray {
    public static double  Median(int[] num1,int[] num2) {
        //here U first find out the smaller element array then make the binary search on it
        if(num2.length < num1.length){
            return Median(num2,num1);
        }
        int n1 =num1.length;
        int n2 = num2.length;
        int lo = 0,hi =n1;//here we are doing the binary search on the lesser element array
        while(lo<=hi){
            int cut1 = (lo+hi)/2;
            int cut2 = n1+n2+1/2 - cut1;
            int left1  = cut1 == 0 ? Integer.MIN_VALUE : num1[cut1-1];
            int left2 = cut2 == 0 ? Integer.MIN_VALUE : num2[cut2-1];

            int right1 = cut1 == n1 ? Integer.MAX_VALUE : num1[cut1];
            int right2 = cut2 == n2 ?Integer.MAX_VALUE : num2[cut2];

            if(left1 <= right2 && left2 <= right1){
                if((n1+n2) % 2 == 0){
                    return (Math.max(left1,left2)+Math.min(right1,right2))/2.0;
                }else{
                    return Math.max(left1,left2);
                }
            }else if(left1 > right2){
                hi = cut1-1;
            }else{
                lo = cut1+1;
            }
        }
        return 0.0;
    }

    public static void main(String[] args) {

    }
}
