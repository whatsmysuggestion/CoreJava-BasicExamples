public class CopyConst {
int a,b;	
	public CopyConst(int a,int b) {
		this.a=a;
		this.b=b;		
	}	
	
	
	public CopyConst(CopyConst cc) {
		this.a=cc.a+1;
		this.b=cc.b+1;
			}
	
	
	
	public static void main(String[] args) {

		CopyConst cp=new CopyConst(10, 20);
		System.out.println(cp.a+cp.b);		
		
		CopyConst cp1=new CopyConst(cp);
		System.out.println(cp1.a+cp1.b);
		
		 
	}
}
