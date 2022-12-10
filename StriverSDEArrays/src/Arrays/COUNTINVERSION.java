package Arrays;

public class COUNTINVERSION {
    public static int Mergeelement(int[] a,int[] temp,int low,int mid,int right){
        System.out.println("low:"+low);
        System.out.println("mid:"+mid);
        System.out.println("high:"+right);
        int i = low;
        int j = mid;
        int inv_count = 0;
        int k = low;
        while((i<=mid-1) && (j<right)){
            if(a[i]<=a[j]){
                temp[k++] = a[i++];
            }else{
                temp[k++] = a[j++];
                //here if the element present at the left hand side greater then we have to calculate the
                //how many element is greater that the left element that we got by
                inv_count = inv_count+(mid-i);//here mid is greater
            }
        }
        while(i<=mid-1){
            temp[k++] = a[i++];
        }
        while (j < right) {
            temp[k++] = a[j++];
        }
        return inv_count;
    }
    public static int MergeSort(int[] a,int[] temp,int low ,int right) {
        int inv_count = 0;
        if (low < right) {
            int mid = (low+right)/2;
            inv_count+= MergeSort(a,temp,low,mid);
            inv_count += MergeSort(a,temp,mid+1,right);
            inv_count += Mergeelement(a,temp,low,mid,right);
        }
        return inv_count;
    }
    public static int SecondApproch(int[] arr){
        int count= 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] a = {4,3,2};
        int[] temp = new int[a.length];
        System.out.println(MergeSort(a,temp,0,a.length));
    }
}
