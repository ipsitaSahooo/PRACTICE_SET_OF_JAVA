package prePlacementClass;
import java.util.*;

//update bit operation is the concept of both set and reset operation

public class UpdateBit 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int pos=s.nextInt();
		int choice=s.nextInt();//choice can be 0 or 1 i.e 1=reset and 0=set
		int ans;
		
		if(choice==1)
		{
			int mask=1<<(pos-1);
			int newMask=~(mask);
			ans = n & newMask;
		}
		else
		{
			int mask=1<<(pos-1);
			ans= n|mask;
		}
		
		System.out.println(ans);
	}

}
