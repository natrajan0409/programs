package Test;

public class stringrevesr {

	public static void main(String[] args) {
			
				String Str= "Rajkumar";
				String Str1 = "";
				
				for(int i=Str.length()-1;i>=0;i--)
				{
					
					Str1 =  Str1+Str.charAt(i);
					}
				System.out.println(Str1);	
	}

}
