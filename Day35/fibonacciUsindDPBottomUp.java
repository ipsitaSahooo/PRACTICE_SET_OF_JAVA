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
 // OPTIMISING SPACE
//SC=O(1)
class Solution 
{
    static int nthFibonacci(int n)
    {
       // USING DP BOTTOM UP APPROACH
	    
       int b=0;
       int a=1;
       int c;
	    if(n==0)
            return b;
        for(int i=2;i<n+1;i++)
	{
		c=a+b;

		b=a;
		a=c;
		
	}
		
		return a;
    }
}
