/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) 
    {
        HashMap<Node , Node> m=new HashMap<>();
        Node curr=head;

        while(curr!=null)
        {
            Node temp=new Node(curr.val);
            m.put(curr,temp);
            curr=curr.next; 
        }

        curr=head;
        while(curr!=null)
        {
            Node temp=m.get(curr);
            temp.next=m.get(curr.next);
            temp.random=m.get(curr.random);
            curr=curr.next;
        }

        return m.get(head);
    }
}

//TC=O(N)
//SC=O(N)
