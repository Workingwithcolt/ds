package Tim;

import java.util.*;

public class ArrayProblem {
    public static void ReverseArray(int[] arr){
        //[1,2,3,4]
        int mid = (arr.length-1)/2;
        for(int i=0;i<=mid;i++){
            int temp = arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[i];
            arr[i] = temp;
        }
        System.out.println(arr);
    }
    public static void arraysort012withoutsorting(int[] arr){
        int ones = 0;
        int zeros = 0;
        int twos = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                zeros++;
            }else if(arr[i] == 1) {
                ones++;
            }else if(arr[i] == 2){
                twos++;
            }
        }
        //putting the number of zeros and ones and twos
        String array = "";
        while(twos > 0){
            if(zeros>0){
                array+="0";
                zeros--;
            }else if(zeros == 0){
                array+="1";
                ones--;

            }else if(ones == 0){
                array+="2";
                twos--;
            }
        }
    }
    public static void movenegativetoleft(int[] arr) {
        //[-12,11,-13,-5,6,-7,5,-3]
        //-12,-13,-5,6,-7,5,-3
        //
        int positive = 0;
//        int negative = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                if(i != positive){
                    int temp = arr[i];
                    arr[i] = arr[positive];
                    arr[positive] = temp;
                }
                positive++;
            }
        }
        for(int i:arr){
            System.out.println(i);
        }
        //when we find the negative element
        //we first see that the two pointer which is one same index or not if it not then we swap if it is we dont
        //swap
        // at that point after swaping we increment pointer to new position
    }
    public static void movenegativetoleftsecondapproach(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            if (arr[left] > 0 && arr[right] < 0) {
                //swap
                left++;
                right--;
            }
            if (arr[left] < 0 && arr[right] < 0) {
                left++;
            }
            if (arr[left] > 0 && arr[right] > 0) {
                right--;
            } else {
                left++;
                right--;
            }
        }
    }
    //[1,2,3,4,5]
    //[5 1 2 3 4]
    public static void Rotate(int[] arr){
        int last = arr[arr.length-1];
        for(int i= arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;

        //here we are assigning the value from the left to right and firstly we are storing the value of the last
        //element
                //from right hand side
    }
    public static void KadaneAlgorithm(int[] arr){
        int max_ending_here =0;
        int max_so_far = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            max_ending_here+=arr[i];
            if(max_ending_here>max_so_far){
                max_so_far = max_ending_here;
            }
        }//here the continuos the greater value is hold by the max_ending_here and if the value is greater
        //than max_so_far then we assign the value to it then if we got te another
        //greater value then we update the value of the max_so_far
    }
    public static void MinimumAndMaximumHeightByaddingKDifference(int k ,int[] arr){
        Arrays.sort(arr);
        int ans = arr[arr.length-1]-arr[0];
        int tempmin,tempMax;
        tempmin = arr[0];
        tempMax = arr[arr.length-1];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-k<0){
                continue;
            }//k = 3
            //1 5 15 10 -> 1 5 10 15 -> 4 5 10 12 -> tempmin = 2
            // 1 5 10 18 tempmax = 18
            //{4,6} k = 10
            //
            tempmin = Math.min(arr[0]+k,arr[i]-k);
            tempMax =Math.max(arr[arr.length-1]-k,arr[i-1]+k);
            ans = Math.min(ans,tempMax-tempmin);
        }
//        return ans;
    }//1 3 5 8 9 2 6 7 6 8 9
    public static int MinimumNumberofJump(int[] arr){
     int maxR = arr[0];
     int step = arr[0];
     int jump = 1;
     if(arr.length == 1){
         return 0;
     }else  if(arr[0] == 0){
         return -1;
     }else {
         //here the maxReach is for finding the maximum reach point if the step become zero we assign only
         //maxReach-i at that point i
         for (int i = 1; i < arr.length; i++) {
             step--;
             if(i == arr.length-1){
                 return jump;
             }
             maxR = Math.max(maxR, arr[i] + i);//here You want to check from the first
             if (step == 0) {
                 jump++;
                 if (i >= maxR){
                     return -1;//here if the value of the maxR get high or greater than the aray that time
//                 we return the -1
                 }
                 step = maxR - i;
             }
         }
     }
     return jump;
    }

    public static void merge(int[] arr1,int[] arr2,int m,int n){
        for(int i= n-1;i>=0;i--){//here the n is lenght of first arrray and m is the length of second array
            int last = arr1[m-1];
            int j;
            for(j=m-2;j>=0 && arr2[i]<arr1[j] ;j--){
                    arr1[j+1] = arr1[j];

            }
            if(j!= m-2 || last>arr2[i]){
                arr1[j+1] = arr2[i];
                arr2[i] = last;
            }
        }
    }
    public static int[][] Interval(int[][] Interval){
        //here we compare the first element of first and end with second element
        //of first if second element of first is less than the first element of second then we merge
        //with the greater value of first end and second end
        List<int[]> Intervals = new ArrayList<>();
        Arrays.sort(Interval,(a,b)->Integer.compare(a[0],b[0]));
        int start = Interval[0][0];
        int end = Interval[0][1];
        for(int i=1;i<Interval.length;i++){
            int smallsecond = Interval[i][0];
            int endsecond = Interval[i][1];
            if(smallsecond<=end){
                end = Math.max(endsecond,end);
            }else{
                Intervals.add(new int[]{start,end});
                start = smallsecond;
                end = endsecond;
            }
        }
        Intervals.add(new int[]{start,end});
        int[][] p =new int[Intervals.size()][];
        p =Intervals.toArray(p);
        return p;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,5,9,10,15,20};
        int[] arr2 = {2,3,8,13};
        merge(arr1,arr2,6,4);
        for (int e:arr1) {
            System.out.println(e);
        }
        for (int el:arr2) {
            System.out.println(el);
        }
    }
}
