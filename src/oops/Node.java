package oops;

public class Node {
    Node left;
    Node right;
    int value;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    private static boolean targetInLeftSubtree(Node root ,int x,int level,int xLevel){
        while(root!=null && level<=xLevel){
            if(root.value>=x){
                return true;
            }
            level+=1;
            root = root.right;
        }
        return false;
    }
    private static boolean findNodeIfPresent(Node root , int x,int xLevel,int level){
        if(root == null)
            return false;
        if(root.value == x)
            return true;
        if(targetInLeftSubtree(root.left,x,level+1,xLevel)){
            return findNodeIfPresent(root.left,x,xLevel,level+1);
        }
        else {
            return findNodeIfPresent(root.right,x,xLevel,level+1);
        }
    }
    private static int getLevel(Node root,int x, int level) {
        if (root == null) {
            return 0;
        }
        if(root.value<x)
            return getLevel(root.right,x,level+1);
        else
            return level;

    }
    private static boolean findX(Node root , int x){
        int l = getLevel(root,x,0);
        System.out.println("level of target node  "+l);
        return findNodeIfPresent(root,x,l,0);
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(9);
        root.right = new Node(12);
        root.left.left = new Node(19);
        root.left.right = new Node(22);
        root.right.left = new Node(25);
        root.right.right = new Node(28);
        root.left.left.left = new Node(31);
        root.left.left.right = new Node(32);
        root.left.right.left = new Node(33);
        root.left.right.right = new Node(35);
        root.right.left.left = new Node(37);
        root.right.left.right = new Node(38);
        root.right.right.left = new Node(41);
        root.right.right.right = new Node(47);
        System.out.println(findX(root,26));
    }
}
