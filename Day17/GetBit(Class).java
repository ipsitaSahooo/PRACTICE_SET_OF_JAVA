package prePlacementClass;

public class Getbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=12;
		int pos=2;
		int mask=1<<(pos-1);//considering the lsb bit as first bit so we did pos-1
		
		int ans=n&mask;
		
		if(ans==0)
			System.out.println("pos bit is 0");
		else
			System.out.println("pos bit is 1");


	}

}
