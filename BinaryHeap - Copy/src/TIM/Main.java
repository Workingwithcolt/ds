package TIM;

import TIM.BinaryHeap;

public class Main {
    public static void main(String[] args) {
        BinaryHeap newBH= new BinaryHeap(5);
        newBH.insert(15,"max");
        newBH.insert(10,"max");
        newBH.insert(11,"max");
        newBH.insert(13,"max");
        newBH.insert(4,"max");
        newBH.levelOrder();
        newBH.extractHeadofbp("max");
        newBH.levelOrder();
    }
}
