class Solution {
    int[]dp;
    public int fib(int n) {
        if(n <= 1)return n;
        dp = new int[n+1];
        for(int i =0; i<=n; i++){
            dp[i] = -1;
        }
        return fun(n);
    }
    private int fun(int n){
        if(n == 0 || n == 1)return n;
        if(dp[n] != -1)return dp[n];

        return dp[n] = fun(n-1) + fun(n-2);
        
    }
}