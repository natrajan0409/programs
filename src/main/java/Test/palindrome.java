package Test;

public class palindrome {

	public static void main(String[] args) {
		
		String Str ="Rajkumar";
		String str2 ="";
		
		for (int i=Str.length()-1;i>=0;i--)
		{
			str2= str2+Str.charAt(i);
		}
		
		if(Str.equals(str2)) {
			System.out.println("It is palindrom: "+str2);
			
		}
		else 
		{
			System.out.println("it is not  a palindrom: "+ str2);
		}

	}

}
