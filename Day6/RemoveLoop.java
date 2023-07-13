// to find the node where lopp started
public static Node startLoop(Node head)
  {
  if(head==null)
  return true;

Node intersection=DetectLoop(head);
Node slow=head;

while(slow!=intersection)
  {
    slow=slow.next;
    intersection=intersection.next;
  }
return slow;
}

//remove loop

public static void removeLoop(Node head)
  {
  if(head==null)
  return;

Node start=startLoop(head);
Node temp=start;
while(temp.next!=start)
  {
    temp=temp.next;
  }
temp.next=null;
}

//Time complexity = O(n)
