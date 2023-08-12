class Solution 
{
    public int firstUniqChar(String s) 
    {
        int ans=Integer.MAX_VALUE;

        for(char c='a';c<='z';c++)
        {
            int i=s.indexOf(c);
            if(i!=-1 && i==s.lastIndexOf(c))
            ans=Math.min(ans,i);
        }

        return ans==Integer.MAX_VALUE? -1:ans;

    }
}
