package DSA.binaryTree;

public class NodeCountsHavingAverageAsRootNode {
    private static  int nodeCount = 0;

    static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right= null;
        }
    }

    private static int[] solve(Node root){
        if(root == null) {
            return new int[]{0, 0};
        }
        int[] l = solve(root.left);
        int[] r = solve(root.right);
        int sum = l[0]+r[0]+root.val;
        int count = l[1]+r[1]+1;
        if(sum/count == root.val){
            nodeCount++;
        }
        return new int[]{sum,count};
    }
    private static int getNodeCountWhoseAverageIsSameAsCurrentNode(Node root){
        solve(root);
        return nodeCount;
    }

    public static void main(String[] args) {
        nodeCount =0;
        Node root = new Node(4);
        root.left = new Node(8);
        root.right = new Node(5);
        root.left.left = new Node(0);
        root.left.right = new Node(1);
        root.right.right=new Node(6);
        System.out.println(getNodeCountWhoseAverageIsSameAsCurrentNode(root));

        /*
        4
    8       5
 0       1       6
         */
    }
}
