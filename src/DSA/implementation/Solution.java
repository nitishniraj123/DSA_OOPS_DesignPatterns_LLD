package DSA.implementation;

import jdk.internal.util.xml.impl.Pair;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    private class  Pair{
        int i;
        int j;
        void Pair(int i,int j){
            this.i=i;
            this.j=j;
        }

        public Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
    Stack<Integer> s = new Stack<>();
    static List<List<Integer>> ans =new ArrayList<>();
    public static <T> Set<T> getSet(T a[]){
        return Arrays.stream(a).collect(Collectors.toSet());
    }

    private static void solve(List<Integer> temp,List<Integer> A,int sum,int index){
        if(sum==0){
            ans.add(new ArrayList<>(temp));
            return ;
        }
        for (int i = index; i < A.size(); i++)

            if (sum - A.get(i) >= 0) {
                temp.add(A.get(i));

                solve(temp, A, sum - A.get(i), i);
                temp.remove(A.get(i));
            }
    }

    private static List<List<Integer>> combinationSum(int [] A, int val) {
        List<Integer> l = new ArrayList<>();
        Set<Integer> s1 = new HashSet<>();
        for(int a1 : A)
            s1.add(a1);
        List<Integer> a= new ArrayList<>(s1);
        solve(l,a,val,0);
        return ans;
    }
    public static void main(String[] args) {

        int [] A= {1, 2, 3 ,4, 8};
        int val =7;
        System.out.println(combinationSum(A,val));
        String s = "";
        s += 'a';
        s += 'b';
        System.out.println(s);
        s = "";
        s += 'c';
        s += 'd';
        String s1 = "cd";
        System.out.println(s.equals("cd"));
        System.out.println(s);

        int[][] arr = {{1, 2}, {2, 3}, {2, 4}, {5, 6}};
        Integer [] a1 = {1, 3, 1, 2, 5};
        Set<Integer> set = getSet(a1);
        System.out.println(set);
        Set<Integer> set1 = Arrays.stream(a1).collect(Collectors.toSet());
        System.out.println(set1);
        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][0] + " " + arr[i][1] + "\n");
        }

        List<Integer> l = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> q = new LinkedList<>();

        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(2, 1);
        System.out.println(mp.get(2));
        if (mp.containsKey(2)) {
            mp.put(2, mp.get(2) + 1);
        }
        System.out.println(mp.get(2) + " " + mp.size());
        mp.put(2, 3);
        System.out.println(mp.get(2) + " " + mp.size());
        List<List<Integer>> l1 = new ArrayList<>();
        Set<List<Integer>> s2 = new HashSet<>();
        s2.add(Arrays.asList(1,-1, 3));
        l1.addAll(s2);
        System.out.println(l1);
        List<Integer> l4 = new ArrayList<>();
        l4.add(0);
        System.out.println(l4);
        LinkedList<Integer> g[]=new LinkedList[5];
        for(int i=0;i<5;i++){
            g[i]=new LinkedList<>();
        }
        g[0].add(1);
        g[0].add(2);
        g[1].add(3);
        g[1].add(4);
        for(int i=0;i<5;i++){
            System.out.println(g[i]);
        }
    }
}
