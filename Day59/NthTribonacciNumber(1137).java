class Solution {
    public int tribonacci(int n)
    {
        if(n==1 || n==2)
        return 1;

        if(n==0)
        return 0;

        int ans=0;
        int one=0;
        int two=1;
        int three=1;
        for(int i=3;i<n+1;i++)
        {
            ans=one+two+three;
            one=two;
            two=three;
            three=ans;
        }
        return ans;
    }
}
