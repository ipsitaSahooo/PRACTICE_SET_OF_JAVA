class Solution{

    public int countPartitions(int n, int d, int arr[]){
       int m=1000000000+7;
        int sum=0;
        for(int i:arr)
        
        sum+=i;
        sum=sum+d;//formula sum=sum+diff
        
        if(sum%2==1)//formula sum=(sum+diff)/2
        return 0;
        sum/=2;
        
        int dp[][]=new int[n+1][sum+1];
        
        for(int i=0;i<n+1;i++)
        dp[i][0]=1;
        
        for(int j=1;j<sum+1;j++)
        dp[0][j]=0;
        
        for(int i=1;i<n+1;i++)
        {
            for(int j=0;j<sum+1;j++)
            {
                if(arr[i-1]<=j)
                {
                    dp[i][j]=(dp[i-1][j-arr[i-1]]+dp[i-1][j])%m;
                }
                else
                {
                    dp[i][j]=dp[i-1][j]%m;
                }
            }
        }
        return dp[n][sum];
    }
}
