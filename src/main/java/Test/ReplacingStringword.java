package Test;

public class ReplacingStringword {

	public static void main(String[] args) {
		String str="I am Santhosh";
		String split[]=str.split(" ");
		for(int i=split.length-1;i>=0;i--)
		{
			System.out.print(split[i]+" ");
		}

	}
	
	

}
