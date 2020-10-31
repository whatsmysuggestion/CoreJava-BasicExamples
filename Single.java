  class A
{
	   int geta()
	{
		int a=10;
		return a;
	}	
	int getb()
	{
		 int b=20;
		return b;
	}
}
public class Single extends A  {   	
 
 
	void sum()
	{
		System.out.println(geta()+getb());
	}	
	public static void main(String[] args) {
		 
		Single s=new Single();
		s.sum();
		
	}
	}
