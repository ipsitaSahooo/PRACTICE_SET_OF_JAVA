import java.io.*;
import java.util.* ;

/*
	Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

*/
public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
		if(head==null || head.next==null)
		{
			return head;
		}
		LinkedListNode<Integer> prev=null;
		LinkedListNode<Integer> curr=head;
		LinkedListNode<Integer> forward=null;
		while(curr!=null)
		{
			forward=curr.next;
			curr.next=prev;
			prev=curr;
			curr=forward;
		}
		return prev;
    }
}
