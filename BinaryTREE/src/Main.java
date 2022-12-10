import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        BinarytreeL binarytreeL = new BinarytreeL();
        Binarynode N1 = new Binarynode();
        N1.value = "N1";
        Binarynode N2 = new Binarynode();
        N2.value = "N2";
        Binarynode N3 = new Binarynode();
        N3.value = "N3";
        Binarynode N4 = new Binarynode();
        N4.value = "N4";
        Binarynode N5 = new Binarynode();
        N5.value = "N5";
        Binarynode N6 = new Binarynode();
        N6.value = "N6";
        Binarynode N7 = new Binarynode();
        N7.value = "N7";
        Binarynode N8 = new Binarynode();
        N8.value = "N8";
        Binarynode N9 = new Binarynode();
        N9.value = "N9";
        N1.left = N2;
        N1.right = N3;
        N2.left = N4;
        N2.right = N5;
        N3.left = N6;
        N3.right = N7;
        N4.left = N8;
        N4.right = N9;
        binarytreeL.root = N1;
//        binarytreeL.preOrder(binarytreeL.root);
//        System.out.println();
//        binarytreeL.InOrder(binarytreeL.root);
//        System.out.println();
//        binarytreeL.postOrder(binarytreeL.root);
//        binarytreeL.levelOrder();
//        binarytreeL.search("N5");
//        binarytreeL.insert("N1");
//        binarytreeL.insert("N2");
//        binarytreeL.levelOrder();
//        Binarynode node = binarytreeL.getDeepestNode();
//        System.out.println(node.value+"This is the deepest node ");
//        binarytreeL.deleteDeepestNode();
//        node = binarytreeL.getDeepestNode();
//        System.out.println(node.value+"This is the deepest node that is deleted");
//        binarytreeL.deletenode("N1");
//        System.out.println();
//        binarytreeL.levelOrder();
        binarytreeL.deletenode("N1");
        binarytreeL.levelOrder();
        binarytreeL.delete();
        binarytreeL.levelOrder();
    }

}
