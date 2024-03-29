/*
0 - 1 Knapsack Problem
MediumAccuracy: 31.76%Submissions: 279K+Points: 4
Lamp
Stand out from the crowd. Prepare with Complete Interview Preparation

You are given weights and values of N items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack. Note that we have only one quantity of each item.
In other words, given two integer arrays val[0..N-1] and wt[0..N-1] which represent values and weights associated with N items respectively. Also given an integer W which represents knapsack capacity, find out the maximum value subset of val[] such that sum of the weights of this subset is smaller than or equal to W. You cannot break an item, either pick the complete item or dont pick it (0-1 property).

Example 1:

Input:
N = 3
W = 4
values[] = {1,2,3}
weight[] = {4,5,1}
Output: 3
Example 2:

Input:
N = 3
W = 3
values[] = {1,2,3}
weight[] = {4,5,6}
Output: 0
Your Task:
Complete the function knapSack() which takes maximum capacity W, weight array wt[], value array val[], and the number of items n as a parameter and returns the maximum possible value you can get.

Expected Time Complexity: O(N*W).
Expected Auxiliary Space: O(N*W)

Constraints:
1 ≤ N ≤ 1000
1 ≤ W ≤ 1000
1 ≤ wt[i] ≤ 1000
1 ≤ v[i] ≤ 1000

View Bookmarked Problems
Company Tags
Topic Tags
Related Courses
 */
package DSA.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KnapsackProblem01 {
    private static long solve(List<Integer> bandwidth , List<Integer> request , int total_bandwidht){
        int n = bandwidth.size();
        long[][] dp = new long[total_bandwidht+1][n+1];
        for(int i=0;i<=total_bandwidht;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else{
                    dp[i][j]=(i>=bandwidth.get(j-1) ? Math.max(request.get(j-1) + dp[i-bandwidth.get(j-1)][j-1],dp[i][j-1]) : dp[i][j-1]);
                }
            }
        }
        return dp[total_bandwidht][n];
    }
    private int getMaxValue(int[] values,int[] weights,int N,int W){
        int[][]dp = new int[W+1][N+1];
        for(int i=0;i<=W;i++){
            for(int j=0;j<=N;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else{
                    dp[i][j]=(i>=weights[j-1] ? Math.max(values[j-1] + dp[i-weights[j-1]][j-1],dp[i][j-1]) : dp[i][j-1]);
                }
            }
        }
        return dp[W][N];
    }
    public static void main(String[] args) {
        int N=5,W=500;
        int[] values={270,142,450,124,189};
        int[] weights = {200,100,350,50,100};
        List<int[]> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1 = Arrays.asList(values);
        //System.out.println(solve(Arrays.asList(weights),values,W));
        KnapsackProblem01 knapsackProblem01 = new KnapsackProblem01();
        System.out.println("maxmimum values collected is  "+knapsackProblem01.getMaxValue(values,weights,N,W));
    }
}
