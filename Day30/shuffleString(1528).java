class Solution
  {
    public String restoreString(String s, int[] indices) 
    {
        int n=indices.length;
        char ar[]=new char[n];

        for(int i=0;i<n;i++)
        {
            ar[indices[i]]=s.charAt(i);
        }
        
        return String.valueOf(ar);
    }
}
