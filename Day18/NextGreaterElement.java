class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        int ar[]=new int[nums1.length];

        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> mp=new HashMap<>();

        //finding out all the enxt greater element in nums2
        for(int i:nums2)
        {
            //if i is grtr than the peek element in the stack then it 
            //is the next grtr elemnt
            while(!st.isEmpty() && i>st.peek())
            {
                mp.put(st.pop(),i);
            }
            //add i to stack
            st.add(i);
        }

        int i=0;
        for(int n:nums1)
        {
            ar[i++]=mp.getOrDefault(n,-1);
        }

        return ar;
    }
}

//TC=O(N)
//SC=O(N)
