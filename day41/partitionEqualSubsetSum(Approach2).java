static Boolean isSubsetSum(int n, int set[], int sum)
{
        boolean subset[][] = new boolean[n+1][sum + 1];
        for (int i = 0; i <= n; i++)
            subset[i][0] = true;
        for (int i = 1; i <= sum; i++)
            subset[0][i] = false;
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= sum; j++) 
            {
                if (set[i-1]<=j)
                    subset[i][j]=subset[i-1][j] || subset[i-1][j - set[i-1]];
                else 
                    subset[i][j]=subset[i-1][j];
            }
        }
        return subset[n][sum];
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for (int i:nums)
        {
            sum+=i;
        }
        if (sum%2!=0)
            return false;
        else 
        {
            return isSubsetSum(nums.length,nums,sum/2);
        }
    }
