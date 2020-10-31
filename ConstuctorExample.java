class FirstClass
{
	int x,y,z;
	FirstClass(int a,int b,int c)
	{
		x=a;
		y=b;
		z=c;
		System.out.println(x+y+z);
		
	}
	
}
public class ConstuctorExample extends FirstClass {
	
	float m,n;
	
	ConstuctorExample(float m,float n)
	{	
		super(1,2,3);
		
		this.m=m;
		this.n=n;		
	}
	 
	public static void main(String[] args) {
 
		ConstuctorExample ce=new ConstuctorExample(10.1f,20.1f);
		System.out.println(ce.m+ce.n);		
		
	 
	}

}
