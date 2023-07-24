package prePlacementClass;
import java.util.*;

//QUES- count the no. of set bits i.e the no. of 1 in a given number.

//ANS- first do AND operation
//     then right shift by 1
//     do this unless you get the given number as 0
//     count the number of iterations

public class CountSetBits 
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	
	int count=0;
	while(n)//it will run till is non zero
	{
		count+=n&1;
		n=n>>1;
	}
	System.out.println(count);
  }
}
