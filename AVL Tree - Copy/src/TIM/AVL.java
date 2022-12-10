package TIM;

import com.sun.source.tree.BinaryTree;

public class AVL {
    Binarynode root;
    AVL(){
        root = null;
    }
    public void preOrder(Binarynode node){
        if(node == null){
            return;
        }
        System.out.println(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder(Binarynode node){
        if (node == null){
            return ;
        }
        inOrder(node.left);
        System.out.println(node.value+" ");
        inOrder(node.right);
    }
    public void postOrder(Binarynode node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value+" ");
    }

    public int getHeight(Binarynode node){
        if(node == null){
            return 0;
        }
        return node.height;
    }
    //rotate right
    private Binarynode rotateRight(Binarynode disbalancedNode){
        Binarynode newroot =disbalancedNode.left;
        disbalancedNode.left = disbalancedNode.left.right;
        newroot.right = disbalancedNode;
        disbalancedNode.height  = 1+Math.max(getHeight(disbalancedNode.left),getHeight(disbalancedNode.right));
        newroot.height  = 1+Math.max(getHeight(newroot.left),getHeight(newroot.right));
        return newroot;
    }
    //rotate left
    private Binarynode rotateLeft(Binarynode disbalancedNode){
        Binarynode newRoot = disbalancedNode.right;
        disbalancedNode.right = disbalancedNode.right.left;
        newRoot.left = disbalancedNode;
        disbalancedNode.height  = 1+Math.max(getHeight(disbalancedNode.left),getHeight(disbalancedNode.right));
        newRoot.height  = 1+Math.max(getHeight(newRoot.left),getHeight(newRoot.right));
        return newRoot;
    }
    //getBalance
    public int getBalance(Binarynode node){
        if(node == null){
            return 0;
        }
        return getHeight(node.left) - getHeight(node.right);
    }
    //insertNode
    private Binarynode insertNode(Binarynode node,int nodeValue){
        if(node == null){
            Binarynode newNode = new Binarynode();
            newNode.value = nodeValue;
            newNode.height = 1;
            System.out.println("node is successfully inserted"+ newNode.value);
            return newNode;
            //        newAVL.insert(5);
            //        newAVL.insert(10);
            //        newAVL.insert(15);
            //        newAVL.insert(20);
            //        newAVL.insert(34);
        }else if(nodeValue < node.value){
            node.left = insertNode(node.left,nodeValue);
            System.out.println("node is inserted at the left"+node.value+"of"+nodeValue);
        }else{
            node.right = insertNode(node.right,nodeValue);
            System.out.println("node is inserted at the right"+node.value+"of "+nodeValue);
        }
        node.height = 1 +  Math.max(getHeight(node.left),getHeight(node.right));
        System.out.println(node.height+"isn"+node.value);
        int balance  = getBalance(node);
        System.out.println(balance);
        if(balance >1 && nodeValue < node.left.value){
            System.out.println("it is R");
            return rotateRight(node);//LL condition
        }
        if(balance > 1 && nodeValue > node.left.value) {
            node.left = rotateLeft(node.left);
            System.out.println("it is lr");
            return rotateRight(node);

        }
        if(balance < -1 && nodeValue > node.right.value){
            System.out.println("it is L");
            return rotateLeft(node);
        }
        if((balance < -1) && (nodeValue < node.right.value)){
            node.right = rotateRight(node.right);
            System.out.println("it is r l");
            return rotateLeft(node);
        }
        System.out.println(node.value);
        return node;
    }
    public void insert(int value){
        root = insertNode(root,value);
    }
    //minimum node
    public static Binarynode minimumNode(Binarynode root){
        if(root.left == null){
            return root;
        }//here we are focussing on the left part of each node because it is starting point of any node
         return minimumNode(root.left);
    }
    public Binarynode deleteNode(Binarynode node,int value){
        if(node == null){
            System.out.println("value not found in AVL Tree ");
            return node;
        }
        if(value < node.value){
            node.left = deleteNode(node.left,value);
        }else if(value > node.value){
            node.right = deleteNode(node.right,value);
        }else{
            if(node.left != null && node.right != null) {//here the first condition of
                //of the non rotation is the node has two children
                Binarynode temp;
                temp = node;
                Binarynode minNodeForRight = minimumNode(temp.right);
                node.value = minNodeForRight.value;
                node.right = deleteNode(node.right, minNodeForRight.value);
            }else if (node.left != null){//if it has the one child on left
                node = node.left;
            }else if(node.right != null){//if it has one child on the right
                node = node .right;
            }else{
                node = null;
            }
        }
        int balance = getBalance(node);
        if(balance >1 && getBalance(node.left)>= 0){
            return  rotateRight(node);
        }
        if(balance > 1 && getBalance(node.left)<0){
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }
        if(balance < -1 && getBalance(node.right)<= 0){
            return rotateLeft(node);
        }
        if(balance < -1 && getBalance(node.right)>0){
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }
        return node;
    }
    public void delete(int value){
        root = deleteNode(root,value);
    }

    public void deleteAVL(){
        root = null;
        System.out.println("AVL Tree is successfully deleted");
    }
}
