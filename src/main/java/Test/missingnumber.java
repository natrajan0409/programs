package Test;

public class missingnumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total_num,expected_num_sum;
		 int num_sum = 0;
		   int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10,12};
		   total_num =12;
		     int srt =total_num%2;
		    System.out.println(srt);
		    
		   if(srt==0) {
			 
			   expected_num_sum = (total_num+1) * (total_num  / 2);
			   
		   }
		   else {
		    expected_num_sum = total_num * ((total_num + 1) / 2);
		   }
		  
		   for (int i: numbers) {
		    num_sum += i;
		    
		  
	}
		   System.out.println("expected_num_sum"+expected_num_sum);
		   System.out.println("num_sum"+num_sum);
		   System.out.println(  expected_num_sum - num_sum);
		  System.out.print("\n");

}
}
