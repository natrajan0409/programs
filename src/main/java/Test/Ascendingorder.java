package Test;

public class Ascendingorder {

	public static void main(String[] args) {
		int a[]= {64,65,76,34,78,90,34,54};
		int temp;
		
		for(int i=0;i<a.length;i++)
	
		{
			for(int j=i+1;j<a.length;j++)
			{
				
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}				
			}
			System.out.print(a[i]+ ",");
		}
		
		
	}

} 
