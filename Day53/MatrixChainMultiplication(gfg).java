class Solution
{
    
    static int solve(int ar[],int i,int j,int dp[][])
    {
        if(i>=j)
        return 0;
        
        if(dp[i][j] != -1)
        return dp[i][j];
        
        int min=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++)
        {
            int tempAns=solve(ar,i,k,dp) + solve(ar,k+1,j,dp) + (ar[i-1]*ar[k]*ar[j]);
            
            if(tempAns<min)
            min=tempAns;
        }
        return dp[i][j]=min;
    }
    static int matrixMultiplication(int N, int arr[])
    {
        int dp[][]=new int[N][N];
        for(int i=0;i<N;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return solve(arr,1,N-1,dp);
    }
}
