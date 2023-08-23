class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
	    
         int N=arr.length;
        int range=0;
        for(int i=0;i<N;i++){
            range+=arr[i];
        }
 
        int halfSum=Math.abs(range/2);
 
        boolean dp[][]=new boolean[N+1][halfSum+1];
        
        for(int i=0;i<=N;i++){
            for(int j=0;j<=halfSum;j++){
                if(i==0){
                    dp[i][j]=false;
                }
                if(j==0){
                    dp[i][j]=true;
                }
            }
        }
        
        for(int i=1;i<=N;i++){
            for(int j=1;j<=halfSum;j++)
            {
               if(arr[i-1]<=j){
                   dp[i][j]=dp[i-1][j-arr[i-1]] || dp[i-1][j];
               }
               else{
                   dp[i][j]=dp[i-1][j];
               }
            }
        }
 
        int minValue=Integer.MAX_VALUE;
        for(int j=halfSum;j>=0;j--)
        {
            if(dp[N][j])
            { 
                minValue=Math.min(minValue,range-2*j);
            }
        }
        return minValue;
	} 
}
