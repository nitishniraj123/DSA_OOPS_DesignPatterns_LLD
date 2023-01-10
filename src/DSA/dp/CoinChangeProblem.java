package DSA.dp;

import java.util.Arrays;

/*Given an integer array of coins[ ] of size N representing different types of currency and an integer sum, The task is to find the number of ways to make sum by using different combinations from coins[].

        Note: Assume that you have an infinite supply of each type of coin.

        Examples:

        Input: sum = 4, coins[] = {1,2,3},
        Output: 4
        Explanation: there are four solutions: {1, 1, 1, 1}, {1, 1, 2}, {2, 2}, {1, 3}.

        Input: sum = 10, coins[] = {2, 5, 3, 6}
        Output: 5
        Explanation: There are five solutions:
        {2,2,2,2,2}, {2,2,3,3}, {2,2,6}, {2,3,5} and {5,5}.*/
public class CoinChangeProblem {
    private long getNumberOfWays(int[] arr,int sum){
        int n = arr.length;
        long[][] dp = new long[sum+1][n];
        Arrays.fill(dp[0],1);
        for(int i=1;i<=sum;i++){
            for(int j =0;j<n;j++){
                dp[i][j]=(i>=arr[j] ? dp[i-arr[j]][j] : 0) + (j>0 ? dp[i][j-1] : 0);
            }
        }
        return dp[sum][n-1];
    }
    private long getNumberOfWaysSpaceOptimised(int[]arr,int sum){
        long[]dp = new long[sum+1];
        int N= arr.length;
        Arrays.fill(dp,0);
        dp[0]=1;
        for(int i=0;i<N;i++){
            for(int j = arr[i];j<=sum;j++){
                dp[j]+=(dp[j-arr[i]]);
            }
        }
        return dp[sum];
    }
    public static void main(String[] args) {
        CoinChangeProblem coinChangeProblem = new CoinChangeProblem();
        int[] arr={2,5,3,6};
        int sum = 10;
        System.out.println("total number of ways "+coinChangeProblem.getNumberOfWays(arr,sum));
        System.out.println("total number of ways by space optimised solution  "+coinChangeProblem.getNumberOfWaysSpaceOptimised(arr,sum));
    }
}
