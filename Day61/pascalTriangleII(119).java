class Solution
{
    //in case of 0 indexed- nth row will always have n+1 elements
    public List<Integer> getRow(int rowIndex)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(1); //for 1st value

        if(rowIndex == 0)
        return ans;

        long temp = 1;
        
        for(int i=1 ; i<rowIndex ; ++i)
        {
            temp = temp * (rowIndex-(i-1));
            temp=temp/i;
            ans.add((int)temp);
        }

        ans.add(1);//for last index
        return ans;
    }
}
