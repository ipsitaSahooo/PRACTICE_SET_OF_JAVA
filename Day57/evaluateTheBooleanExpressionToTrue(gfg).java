class Solution
{
    static int[][][] dp;
    
    static int countWays(int N, String S)
    {
        dp=new int[N+1][N+1][2];
        for(int i[][]:dp)
        {
            for(int[] j:i)
            Arrays.fill(j,-1);
        }
        return solve(S.toCharArray(),0,N-1,true);
    }
    
    public static  int solve(char[] str,int i,int j,boolean isTrue)
    {
        if(i>j) 
        return 0;
        
        if(i==j)
        { 
            if(isTrue) 
            return str[i]=='T'?1:0; 
            else 
            return str[i]=='F'?1:0;  
        }
        
        if(dp[i][j][isTrue==true?1:0]!=-1) 
        return dp[i][j][isTrue==true?1:0]%1003;
        
        int ans=0;
        for(int k=i+1;k<j;k=k+2)
        {
            int LT=solve(str,i,k-1,true); //LEFT TRUE
            int LF=solve(str,i,k-1,false); //LEFT FALSE
            int RT=solve(str,k+1,j,true); //RIGHT TRUE
            int RF=solve(str,k+1,j,false); //RIGHT FALSE
            
            switch(str[k])
            {
                case '&':
                    { 
                        if(isTrue) 
                        ans+=LT*RT; 
                        else 
                        ans+=LT*RF+LF*RT+LF*RF;
                        break;
                        
                    }
                case '|':
                    { 
                        if(isTrue) 
                        ans+=LT*RF+LF*RT+LT*RT; 
                        else 
                        ans+=LF*RF;
                        break;
                        
                    }
                case '^':
                    { 
                        if(isTrue) 
                        ans+=LT*RF+LF*RT;
                        else 
                        ans+=LT*RT+LF*RF;
                        break;
                        
                    }
            }
        }
        ans%=1003;
        dp[i][j][isTrue==true?1:0]=ans;
        return ans;
    }
}
