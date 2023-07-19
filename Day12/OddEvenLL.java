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
    public ListNode oddEvenList(ListNode head) 
    {
        ListNode temp=head;
        ListNode os=null;//odd start
        ListNode oe=null;//odd end
        ListNode es=null;//even start
        ListNode ee=null;//even end

        int c=0;

        while(temp!=null)
        {
            c++;
            if(c%2!=0)
            {
                if(os==null)
                {
                    os=temp;
                    oe=temp;
                }
                else
                {
                    oe.next=temp;
                    oe=oe.next;
                }
            }

            else
            {
                if(es==null)
                {
                    ee=temp;
                    es=temp;
                }
                else
                {
                    ee.next=temp;
                    ee=ee.next;
                }
            }

            temp=temp.next;
        }

        if((os==null) || (es==null))
        return head;

        oe.next=es;
        ee.next=null;
        return os;
    }
}

//TC=O(N)
//SC=O(1)
