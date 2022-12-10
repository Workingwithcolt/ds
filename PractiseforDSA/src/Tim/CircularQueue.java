package Tim;

public class CircularQueue {
//    int[] arr = null;
//    public int beginingofQueue;
//    public int topofqueue;
//    public CircularQueue(int size){
//        arr =new int[size];
//        beginingofQueue =-1;
//        topofqueue =-1;
//    }
//    public boolean isEmpty(){
//        if(topofqueue == -1){
//            return true;
//        }else{
//            return false;
//        }
//    }
//    public boolean isFull(){
//        if(beginingofQueue == 0 && topofqueue == arr.length-1){
//            return true;
//        }else if(topofqueue +1 ==beginingofQueue){
//            return true;
//        }else{
//            return false;
//        }
//    }
//    public void enQueue(int value){
//        if(isFull()){
//            System.out.println("this Queue is already full");
//        }else if(isEmpty()){
//            topofqueue++;
//            arr[topofqueue] =value;
//        }else{
//            if(topofqueue+1 == arr.length){
//                topofqueue =0;
//            }else{
//                topofqueue++;
//                arr[topofqueue] = value;
//            }
//        }
//    }
//    public int deQueue(){
//        if(isEmpty()){
//            System.out.println("it is empty");
//            return -1;
//        }else{
//
//            if(beginingofQueue == topofqueue){
//                //here both are equal that means there is only one element is present
//                topofqueue = beginingofQueue = -1;
//            }else if(beginingofQueue+1 == arr.length){
//                beginingofQueue = 0;
//            }
//        }
//    }
}
