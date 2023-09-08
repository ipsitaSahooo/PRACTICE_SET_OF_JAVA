//type of ques-1 if we are in the nth row , the pascal triangle will have n columns
// type of ques-2 if you are given the row and col and you have to find the number , then it is (row-1)C(col-1).   c-combination
//type -3 you have to print the nth row

class Solution 
{
    public List<List<Integer>> generate(int numRows) 
    {
        
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        List<Integer> row,pre=null;//pre will be used to store prev row values

        for(int i=0;i<numRows;i++)
        {
            row=new ArrayList<Integer>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                row.add(1); //it is either the first or last col
                else
                row.add(pre.get(j-1)+pre.get(j));

            }
                pre=row;
                ans.add(row);
        }
        return ans;
    }
}
//TC=O(n2)
