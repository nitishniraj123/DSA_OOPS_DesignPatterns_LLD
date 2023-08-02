public class Test12 {
    private static int minJumps(int[] arr){
        int n=arr.length;
        if(n<=1)
            return 0;
        int[] dp = new int[n];
        dp[0]=0;
        int i,j;
        for (i = 1; i < n; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (j = 0; j < i; j++) {
                if (i <= j + arr[j]
                        && dp[j] != Integer.MAX_VALUE) {
                    dp[i]
                            = Math.min(dp[i], dp[j] + 1);
                    break;
                }
            }
            if(dp[j]==Integer.MAX_VALUE)
                return -1;
        }
        return dp[n - 1];
    }
    public static void main(String[] args) {
        int[] arr = {0,3,1,1,0};
        System.out.println(minJumps(arr));
    }
}
