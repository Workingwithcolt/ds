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
//        2
//        4 2
//        0 1
//        0 2
//        1 3
//        1 3
//        5 4
//        0 1
//        1 2
//        2 3
//        3 4
//        1 2 3 4
//        2
//        4
//        For the first test case, to reach city 1, the king has to travel 1 unit, and to visit city 3, he has to visit another 1 unit. So, he has to travel 2 units.
//                The path would be 0 -> 1 -> 3
//
//        For the second test case, to reach city 1, the king has to travel 1 unit, then to visit city 2, the king has to travel another 1 unit, then to visit city 3, he has to travel another 1 unit and to visit city 4 hr has to travel another 1 unit. So he has to travel 4 units.
//                The path would be 0 -> 1 -> 2 -> 3 -> 4
    }

}

