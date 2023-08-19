class Solution
{
    static Boolean isSubsetSum(int N, int arr[], int sum)
    {
        boolean subset[][] = new boolean[sum + 1][N + 1];
        for (int i = 0; i <= N; i++)
            subset[0][i] = true;
 
        for (int i = 1; i <= sum; i++)
            subset[i][0] = false;
 
        for (int i = 1; i <= sum; i++) {
            for (int j = 1; j <= N; j++) {
                subset[i][j] = subset[i][j - 1];
                if (i >= arr[j - 1])
                    subset[i][j] = subset[i][j] || subset[i - arr[j - 1]][j - 1];
            }
        }
 
        return subset[sum][N];
    }
}
