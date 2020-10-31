class First2
{
	int getSal()
	{
		return 1000;
	}
}

class Second2 extends First2
{
	int deductions()
	{
		return getSal()-200;
	}
}



public class Multilevel1 extends Second2 {
	
	
	
	void getReport()
	{
		System.out.println("My Salary After Deductions is"+deductions());
	}

	public static void main(String[] args) {
		 
		Multilevel1 m1=new Multilevel1();
		m1.getReport();
	}

}
