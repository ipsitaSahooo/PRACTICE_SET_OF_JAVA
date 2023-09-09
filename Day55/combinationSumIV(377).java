class Solution 
{
    public int combinationSum4(int[] nums, int target) 
    {
        long dp[]=new long[target+1];
        dp[0]=1;

        for(int i=1;i<target+1;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(i-nums[j]>=0)
                {
                    dp[i]+=dp[i-nums[j]];
                }
            }
        }
        return (int)dp[target];
    }
}
