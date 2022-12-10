package CHETAN;

public class Main {
    public static void main(String[] args) {
        Binarysearchtree newBST = new Binarysearchtree();
        newBST.insert(70);
        newBST.insert(50);
        newBST.insert(90);
        newBST.insert(30);
        newBST.insert(60);
        newBST.insert(80);
        newBST.insert(100);
        newBST.insert(20);
        newBST.insert(40);
        newBST.preOrder(newBST.root);//...o(n) Time and space
        newBST.levelOrder();//...o(n) Time and Space
        newBST.search(newBST.root,40);//o(log(n)) time and space complexity
    }

}

