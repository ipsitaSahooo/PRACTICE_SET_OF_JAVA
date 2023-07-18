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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        if(head==null || head.next==null)
        return null;

        int size=0;
        ListNode temp=head;

        while(temp!=null)
        {
            temp=temp.next;
            size++;
        }

        int target=size-n;

        temp=head;
        int i=1;
        if(target<=0)
        {
            head=head.next;
            return head;
        }
        while(i!=target)
        {
           temp=temp.next;
            i++;
        }

        if(temp.next!=null)
        temp.next=temp.next.next;
        else
        temp.next=null;
        
        return head;
    }
}
