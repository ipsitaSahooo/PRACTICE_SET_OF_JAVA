public static boolean loopDetect(Node head)
  {
  if(head==null)
  return true;

map<Node,boolean> visited;

Node temp=head;
while(temp!=null)
  {
    if(visited[temp]==true)
    {
      // to print the node where loop started
      //System.out.println(temp.data);
      return true;
    }
visited[temp]=true;
    temp=temp.next;
  }
return false;
}


//Time complexity O(n)
