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
 }

 *****************************************************************/

public class Solution
{
    public static Node sortList(Node head) 
    {
       if(head==null || head.next==null)
        {
            return head;
        }
        
        Node zeroLL=new Node(0);
        Node oneLL=new Node(0);
        Node twoLL=new Node(0);

        Node zeroTail=zeroLL;
        Node oneTail=oneLL;
        Node twoTail=twoLL;

        Node temp=head;
        
        //separate lists of 0s,1s and 2s
        while(temp!=null)
        {
            int value=temp.data;
            
            if(value==0)
            {
                zeroTail.next=temp;
                zeroTail=zeroTail.next;
            }
            else if(value==1)
            {
                oneTail.next=temp;
                oneTail=oneTail.next;
            }

            else if(value==2)
            {
                twoTail.next=temp;
                twoTail=twoTail.next;
            }

            temp=temp.next;
        }

        //merge the lists of 0s 1s 2s
        if(oneLL.next!=null)
        zeroTail.next=oneLL.next;

        else
        zeroTail.next=twoLL.next;
        
        oneTail.next=twoLL.next;
        twoTail.next=null;
        
        //update head
        head=zeroLL.next;
       

        return head;
    }
}
