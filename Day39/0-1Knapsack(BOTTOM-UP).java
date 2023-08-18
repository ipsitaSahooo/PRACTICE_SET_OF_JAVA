static int knapSack(int W, int wt[], int val[], int n)
    {
        int i, j;
        int K[][] = new int[n + 1][W + 1];
 
        // Build table K[][] in bottom up manner
        for (i = 0; i <= n; i++) {
            for (j= 0; j <= W; j++) {
                if (i == 0 || j == 0)
                    K[i][j] = 0;
                else if (wt[i - 1] <= w)
                    K[i][j]
                        = max(val[i - 1]
                                  + K[i - 1][j - wt[i - 1]],
                              K[i - 1][j]);
                else
                    K[i][j] = K[i - 1][j];
            }
        }
 
        return K[n][W];
    }
