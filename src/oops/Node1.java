package oops;

public class Node1 {

    int value;
    Node1 left;
    Node1 right;

    public Node1(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    private static int  getHeight(Node1 root){
        return (root == null ? 0 : 1 + Math.max(getHeight(root.left),getHeight(root.right)));
    }

    private static boolean isNodeInLeftSubtree(Node1 root, int x) {
        root=root.left;
        while(root!=null){
            if(root.value>=x){
                return true;
            }
            root = root.left;
        }
        return false;
        /*int height = getHeight(root);
        //System.out.println(height);
        int rightSubtreeSize = (int) Math.pow(2, height -1) - 1;

        //System.out.println(level + " "+rightSubtreeSize);
        return level < rightSubtreeSize;*/
    }


    private static boolean isNodePresent(Node1 root, int x, int level) {
        if (root == null) {
            return false;
        }

        if (level == 1) {
            return root.value == x;
        }
        if (isNodeInLeftSubtree(root, x)) {
            System.out.println("left mein hai bhai " +root.value);
            return isNodePresent(root.left, x, level - 1);
        } else {
            System.out.println("right mein hai bhai " +root.value);
            return isNodePresent(root.right, x, level - 1);
        }
    }

    private static int getLevel(Node1 root,int x, int level) {
        if (root == null) {
            return 0;
        }
        if(root.value<x)
            return getLevel(root.right,x,level+1);
        else
            return level;

    }

    private static boolean findX(Node1 root, int x) {
        int level = getLevel(root,x,1);

        System.out.println(level);
        //Perform binary search on level
        return isNodePresent(root, x, level);
    }

    public static void main(String[] args) {
        Node1 root = new Node1(5);
        root.left = new Node1(9);
        root.right = new Node1(12);
        root.left.left = new Node1(19);
        root.left.right = new Node1(22);
        root.right.left = new Node1(25);
        root.right.right = new Node1(28);
        root.left.left.left = new Node1(31);
        root.left.left.right = new Node1(32);
        root.left.right.left = new Node1(33);
        root.left.right.right = new Node1(35);
        root.right.left.left = new Node1(37);
        root.right.left.right = new Node1(38);
        root.right.right.left = new Node1(41);
        root.right.right.right = new Node1(42);
        System.out.println(findX(root,38));
    }
}
