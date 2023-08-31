class Solution
{
    //Function to find length of shortest common supersequence of two strings.
    public static int shortestCommonSupersequence(String X,String Y,int m,int n)
    {
        int[] L = new int[n + 1];

        for (int i = 1; i <= m; i++) {
            int prev = 0;
            for (int j = 1; j <= n; j++) {
                int current = L[j];
                 if (X.charAt(i- 1) == Y.charAt(j- 1))
                    L[j] = prev + 1;
                else
                    L[j] = Math.max(L[j], L[j - 1]);
                prev = current;
            }
        }
          return m+n-L[n];
    }
}
