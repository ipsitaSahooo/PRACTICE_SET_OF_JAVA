//Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.


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
    public ListNode reverseBetween(ListNode head, int left, int right) 
    {
        if(head==null || head.next==null || left==right)
        return head;

       ListNode curr=head;
       ListNode prev=null;

       for(int i=1; curr!=null && i<left; i++)
       {
           prev=curr;
           curr=curr.next;
       }

       ListNode temp=prev;
       ListNode temp1=curr;
       ListNode next=null;

       for(int i=left; i<=right; i++)
       {
           next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
       }
       if(temp!=null)
       temp.next=prev;

       else
       head=prev;

       temp1.next=curr;

       return head;
    }
}

//TC=O(N)
//SC=O(1)
