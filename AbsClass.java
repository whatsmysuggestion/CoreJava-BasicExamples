interface Rule
{
 // comments 

}

interface Test extends Rule
{
	//this should display hello welcome
	 void display();
	 int a=10;
}
interface Test1 extends Test   
{
	//this should display hello welcome
	 void display1();
}
public class AbsClass implements Test1   {

	 
	public void display() {
		
		System.out.println("HELLO WELCOME"+a);
		
	}
	public void display1() {
		System.out.println("HELLO WELCOME1");
		
	}
	
	public static void main(String[] args) {
		AbsClass ac=new AbsClass();
		ac.display();
		ac.display1();
	}

	

}
