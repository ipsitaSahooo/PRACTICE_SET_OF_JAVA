/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };

 *****************************************************************/

public class Solution {
    public static Node kReverse(Node head, int k) 
    {
        if(head==null)
        return null;

        Node next=null;
        Node temp=head;
        Node prev=null;
        int count=0;

        Node curr=head;
        int size=0;
        while(curr!=null)
        {
            curr=curr.next;
            size++;
        }
        if(k>size)
        return head;
        
        while(temp!=null && count<k)
        {
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
            count++;
        }
        if(next!=null)
        {
            head.next=kReverse(next,k);
        }
        
        return prev;
        
        
        }
}
