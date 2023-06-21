package DSA.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Test1 {
    public static  int solve(int[][] A){
        int[][] dp = new int[1000][1000];
        for(int i=0;i<1000;i++){
            Arrays.fill(dp[i],0);
        }
        int ans =0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                if(mp.containsKey(A[i][j]) && mp.get(A[i][j])!=i && !s.contains(A[i][j]) ){
                    ans++;
                    s.add(A[i][j]);
                    //System.out.println(A[i][j] + " "+i);
                }
                else{
                    mp.put(A[i][j],i);
                }
            }
        }
        return ans;
    }
    public static  void solve1(int[] A,int K){
        int r = A.length/K;
        if(A.length%K != 0){
            r+=1;
        }
        int c=0,p,q,r1;
        for(int i=0;i<r;i++){
            p=c;
            q=c;
            for(int j=0;j<K && p<A.length;j++){
                System.out.print("+-----");
                p++;
            }
            System.out.println("+");
            for(int j=0;j<K && c<A.length;j++){
                int x = A[c];
                c++;
                String s = String.valueOf(x);
                r1=s.length();
                for(int k=0;k<5-r1;k++){
                    s=" "+s;
                }
                s="|"+s;
                System.out.print(s);
            }
            System.out.println("|");
            for(int j=0;j<K && q<A.length;j++) {
                if (i == r - 1)
                    System.out.print("+-----");
            }
                q++;
            if(i==r-1) {
                System.out.println("+");
            }
        }
    }
    public static void main(String[] args) {
        //int[][] A={{4,3},{5,5},{6,2}};
        //int[][] A={{1,1,5,2,3},{4,5,6,4,3},{9,4,4,1,5}};
        //int[][] A={{1,2,2},{3,1,4}};
        int[] A={4,35,80,123,12345,44,8,5,24,3};
        solve1(A,4);
        //System.out.println(solve(A));
    }
}
