package Test;

import java.util.HashSet;
import java.util.Set;

public class Duplicatestring {

	public static void main(String[] args) {
		
		String str= "natrajan";
		char[] ch =str.toCharArray();
		
		
		for(int i=0;i<ch.length;i++) {
			
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.print(ch[i]);
					
				}
				
			}
		}
		
	       
	       
	}

}
