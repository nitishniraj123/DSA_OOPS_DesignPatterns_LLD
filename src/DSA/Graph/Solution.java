package DSA.Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    private static class Pair{
        int first;
        int second;

        public Pair(int i, int j) {
            this.first=i;
            this.second=j;
        }
    }
    private static int shortestXYDist(ArrayList<ArrayList<Character>> grid, int N, int M) {
        int[] xd = {0,0,1,-1};
        int[] yd = {1,-1,0,0};
        Queue<Pair> q = new LinkedList<>();
        int[][] dis = new int[N][M];
        for(int[] a : dis){
            Arrays.fill(a,Integer.MAX_VALUE);
        }
        int[][] vis = new int[N][M];
        for(int[] a : vis){
            Arrays.fill(a,0);
        }
        for(int i=0;i<grid.size();i++){
            for(int j=0;j<grid.get(i).size();j++){
                if(grid.get(i).get(j)=='X'){
                    q.add(new Pair(i,j));
                    dis[i][j]=0;
                    vis[i][j]=1;
                }
            }
        }
        int r,c,ans=Integer.MAX_VALUE,xdr,ydr;
        //System.out.println(q.size());
        while(!q.isEmpty()){
            Pair p = q.poll();
            r=p.first;
            c=p.second;
            if(grid.get(r).get(c)=='Y'){
                ans = Math.min(ans,dis[r][c]);
            }
            for(int i=0;i<4;i++){
                xdr=r+xd[i];
                ydr=c+yd[i];
                if(xdr>=0 && xdr<N && ydr>=0 && ydr<M && vis[xdr][ydr]==0){
                    q.add(new Pair(xdr,ydr));
                    vis[xdr][ydr]=1;
                    dis[xdr][ydr]=1+dis[r][c];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Character>> lists = new ArrayList<>();
        int n=2,m=4;
        lists.add(new ArrayList<Character>(Arrays.asList('X','O','O','O')));
        lists.add(new ArrayList<Character>(Arrays.asList('X','O','O','Y')));
        System.out.println(shortestXYDist(lists,n,m));
    }
}
