import java.util.*;
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
    public boolean isPalindrome(ListNode head) 
    {
        if(head==null || head.next==null)
        return true;

       ArrayList<Integer> ar=new ArrayList<>();

       ListNode temp=head;
       while(temp!=null)
       {
           ar.add(temp.val);
           temp=temp.next;
       }

       int n=ar.size();
       int s=0;
       int e=n-1;
       while(s<=e)
       {
           if(ar.get(s)!=ar.get(e))
           {
               return false;
           }
           s++;
           e--;
       }
       return true;
    }
}


//TC=O(N)
//SC=O(N)
