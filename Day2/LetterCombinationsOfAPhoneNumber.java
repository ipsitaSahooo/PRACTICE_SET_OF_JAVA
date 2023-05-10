class Solution {
    public List<String> letterCombinations(String digits) 
    {
        List<String> res=new ArrayList<>();
        if(digits==null || digits.length()==0)
        {
            return res;
        }
        String[] map={"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        StringBuilder str=new StringBuilder();
        backtrack(res,map,str,digits,0);
        return res;
    }
        public void backtrack(List<String> res,String[] map,StringBuilder str,String digits,int i)
        {
            if(i==digits.length())
            res.add(str.toString());
            else
            {
                String l=map[digits.charAt(i)-'0'];
                for(char k:l.toCharArray())
                {
                    str.append(k);
                    backtrack(res,map,str,digits,i+1);
                    str.deleteCharAt(str.length()-1);
                }
            }
        }
    }
