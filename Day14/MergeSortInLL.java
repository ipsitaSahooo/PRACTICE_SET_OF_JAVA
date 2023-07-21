/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution 
{
    public ListNode findMid(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head.next;

        while((fast!=null) && (fast.next!=null))
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;   
    }

    public ListNode merge(ListNode left,ListNode right)
    {
        if(left == null)
        return right;

        if(right == null)
        return left;

        ListNode ans=new ListNode();
        ListNode temp=ans;

        while(left!=null && right!=null)
        {
            if((left.val) < (right.val))
            {
                temp.next=left;
                temp=left;
                left=left.next;
            }
            else
            {
                temp.next=right;
                temp=right;
                right=right.next;
            }
        }

        while(left!=null)
        {
            temp.next=left;
            temp=left;
            left=left.next;
        }

        while(right!=null)
        {
            temp.next=right;
            temp=right;
            right=right.next;
        }
        ans=ans.next;//to remove the dummy node

        return ans;
    }
    public ListNode sortList(ListNode head) 
    {
        if((head== null) || (head.next==null))
        return head;

        ListNode mid=findMid(head);

        //create two halves of the LL
        ListNode left=head;
        ListNode right=mid.next;
        mid.next=null;

        //recursively sort left and right parts
        left=sortList(left);
        right=sortList(right);

        //merge both left and right halves
        ListNode ans=merge(left,right);

        return ans;
    }
}

//TC=O(nlogn)
