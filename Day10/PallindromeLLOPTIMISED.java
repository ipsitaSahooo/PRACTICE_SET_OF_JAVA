//{ Driver Code Starts
import java.util.*;

class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}

class Is_LinkedList_Palindrom
{
	 Node head;  
	 Node tail;
	
	/* Function to print linked list */
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
 
    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) 
	{

		if (head == null) 
		{
			head = node;
			tail = node;
		} else 
		{
		    tail.next = node;
		    tail = node;
		}
    }
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		 
		while(t>0)
        {
			int n = sc.nextInt();
			//int k = sc.nextInt();
			Is_LinkedList_Palindrom llist = new Is_LinkedList_Palindrom();
			//int n=Integer.parseInt(br.readLine());
			int a1=sc.nextInt();
			Node head= new Node(a1);
            Node tail = head;
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
			    tail.next = new Node(a);
			    tail = tail.next;
			}
			
			Solution g = new Solution();
			if(g.isPalindrome(head) == true)
			    System.out.println(1);
		    else
			    System.out.println(0);
			t--;
		}
		
	}
}




// } Driver Code Ends


/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class Solution
{
    Node MidVal(Node head)
    {
        Node slow=head;
        Node fast=head.next;
        
        while((fast!=null) && (fast.next!=null))
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;//mid value it is
    }
    
    Node reverse(Node head)
    {
        Node curr=head;
        Node prev=null;
        Node next=null;
        
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        if(head==null || head.next==null)
        return true;
        
        //step 1=find mid value
        Node mid=MidVal(head);
        
        // if the 2 lists(after and before middle value) are same then it is pallindrome
        
        //step2=reverse the list after middle value
        Node temp=mid.next;
        mid.next=reverse(temp);//to reverse after middle value
        
        //step 3=compare the two halves
        Node head1=head;
        Node head2=mid.next;
        
        while(head2!=null)
        {
            if(head1.data!=head2.data)
            return false;
            
            head1=head1.next;
            head2=head2.next;
        }
        
        // again reverse back the elements after mid value so that we can have the original LL
        //optional this is
        temp=mid.next;
        mid.next=reverse(temp);
        
        return true;
        
    }    
}

//TC=O(N)
//SC=O(1)
