package DSA.twoDMatrix;

import java.util.Arrays;

public class CollectPoints {

    public int calculatePoint(int k,int[][] input2){
        boolean[][] vis = new boolean[8][8];
        for(boolean[] a : vis){
            Arrays.fill(a,false);
        }

        int ans = 0;
        int p,q;
        for(int[] a1 : input2){
            p=a1[0];
            q=a1[1];
            for(int i=0;i<8;i++){
                vis[i][q-1]=true;
            }
            for(int i=0;i<8;i++){
                vis[p-1][i]=true;
            }
        }
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(vis[i][j]==true){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        CollectPoints collectPoints = new CollectPoints();
        int k = 2;
        int[][] input2 = {{5,5},{5,3}};
        System.out.println("total score collected by soldiers:-   " +"\n"+collectPoints.calculatePoint(k,input2));
    }

}
