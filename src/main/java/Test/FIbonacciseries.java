package Test;

public class FIbonacciseries {

	public static void main(String[] args) {
		int n1=0,n2=1,n3;
		System.out.println(n1);
		System.out.println(n2);
		int count=10,i;
		
	     for(i=2;i<count;i++)
	     {
	    	 n3=n1+n2;
	    	 System.out.println(n3);
	    	 n1=n2;
	    	 n2=n3;
	     }
	

}
}

