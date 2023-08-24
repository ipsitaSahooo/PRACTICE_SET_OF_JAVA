class Solution 
{
    public int findTargetSumWays(int[] nums, int target) 
    {
        int n=nums.length;
        int sum=0;
        for(int i:nums)
        sum+=i;

        if(((sum-target)%2==1) || (target>sum))
        return 0;
        sum=(sum-target)/2;

        int dp[][]=new int[n+1][sum+1];
        dp[0][0]=1;

        for(int i=1;i<n+1;i++)
        {
            for(int j=0;j<sum+1;j++)
            {
                if(nums[i - 1] <= j)
                    dp[i][j] = dp[i-1][j] + dp[i - 1][j - nums[i - 1]];
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[n][sum];
    }
}
