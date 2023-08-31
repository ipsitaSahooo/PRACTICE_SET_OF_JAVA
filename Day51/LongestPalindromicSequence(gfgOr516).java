class Solution 
{
    public static int LCS(String str1, String str2)
    {
        int n=str1.length();
        int m=str2.length();

        int dp[][]=new int[n+1][m+1];

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
                if(str1.charAt(i-1)==str2.charAt(j-1))
                dp[i][j]=1+dp[i-1][j-1];

                else
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n][m];
    }
    public int longestPalindromeSubseq(String s) 
    {
        StringBuilder b=new StringBuilder();
        b.append(s);
        String str=b.reverse().toString();//reverse of s
        
        return LCS(s,str);
    
    }
}
