package Pratices;

class Paramaterconstructor  {
   int i ;
   String Str;
	   


	public Paramaterconstructor(int j, String string) {
	
		i =j;
		Str=string;
}   
	public static void main(String[] args) {
		
		Paramaterconstructor pc = new Paramaterconstructor (12547,"Natrajan");
		Paramaterconstructor pc1 = new Paramaterconstructor (1254788,"raj");
		 System.out.println(pc.i+" "+pc.Str);
		 System.out.println(pc1.i+" "+pc1.Str); 
		
		

	}

}
