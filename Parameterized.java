
public class Parameterized {

	
	int a,b;
	
	public Parameterized(int a,int b) {
		      this.a=a;
		     this.b=b;
	
	}	
		
	public static void main(String[] args) {
		 
		Parameterized dc=new Parameterized(10,20);
		System.out.println(dc.a+dc.b);
		
		
		Parameterized dc1=new Parameterized(100,200);
		System.out.println(dc1.a+dc1.b);
			
	}

}
