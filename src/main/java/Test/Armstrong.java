package Test;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=15,c = 0,a;
		int temp=n;
		
		while(n>0)
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
			
		}
		if(temp==c)
		{
			System.out.println("is ARM"+c);
			
		}
		else {
			System.out.println("is not  ARM"+c);
			
		}
						
			
		}
		
		
	
}
