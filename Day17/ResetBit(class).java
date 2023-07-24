package prePlacementClass;
import java.util.*;

//Reset operation converts to 0
public class ReserBit {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int pos=s.nextInt();
		
		int mask=1<<(pos-1);
		int newMask=~(mask);
		
		int ans = n & newMask;
		
		System.out.println(ans);

	}

}
