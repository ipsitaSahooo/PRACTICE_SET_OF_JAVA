class Solution
{
    int longestCommonSubstr(String S1, String S2, int n, int m)
    {
        int dp[][]=new int[n+1][m+1];
        int max=0;
        
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<m+1;j++)
            {
                if(i==0 || j==0)
                dp[i][j]=0;
            }
        }
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<m+1;j++)
            {
                if(S1.charAt(i-1)==S2.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                    max=Math.max(dp[i][j],max);
                }

                else //if we donot select then reset to 0 i.e discontiguous case
                dp[i][j]=0;
            }
        }
        return max;
    }
}
