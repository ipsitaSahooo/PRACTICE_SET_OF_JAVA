class Solution 
{
     public static String printLCS(String s1, String s2)
    {
        int n=s1.length();
        int m=s2.length();

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
                if(s1.charAt(i-1)==s2.charAt(j-1))
                dp[i][j]=1+dp[i-1][j-1];

                else
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }

        int i=n;
        int j=m;
        StringBuilder ans=new StringBuilder();

        while(i>0 && j>0)
        {
            if(s1.charAt(i-1)==s2.charAt(j-1))
            {
                ans.append(s1.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i][j-1]>dp[i-1][j])
            j--;

            else
            i--;
        }
        return ans.reverse().toString();
    }
    public String shortestCommonSupersequence(String str1, String str2) 
    {
        int n=str1.length();
        int m=str2.length();

        String str=printLCS(str1,str2);
        String ans="";
        int i=0;
        int j=0;

        for(char c:str.toCharArray())
        {
            while(i<n && str1.charAt(i)!=c)
            {
                ans+=str1.charAt(i++);
            }
            while(j<m && str2.charAt(j)!=c)
            {
                ans+=str2.charAt(j++);
            }
            ans+=c;
            i++;
            j++;
        }

        if(i<n)
        ans+=str1.substring(i);
        if(j<m)
        ans+=str2.substring(j);

        return ans;
    }
}
