package Tim;

public class Queue {
    int[] arr =null;
    int beginingofQueue;
    int topofQueue;
    public Queue(int size){
        arr = new int[size];
        beginingofQueue =-1;
        topofQueue = -1;
    }
    public boolean isEmpty(){
        if(beginingofQueue == -1 || beginingofQueue > topofQueue || topofQueue == -1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isfull(){
        if(topofQueue == arr.length-1){
            return true;
        }else{
            return false;
        }
    }
    public void Enque(int value){
        if(isfull()){
            System.out.println("it is full");
            return;
        }else{
            if(beginingofQueue == -1){
                beginingofQueue++;
                topofQueue++;
                arr[topofQueue] = value;
                return ;
            }else{
                topofQueue++;
                arr[topofQueue] =value;
            }
        }
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("that Queue is already Empty therefore we dont delete  the element ");
            return;
        }else{
            beginingofQueue++;
            if(beginingofQueue> topofQueue){
                System.out.println("the Queue is empty");
                return;
            }
        }
    }
}
