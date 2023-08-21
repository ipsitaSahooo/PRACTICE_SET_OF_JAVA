class Solution {
    Boolean dp[][];
    public boolean canPartition(int[] nums) 
    {
        int sum = 0;
        int n = nums.length;
        
        for(int i : nums) sum+=i;
        
        if(sum%2!=0) return false;
        
        sum /= 2;
        
        dp = new Boolean[n+1][sum+1];
        
        return subset(nums,nums.length-1,sum);
    }
    
    boolean subset(int[] nums, int n, int sum){
        if(sum==0) return true;
        
        else if(n==0) return false;
        
        if(dp[n][sum]!=null) 
        return dp[n][sum];
        
        if (nums[n-1]<=sum)
        return dp[n][sum] = subset(nums,n-1,sum-nums[n-1]) || subset(nums,n-1,sum);
        else 
        return dp[n][sum] =subset(nums,n-1,sum);
        
    }
}
