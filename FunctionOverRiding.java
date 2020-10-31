
     class Demo
{
	         int geta()
	{
		return 10;
	}
}
public class FunctionOverRiding extends Demo {	
	
	  int geta() { 
		  
		        int a=100;  
		   a=200; 
		   return a;
		   
		   }
	 
	 	
	void display()
	{
		System.out.println(geta()+geta());
	}
	
	public static void main(String[] args) {
		FunctionOverRiding fr=new FunctionOverRiding();
		fr.display();

	}

}
