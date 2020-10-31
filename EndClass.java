
class Base{

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

class Derived1 extends Base{
	
	void sum()
	{
		System.out.println(geta()+getb());
	}
	
}


class Derived2 extends Base{
	
	void sub()
	{
		System.out.println(geta()-getb());
	}
	
}



class Derived3 extends Base{
	
	void mul()
	{
		System.out.println(geta()*getb());
	}
	
}


public class EndClass {
	
	public static void main(String[] args) {
		
		
		Derived1 d1=new Derived1(); d1.sum();
		Derived2 d2=new Derived2(); d2.sub();
		Derived3 d3=new Derived3(); d3.mul();
		
	}

}
