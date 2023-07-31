class Solution {
    public int mySqrt(int x) {
        if (x==0)
            return 0;
        int first =1;
        int last=x;
        while (first<=last )
        {
            int mid=first+((last-first)/2);
            int half=x/mid;
            if (mid==half)
                return mid;
            if (mid>half)
                last=mid-1;
            else 
                first=mid+1;
        }
        return last;
    }
}
