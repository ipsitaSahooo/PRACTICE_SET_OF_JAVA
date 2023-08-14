//TC=O(N)
//SC=O(N)

class Solution 
{
    static int nthFibonacci(int n)
    {
       // USING DP BOTTOM UP APPROACH
        int dp[]=new int[n+1];
        
        dp[0]=0;
        dp[1]=1;
        
        for(int i=2;i<n+1;i++)
		{
			dp[i]=dp[i-1]+dp[i-2];
		}
		
		return dp[n];
    }
}
