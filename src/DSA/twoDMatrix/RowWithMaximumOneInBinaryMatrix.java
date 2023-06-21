package DSA.twoDMatrix;

public class RowWithMaximumOneInBinaryMatrix {
    private static int getRowsWithMaximumOne(int[][] mat){
        int ans = 0;
        int m=mat.length,n=mat[0].length,i=0,j=n-1;
        while(i<m && j>=0){
            if(mat[i][j]==1){
                j--;
                ans=i;
            }
            else{
                i++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
         int[][] mat = {
                 {0 ,0 ,0 ,0 ,0 ,0 ,0},
                {0, 0 ,1 ,1 ,1 ,1 ,1},
                {0, 0 ,0 ,0 ,1 ,1, 1},
                {0 ,0 ,1 ,1 ,1 ,1 ,1},
                {0 ,1 ,1 ,1 ,1 ,1 ,1},
                 {0, 0, 1, 1, 1 ,1, 1,}
         };
        System.out.println(getRowsWithMaximumOne(mat));
    }
}
