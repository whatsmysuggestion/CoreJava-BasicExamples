class TopClass
{
	
	int a,b;
	
	TopClass(int m,int n)
	{
		a=m;
		b=n;
		
		System.out.println(a+b);
	}
}
public class SuperConst extends TopClass {

	SuperConst()
	{
		
		super(10,20);
		System.out.println("Derived Class");
	}
	
	public static void main(String[] args) {
		 SuperConst st=new SuperConst();

	}

}
