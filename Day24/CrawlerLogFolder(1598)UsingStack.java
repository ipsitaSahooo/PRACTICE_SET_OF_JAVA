class Solution 
{
    public int minOperations(String[] logs) 
  {
        Stack<String> stack = new Stack<>();
        for(String log : logs){
            if(log.equals("../"))
            {
                if(!stack.empty())
                    stack.pop();
            }
            else if(log.equals("./"))
            {

            }
            else
            {
                stack.push(log);
            }
        }
        return stack.size();
    }
}
