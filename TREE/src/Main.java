public class Main {
    public static void main(String[] args) {
        TREENODE PM = new TREENODE("A");
        TREENODE CM =new TREENODE("B");
        TREENODE IAS = new TREENODE("c");
        TREENODE POLICE  = new TREENODE("POLICE");
        TREENODE SOLDIER = new TREENODE("Solider");
        PM.addchild(CM);
        PM.addchild(IAS);
//        PM.addchild(CM);
        IAS.addchild(POLICE);
        IAS.addchild(SOLDIER);
        System.out.println(PM.print(0));
    }
}
