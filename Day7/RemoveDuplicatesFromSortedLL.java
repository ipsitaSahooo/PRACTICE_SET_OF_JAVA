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
    public ListNode deleteDuplicates(ListNode head) 
    {
        if(head==null || head.next==null)
        {
            return head;
        }

       ListNode fake=new ListNode(0);
       fake.next=head;
       ListNode temp=fake;

       while(temp.next!=null && temp.next.next!=null)
       {
           if(temp.next.val==temp.next.next.val)
           {
               int duplicate=temp.next.val;
               while(temp.next!=null && temp.next.val==duplicate)
               {
                   temp.next=temp.next.next;
               }
           }
           else
           {
               temp=temp.next;
           }
       }
       return fake.next;
    }
}
