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
    public ListNode rotateRight(ListNode head, int k) {
         if (head == null) {
            return head;
        }
        int len = 1;
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
            len++;
        }
        k = k % len;
        if (k == 0) {
            return head;
        }
        temp.next = head;
        ListNode newHead = head;
        for (int i = 0; i < len - k - 1; i++) {
            newHead = newHead.next;
        }
        ListNode temp2 = newHead.next;
        newHead.next = null;
        return temp2;
    }
}
