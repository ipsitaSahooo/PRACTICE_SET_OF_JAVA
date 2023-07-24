package prePlacementClass;
import java.util.*;

//reset operation means convert 1/0 to 0
//set operation means convert 0/1 to 1
//Ex- n=10 , at pos=3 do set operation
//n=10 = 1010 
//here convert 3rd bit to 1
// i.e ans is 1110

public class SetBit {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int pos=s.nextInt();
		
		int mask=1<<(pos-1);
		
		int ans= n|mask;
		
		System.out.println(ans);
		

	}

}
