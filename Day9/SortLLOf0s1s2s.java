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
        int zero=0;
        int one=0;
        int two=0;

        Node temp=head;

        while(temp!=null)
        {
            if(temp.data==0)
            zero++;
            else if(temp.data==1)
            one++;
            else if(temp.data==2)
            two++;

            temp=temp.next;
        }

        temp=head;

        while(temp!=null)
        {
            if(zero!=0)
            {
                temp.data=0;
                zero--;
            }

            else if(one!=0)
            {
                temp.data=1;
                one--;
            }

            else if(two!=0)
            {
                temp.data=2;
                two--;
            }
        }
        return head;
    }
}



//TC=0(n)
//SC=O(1)
