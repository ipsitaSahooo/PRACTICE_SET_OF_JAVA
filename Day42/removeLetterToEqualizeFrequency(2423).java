class Solution 
{
    public boolean equal(int count[])
    {
        int c=0;
        for(int i:count)
        {
            if(i==0)
            continue;

            else if(c==0)
            c=i;

            else if(c==i)
            continue;

            else
            return false;
        }
        return true;
    }
    public boolean equalFrequency(String word) 
    {
        int l=word.length();
        int[] count=new int[26];

        for(int i=0;i<l;i++)
        {
            char ch=word.charAt(i);
            count[ch-'a']++;
        }
        for(int i=0;i<l;i++)
        {
            char ch=word.charAt(i);
            count[ch - 'a']--;
            if(equal(count))
            {
                return true;
            }
            count[ch-'a']++;
        }
        return false;
    }
}
