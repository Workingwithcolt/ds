package Tim;

public class Stack {
    int arr[] = null;
    int topofstack;
    public Stack(int size){
        arr = new int[size];
        topofstack = -1;
    }
    public boolean isEmpty(){
        if(topofstack == -1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull(){
        if(topofstack == arr.length-1){
            return true;
        }else{
            return false;
        }
    }
    public void push(int value){
        if(!isFull()){
            arr[topofstack+1] = value;
            topofstack++;
        }
    }
    public void pop(){
        if (!isEmpty()) {
            topofstack--;
        }else{
            System.out.println("Stack is empty");
        }
    }
}
