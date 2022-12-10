public class CircularQueue {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;
    int size;

    public CircularQueue(int size){
    arr = new int[size];
    this.size = size;
    this.topOfQueue = -1;
    this.beginningOfQueue = -1;//Time complexity o(1) and space complexity o(n)
        System.out.println("Queue is successfully created with size of "+size);
    }
    public boolean isEmpty(){
        if(topOfQueue == -1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull(){
        if(topOfQueue+1 == beginningOfQueue){//if the topofQueue+1 position is beginingofQueue then it is full
            return true;
        }else if (beginningOfQueue == 0 && topOfQueue == size){
            return true;
        }else{
            return false;
        }
    }
    public void enQueue(int value){
        if(isFull()){
            System.out.println("It is full ");
        }else if(isEmpty()){
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("the value is successfully inserted "+value);
        }else{//here the bellow part will execute when the given arr is not empty is not full that means some
            //position in array is become empty/
            if(topOfQueue+1 == size){
                topOfQueue = 0;
                //here the topOfQueue is start from zero and in full first condition does not satisy the that beginingofqueue is at zero
                //and second that is topofqueue+1 = begininigofqueue that does not there for we insert at first position because that is empty
                //
            }else{
                topOfQueue++;
            }
            arr[topOfQueue] = value;
        }
    }
    public int deQueue(){
        if(isEmpty()){
            System.out.println("The circular queue is empty");
            return -1;
        }else{
            int result = arr[beginningOfQueue];
            arr[beginningOfQueue] = 0;
            if(beginningOfQueue == topOfQueue){
                //the only one element is present in the queue after deleting that element there is no any element is present in the array
                beginningOfQueue = -1;
                topOfQueue = -1;
            }else if(beginningOfQueue+1 == size){
                beginningOfQueue = 0;
            }else{
                beginningOfQueue++;
            }
            return result;
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("The Circular Queue is empty");
            return -1;
        }else{
            int result = arr[beginningOfQueue];
            return result;
        }
    }
    public void deleteQueue(){
        arr = null;
        System.out.println("The Queue is successfully deleted");
    }
}
