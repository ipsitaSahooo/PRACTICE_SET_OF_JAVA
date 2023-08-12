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

OR


    HashMap<Character,Integer> map=new HashMap();
        int count=0;
        for (int i=0;i<s.length();i++)
        {
            if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else map.put(s.charAt(i),1);
        }
        for (int i=0;i<s.length();i++)
        {
            if (map.get(s.charAt(i))==1)
                return i;
        }
        return -1;
