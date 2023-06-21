package DSA.array;

import java.util.*;

public class Test {

    private static void dfs(int i,List<List<Integer>> g ,boolean[]vis, List<Integer> l1) {
        if(vis[i]==false){
            vis[i]=true;
            l1.add(i);
            for(int j : g.get(i)){
                if(vis[j]==false){
                    dfs(j,g,vis,l1);
                }
            }
        }
    }
    public static int Solution(int[] A,int[] B,int N) {
        List<List<Integer>> g = new ArrayList<>(N + 1);
        for (int i = 0; i <= N; i++) {
            g.add(new ArrayList<>());
        }
        for (int i = 0; i < A.length; i++) {
            g.get(A[i]).add(B[i]);
            g.get(B[i]).add(A[i]);
        }
        int ans = 0;
        List<List<Integer>> l = new ArrayList<>();
        boolean[] vis = new boolean[N + 1];
        Arrays.fill(vis, false);
        for (int i = 1; i <= N; i++) {
            if (vis[i] == false) {
                List<Integer> l1 = new ArrayList<>();
                dfs(i, g, vis, l1);
                //System.out.println(l1);
                l.add(l1);
            }
        }
        System.out.println(l);
        boolean flag=false;
        for (int k = 0; k < l.size(); k++) {
            for (int i = 0; i < l.get(k).size(); i++) {
                HashSet<Integer> s1 = new HashSet<>();
                for (int j : g.get(l.get(k).get(i))) {
                    s1.add(j);
                }
                for (int j = i + 1; j < l.get(k).size(); j++) {
                    flag = false;
                    Set<Integer> s = new HashSet<>();
                    for (int p : g.get(l.get(k).get(j))) {
                        s.add(p);
                        if(p==l.get(k).get(i)){
                            flag =true;
                        }
                    }
                    s.addAll(s1);
                    if(flag)
                        ans = Math.max(ans, s.size()-1);
                    else
                        ans = Math.max(ans, s.size());
                }
            }
        }
        return ans;
    }
    public static List<Integer>sumOfTheDigits(List<Integer> q){
        int n = 1;
        for(int i : q){
            n = Math.max(n,i);
        }
        List<String> dp = new ArrayList<>( n);
        int[] dp1 = new int[n+1];
        dp1[0]=0;
        dp1[1]=1;
        dp.add("1");
        int sum =0;
        for (int i = 2; i <=n; i++) {
            sum=0;
            String prev = dp.get(i - 1 - 1);
            String curr = "";

            for (int j = 0; j < prev.length(); j++) {
                int count = 1;
                while (j + 1 < prev.length() && prev.charAt(j) == prev.charAt(j + 1)) {
                    count++;
                    j++;
                }
                curr += Integer.toString(count) + prev.charAt(j);
                sum= sum + count + Integer.parseInt(String.valueOf(prev.charAt(j)));
            }
            dp1[i]=sum;
            dp.add(curr);
        }
        System.out.println(dp.get(n-1).length());
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<q.size();i++){
            ans.add(dp1[q.get(i)]);
        }
        return ans;
    }

    public static  int maxAns(List<Integer> levels){
        int n = levels.size();
        int[] l = new int[n];
        int[] r = new int[n];
        l[0]=levels.get(0);
        r[n-1] = levels.get(n-1);
        for(int i=1;i<n;i++){
            l[i]=Math.min(l[i-1],levels.get(i));
        }
        for(int i=n-2;i>=0;i--){
            r[i]=Math.max(r[i+1],levels.get(i));
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            ans = Math.max(ans,(r[i]-l[i]));
        }
        return ans == 0 ? -1 : ans;
    }

    public static void computeLPSArray(List<String> inputs) {
        int n = inputs.size();
         String[] suffix = new String[n];
         String[] pre = new String[n];
         String s = "";
    }

    public static void main(String[] args) {
        List<Integer> ip = new ArrayList<>();
        ip.add(1);
        ip.add(2);
        ip.add(3);
        ip.add(4);
        ip.add(5);
        ip.add(6);
        ip.add(7);
        ip.add(8);
        ip.add(9);
        ip.add(54);
        //System.out.println(sumOfTheDigits(ip));
        List<Integer> l1 = new ArrayList<>();
        l1.add(4);
        l1.add(3);
        l1.add(2);
        l1.add(1);
        //System.out.println(maxAns(l1));
        String pattern = "abcdabcd";
        int[] arr = new int[pattern.length()];
        //computeLPSArray(pattern,pattern.length(),arr);
        int[] A = {1,2,4,5};
        int[] B = {2,3,5,6};
        int N=6;
        System.out.println(Solution(A,B,N));
    }
}
