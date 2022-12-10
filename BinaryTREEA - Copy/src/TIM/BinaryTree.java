package TIM;

import java.util.Queue;

public class BinaryTree {
    String[] arr;
    int lastusedindex;

    public BinaryTree(int size) {
        arr = new String[size];
        this.lastusedindex = 0;//here we why we start the index from the 0 because we have to insert the root at the
        //index of 1
        System.out.println("black tree of size " + size + "Created");
    }

    boolean isFull() {
        if (arr.length - 1 == lastusedindex) {
            return true;
        } else {
            return false;
        }
    }
    void insert(String value) {
        if (!isFull()) {
            arr[lastusedindex + 1] = value;
            lastusedindex++;
            System.out.println("The value of " + value + "has been inserted");
        } else {
            System.out.println("The BT is full");
        }
    }
    public void preOrdere(int index){//index of root
        if(index > lastusedindex){
            return;
        }else{
            System.out.println(arr[index]+" ");
            preOrdere(index*2);
            preOrdere(index*2+1);
        }
    }
    public void InOrdere(int index){//index of root
        if(index > lastusedindex){
            return;
        }else{
            InOrdere(index*2);
            System.out.println(arr[index]+" ");
            InOrdere(index*2+1);
        }
    }
    public void postOrder(int index){//index of root
        if(index > lastusedindex){
            return;
        }else{
            postOrder(index*2);
            postOrder(index*2+1);
            System.out.println(arr[index]+" ");
        }
    }

    //Level order traversal
    public void levelOrder(){
        if(arr == null){
            System.out.println("array is empty");
        }else {
            for (int i = 1; i <= lastusedindex; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    public int search(String value){
        for(int i=1;i<=lastusedindex;i++){
            if(arr[i] == value){
                System.out.println(value+"exist at the location "+i);
                return i;
            }
        }
        System.out.println("The value does not exist in BT");
        return -1;
    }
    public void deleteBT(){
        try{
            arr = null;
            System.out.println("There was an error deleting the tree");
        }catch (Exception e){
            System.out.println("There was an error deleting the tree");
        }
    }
}