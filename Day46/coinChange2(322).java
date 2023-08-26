class Solution {
    public int coinChange(int[] coins, int amount) 
    {
        int n=coins.length;

        int dp[]=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;

        for(int i:coins)
        {
            for(int j=1;j<amount+1;j++)
            {
                if(j-i>=0)
                dp[j]=Math.min(1+dp[j-i],dp[j]);
            }
        }
       if(dp[amount]>amount)
       return -1;
       else
       return dp[amount];
    }
}
