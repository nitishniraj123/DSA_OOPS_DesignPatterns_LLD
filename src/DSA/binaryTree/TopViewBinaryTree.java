package DSA.binaryTree;

import java.util.*;

public class TopViewBinaryTree {
    private static List<Integer> ans = new ArrayList<>();
    private static HashMap<Integer,Pair> mp = new HashMap<>();
    static class Pair{
        int val;
        int level;
        Pair(int val , int level){
            this.val = val;
            this.level = level;
        }
    }
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    private static void solve1(Node root,int hd,int level){
        if(root == null)
            return;
        if(!mp.containsKey(hd)){
            mp.put(hd,new Pair(root.data, level));
        }
        else{
            Pair p = mp.get(hd);
            if(p.level>level){
                p.level = level;
                p.val = root.data;
            }
        }
        solve1(root.left,hd-1,level+1);
        solve1(root.right,hd+1,level+1);
    }
    private static List<Integer>  getTopViewOfBinaryTree(Node root){
        solve1(root,0,0);
         //Collections.sort(s);
        //Collections.sort(s);

        Set<Integer> s = mp.keySet();
        List<Integer> list = new ArrayList<>();
        for (int i : s){
            list.add(i);
        }
        Collections.sort(list);
        for(int i : list){
            ans.add(mp.get(i).val);
        }
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(0);
        root.left = new Node(1);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(10);
        root.right.right = new Node(11);
        root.left.left.left = new Node(5);
        root.left.right.left = new Node(6);
        root.left.right.left.left = new Node(7);
        root.left.right.left.left.left = new Node(8);
        root.left.right.left.left.left.left = new Node(9);
        System.out.println(getTopViewOfBinaryTree(root));

        List<Integer> l = null;
        System.out.println((List<Integer>) (null));
    }
}
