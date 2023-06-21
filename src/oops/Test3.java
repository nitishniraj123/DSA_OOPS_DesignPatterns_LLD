package oops;

import java.util.*;

public class Test3{

    private static boolean comp(int[] a, int[] b){
        if(a[0]==b[0])
            return a[1]<b[1];
        return a[0]<b[0];
    }
    private static int solve(int[][] arr , int m){
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if(a[0]==b[0])
                    return a[1]-b[1];
                return a[0]-b[0];
            }
        });
        int x = arr[0][0],y=arr[0][1];
        int ans = 0;
        for(int i=1;i<m;i++){
            if(y>=arr[i][0])
            {
                if(x<=arr[i][1])
                    y=arr[i][1];
            }
            else
            {
                ans++;
                x=arr[i][0];
                y=arr[i][1];
            }
        }
        ans++;
        return ans;
    }
    public static void main(String[] args) {
        int m = 3;
        int[][] arr = {{1,3},{2,5},{5,9}};
        System.out.println(solve(arr,m));
    }
}
