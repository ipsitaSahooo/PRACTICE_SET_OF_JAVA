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
class Solution {
    public ListNode swapNodes(ListNode head, int k) 
    {
        ListNode curr=head;
        int size=1;
        int front=1;
        int back=0;
        int frontVal;
        int backVal;

        while(curr!=null)
        {
            curr=curr.next;
            size++;
        }

        ListNode temp=head;
        while((temp!=null) && (front!=k))
        {
            temp=temp.next;
            front++;
        }
        frontVal=temp.val;

        ListNode temp2=head;
        back=size-k;
        int i=1;
        while((temp2!=null) && (i!=back)) 
        {
            temp2=temp2.next;
            i++;
        }
        backVal=temp2.val;
        
        ListNode t=head;
        int f=1;
        while((t!=null) && (f!=k))
        {
            t=t.next;
            f++;
        }
        t.val=backVal;


         ListNode t2=head;
         int b=size-k;
         int j=1;
         while((t2!=null) && (j!=b)) 
         {
            t2=t2.next;
            j++;
         }
        t2.val=frontVal;

        return head;

    }
}
