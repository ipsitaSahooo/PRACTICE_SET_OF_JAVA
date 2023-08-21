class GFG 
{
    static boolean isSubsetSum(int set[], int n, int sum)
    {
        if (sum == 0)
            return true;
        if (n == 0)
            return false;
 
        // If last element is greater than sum, then ignore it
        if (set[n - 1] > sum)
            return isSubsetSum(set, n - 1, sum);
 
        // Else, check if sum can be obtained
        // by any of the following
        // (a) including the last element
        // (b) excluding the last element
        return isSubsetSum(set, n - 1, sum)
            || isSubsetSum(set, n - 1, sum - set[n - 1]);
    }
}