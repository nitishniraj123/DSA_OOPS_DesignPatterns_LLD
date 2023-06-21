import java.lang.reflect.Array;
import java.util.*;

public class Test6 {
    private static class Pair{
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    private static int orangesRotting(int[][] grid) {
        int timeInMinutes = 0,m=grid.length,n=grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        int[][] visited = new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(visited[i],0);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    Pair p = new Pair(i,j);
                    q.add(p);
                    visited[i][j]=1;

                }
            }
        }


        int x,y,f=0;
        //System.out.println(visitedSet.size());
        while (!q.isEmpty()){
            int size = q.size();
            f=0;
            //System.out.println(q.size());
            for(int i=0;i<size;i++){
                Pair p = q.poll();
                x = p.first;
                y = p.second + 1;
                Pair p1 = new Pair(x,y);
                if(x>=0 && x<m && y>=0 && y<n && grid[x][y]==1 && visited[x][y]==0){
                    f=1;
                    visited[x][y]=1;
                    grid[x][y]=2;
                    q.add(p1);
                }
                x = p.first;
                y = p.second - 1;
                Pair p2 = new Pair(x,y);
                if(x>=0 && x<m && y>=0 && y<n && grid[x][y]==1 && visited[x][y]==0){
                    f=1;
                    visited[x][y]=1;
                    grid[x][y]=2;
                    q.add(p2);
                }
                x = p.first +1;
                y = p.second;
                Pair p3 = new Pair(x,y);
                if(x>=0 && x<m && y>=0 && y<n && grid[x][y]==1 && visited[x][y]==0){
                    f=1;
                    visited[x][y]=1;
                    grid[x][y]=2;
                    q.add(p3);
                }
                x = p.first-1;
                y = p.second;
                Pair p4 = new Pair(x,y);
                if(x>=0 && x<m && y>=0 && y<n && grid[x][y]==1 && visited[x][y]==0){
                    f=1;
                    visited[x][y]=1;
                    grid[x][y]=2;
                    q.add(p4);
                }
            }
            if(f==1){
                timeInMinutes++;
            }
        }
        //System.out.println(timeInMinutes);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                     return -1;
                }
            }
        }
        return timeInMinutes;
    }
    public static void main(String[] args) {
        int[][] arr = {{2,1,1},{1,1,0},{0,1,2}};
        System.out.println(orangesRotting(arr));
        }
    }
    /*
    Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
    Output: 4
     */
