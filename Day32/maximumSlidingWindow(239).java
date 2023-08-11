class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) 
    {
        int n=nums.length;
        Deque<Integer> dq = new LinkedList<Integer>();
        int res[] = new int[n-k+1];
        int x=0;
        for(int i =0;i<n;i++)
        {
            if(!dq.isEmpty() && dq.peek()==i-k)
            {
                dq.poll();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i])
            {
                dq.pollLast();
            }
            dq.offer(i);
            if(i>=k-1)
            {
              res[x++]=nums[dq.peek()];
              
            }
        
        }
        return res;
    }
}
