static int knapSack(int wt[], int val[],int W, int n)
    {
        // Base Case
        if (n == 0 || W == 0)
            return 0;
 
        //choice diagram
        if (wt[n - 1] > W)
            return knapSack(wt, val, W, n - 1);
        else
            return Math.max(val[n - 1] + knapSack(wt, val, W - wt[n - 1], n - 1), knapSack(W, wt, val, n - 1));
    }
