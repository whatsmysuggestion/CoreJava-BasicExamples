class First
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
class Second extends First
{
	void sum()
	{
		System.out.println(geta()+getb());
	}
}


class Third extends First
{
	void sub()
	{
		System.out.println(geta()-getb());
	}
}


public class Hie {

	public static void main(String[] args) {
		
		Second s=new Second(); 
		s.sum();
		
		Third t=new Third(); 
		t.sub();
			}
	 
}
