//TOP-DOWN
static int knapSack(int wt[], int val[],int W, int n)
    {
      int dp[][]=new int[n+1][W+1];
      for(int i=0;i<n;i++)
        {
          for(int j=0;j<W;j++)
            {
              dp[i][j]=-1;
            }
        }
        // Base Case
        if (n == 0 || W == 0)
            return 0;
  
        if (dp[n][W] != -1)
            return dp[n][W];
  
        //choice diagram
        if (wt[n - 1] > W)
            return dp[n][W]=knapSack(wt, val, W, n - 1);
        else
            return dp[n][W]=Math.max(val[n - 1] + knapSack(wt, val, W - wt[n - 1], n - 1), knapSack(W, wt, val, n - 1));
    }
          //TC=O(N^2)
          //SC=O(N)
  
