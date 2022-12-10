public class Queuearray {
    int[] arr;
    int topOfQueue;
    int beginingOfQueue;
    public Queuearray(int size){
        arr = new int[size];
        topOfQueue = -1;
        beginingOfQueue = -1;
        System.out.println("Queue is successfully created with the size::"+size);
        //......................o(1) time complexity
        //......................o(n) space complexity
    }
    public boolean isFull(){
        if(topOfQueue == arr.length-1){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(beginingOfQueue == -1 || beginingOfQueue == arr.length){
            return true;
        }else{
            return false;
        }//time and space complexity o(1)
    }
public void enQueue(int value){
        if(isFull()){
            System.out.println("The Queue is full");
        }else if(isEmpty()){
            beginingOfQueue =0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("successfully inserted in queue");
        }else{
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("successfully inserted in queue");
        }
}
public int deQueue(){
        if(isEmpty()){
            System.out.println("The queue is empty");//1 2 3 0
            return -1;                               //2 3   1
                                                    //3 3    2
        }else{
            int result = arr[beginingOfQueue];
            beginingOfQueue++;
            if(beginingOfQueue>topOfQueue){
                beginingOfQueue = topOfQueue = -1;
            }
            return result;
        }
}
public int peek(){
        if(isEmpty()){
            System.out.println("The queue is empty");
            return -1;
        }else{
            int result = arr[beginingOfQueue];
            return result;
        }

}
public void deleteQueue(){
arr = null;
    System.out.println("The queue is successfully deleted");
}
}
