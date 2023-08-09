class Solution 
{
    public int largestRectangleArea(int[] heights) 
    {
        
        int n = heights.length;
        int smallleft[] = new int[n]; //prev smaller element
        int smallright[] = new int[n];//next smaller element

        Stack<Integer> s = new Stack<>();
       
        for(int i=0;i<heights.length;i++)
        {
            while(!s.isEmpty() && heights[s.peek()] >= heights[i] )
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                smallleft[i] = -1;
            }
            else
            {
                smallleft[i] = s.peek();
            }

            s.push(i);
        }

        s = new Stack<>();
        for(int i=heights.length-1; i>=0; i--)
        {
            while(!s.isEmpty() && heights[s.peek()] >= heights[i] )
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                smallright[i] = heights.length;
            }
            else
            {
                smallright[i] = s.peek();
            }

            s.push(i);
        }
        int largeRectangle = 0;
        for(int i=0; i<heights.length; i++)
        {
            int height = heights[i];
            int width = smallright[i] -smallleft[i]-1;
            int currRectangle = height * width;
            largeRectangle = Math.max(currRectangle, largeRectangle);
        }

        return largeRectangle;

    }
    public int maximalRectangle(char[][] matrix) 
    {
        //finding length of row and column
         int n=matrix.length;
         int m=matrix[0].length;

        int[] currRow = new int[matrix[0].length];
        int max = 0;

        for(int i = 0; i < n; i++){

            for(int j = 0; j < m; j++){

                if(matrix[i][j] == '1')
                    currRow[j]++;
                else 
                    currRow[j] = 0;    
            }

            int currMax = largestRectangleArea(currRow);
            max = Math.max(max, currMax);

        }

        return max;
    }
}
