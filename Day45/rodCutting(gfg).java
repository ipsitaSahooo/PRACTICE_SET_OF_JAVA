public class Solution 
{
	public static int cutRod(int price[], int n) 
	{
		int length[]=new int[n];
        int cut=1;
        for(int i=0;i<n;i++)
        {
            length[i]=cut;
            cut++;
        }
        
       int dp[][]=new int[n+1][n+1];
       for(int i=0;i<n+1;i++)
       {
           for(int j=0;j<n+1;j++) // same as length.length+1
           {
               if(i==0 || j==0)
               dp[i][j]=0;
           }
       }
       
       for(int i=1;i<n+1;i++)
       {
           for(int j=1;j<n+1;j++) // same as length.length+1
           {
               if(length[i-1]<=j)
               dp[i][j]=Math.max(price[i-1]+dp[i][j-length[i-1]],dp[i-1][j]);
               
               else
               dp[i][j]=dp[i-1][j];
           }
       }
       return dp[n][n];//same as[n][length.length]

	}
}
