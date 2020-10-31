
public class Simple {

	public static void main(String ... args) {

		/*int a;
		a=Integer.parseInt(args[0]);*/
		
	//	displayTable(10,20);
		Simple s=new Simple();
		s.shortCut("printer");
		
		
	}
	
	void shortCut(String s)
	{
		
		System.out.println(s.charAt(0)+""+(s.length()-2)+""+s.charAt(s.length()-1));
		
	}

	
	static void displayTable(int n,int v)
	{
		System.out.println(n+v);
	}
}
