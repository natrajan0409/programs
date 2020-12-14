package Test;

public class duplicatenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 20, 30,30, 50, 4,30, 71,4,20,50, 100};
		  int arr1 = 0;  
		
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++)
				
			{
				
				if(arr[i]==arr[j])
				{
					
					System.out.println(arr[i]);
				
					
				}
			}
		}
		
		

	}
	}
