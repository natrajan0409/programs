package Test;

public class Factorialnumber {

	public static void main(String[] args) {
	  int fact=1;
	  int i;
	  int number=5;
	  
	  for(i=1;i<=number;i++)
	  {
		  fact =fact *i;
	  }
  
	   System.out.println("Factorial number " +fact);
	}

}
